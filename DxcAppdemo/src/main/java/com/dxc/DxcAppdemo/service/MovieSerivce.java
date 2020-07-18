package com.dxc.DxcAppdemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.DxcAppdemo.dao.MovieDAO;
import com.dxc.DxcAppdemo.entity.Movie;

@Service
public class MovieSerivce 
{
	@Autowired
	MovieDAO movieDao;

	public List<Movie> getAllMovies() 
	{
		return this.movieDao.findAll();
	}

	public Movie addEmployee(Movie movie) 
	{
		return this.movieDao.save(movie);
	}

	// Optional is a Container object which may or may not contain non null values.
	public Optional <Movie> getMovieById(int id ) 
	{
		return this.movieDao.findById(id);
	}

	public Movie updatemovie(Movie movie) 
	{
		return this.movieDao.save(movie);
	}

	public void deleteMovieById(int id) 
	{
		this.movieDao.deleteById(id);
	}

	public void deleteAllMovies() 
	{
		this.movieDao.deleteAll();
	}
}