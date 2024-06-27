package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.enitties.Movies;
import com.example.enitties.MoviesDTO;
import com.example.repository.MoviesRepository;

@Service
public class MovieService {

	@Autowired
	MoviesRepository moviesRepository;

	public List<MoviesDTO> findAllMovies() {
		List<Movies> movies = moviesRepository.findAll();
		List<MoviesDTO> moviesDTOlist = new ArrayList<>();
		ModelMapper modelMapper = new ModelMapper();
		movies.forEach(moviesElement -> {
			MoviesDTO moviesDTO = modelMapper.map(moviesElement, MoviesDTO.class);
			moviesDTOlist.add(moviesDTO);
		});
		return moviesDTOlist;
	}

}
