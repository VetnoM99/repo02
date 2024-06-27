package com.example.enitties;

import java.util.List;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "MOVIES")
public class Movies {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	@Column(name = "title")
	String tittle;

	String description;

	@ManyToAny
	@JoinTable(name = "movies_directors",
	joinColumns = @JoinColumn(name = "movies_id"),
	inverseJoinColumns = @JoinColumn( name = "directors_id"))
	List<Directors> directorList;
	
//	@ManyToAny
//	@JoinTable(name = "movies_genres",
//	joinColumns = @JoinColumn(name = "directors_id"))
//	Generos genero;
//	
//	@ManyToAny
//	@JoinTable(name = "movies_stars",
//	joinColumns = @JoinColumn(name = "directors_id"))
//	Stars estrellas;
}
