package com.dxc.DxcAppdemo.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.dxc.DxcAppdemo.entity.Movie;

//JPARepository contains all the Database Actionable functions
//i.e Creating and Closing Connection, create, insert, update, delete

@Repository
//It will grant permission to spring boot container to talk to JpaRepository and access 
//all the functions in JpaRepository

public interface MovieDAO extends JpaRepository<Movie, Integer> 
{

}