package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.enitties.MoviesDTO;
import com.example.service.MovieService;

@RestController
@RequestMapping(value = "/")
public class MoviesController {
	@Autowired
	MovieService movieService;
	@RequestMapping("/getAll")
	public List<MoviesDTO> getMovies() {
		return movieService.findAllMovies();
	}
	

}
