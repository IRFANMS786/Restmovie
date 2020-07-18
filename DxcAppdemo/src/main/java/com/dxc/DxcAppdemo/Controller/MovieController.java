package com.dxc.DxcAppdemo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.DxcAppdemo.entity.Movie;
import com.dxc.DxcAppdemo.service.MovieSerivce;

@RestController
@RequestMapping("/movie")
public class MovieController 
{
	@Autowired
	MovieSerivce movieservice;

	// http://localhost:8563/movie/all
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<Movie> getAllMovie() 
	{
		return this.movieservice.getAllMovies();
	}

	// http://localhost:8563/movie/addMovie
	@RequestMapping(value = "/addMovie", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Movie addEmployee(@RequestBody Movie movie) 
	{
		return this.movieservice.addEmployee(movie);
	}

	// http://localhost:8563/movie/updateMovie
	@RequestMapping(value = "/updateEmployee", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Movie updateMovie(@RequestBody Movie movie) 
	{
		return this.movieservice.updatemovie(movie);
	}

	// http://localhost:8563/movie/1
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Optional<Movie> getMovie(@PathVariable int id)
	{
		return this.movieservice.getMovieById(id);
	}

	// http://localhost:8563/movie/all
	@RequestMapping(value = "/all", method = RequestMethod.DELETE)
	public void deleteAllMovies() 
	{
		this.movieservice.deleteAllMovies();
	}

	// http://localhost:8563/movie/1
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteMovie(@PathVariable int id) 
	{
		this.movieservice.deleteMovieById(id);
	}}