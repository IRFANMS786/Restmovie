package com.dxc.DxcAppdemo.entity;

import javax.persistence.*;

@Entity
@Table(name="movieinfo")
public class Movie {
	@Column(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name = "name", nullable = true, length = 255)
	private String name;

	@Column(name = "rating", nullable = true, length = 255)
	private String rating;

	@Column(name = "catagory", nullable = true, length = 255)
	private String catagory;

	@Column(name = "type", nullable = true, length = 255)
	private String type;

	@Column(name = "duration", nullable = true)
	private Float duration;

	public Movie(Integer id, String name, String rating, String catagory, String type, Float duration) {
		super();
		this.id = id;
		this.name = name;
		this.rating = rating;
		this.catagory = catagory;
		this.type = type;
		this.duration = duration;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getCatagory() {
		return catagory;
	}

	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Float getDuration() {
		return duration;
	}

	public void setDuration(Float duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", rating=" + rating + ", catagory=" + catagory + ", type=" + type
				+ ", duration=" + duration + "]";
	}}
