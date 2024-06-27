package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.enitties.Movies;

@Repository
public interface MoviesRepository extends JpaRepository<Movies, Long> {

}
