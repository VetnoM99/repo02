drop database if exists ejercicio4;
create database if not exists ejercicio4;
use ejercicio4;
CREATE TABLE IF NOT EXISTS album (
  id_Album INT UNSIGNED NOT NULL AUTO_INCREMENT primary key,
  albumName VARCHAR(255) NOT NULL,
  dateReleased DATETIME NULL DEFAULT NULL
);

CREATE TABLE IF NOT EXISTS artist (
  Artist_ID INT UNSIGNED NOT NULL AUTO_INCREMENT primary key,
  ArtistName VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS genero (
  id_genero INT UNSIGNED NOT NULL AUTO_INCREMENT primary key,
  genero VARCHAR(255) NOT NULL
);

INSERT INTO ejercicio4.genero(genero) VALUES 
('Rock'),
('Pop'),
('Hip Hop'),
('Electrónica'),
('Jazz'),
('Reggae'),
('Clásica'),
('R&B'),
('Funk'),
('Reggaeton');

INSERT INTO ejercicio4.album(albumName) VALUES 
('Thriller'),
('Abbey Road'),
('Dark Side of the Moon'),
('Rumours'),
('Back in Black'),
('The Eminem Show'),
('21'),
('Blackst'),
('1989'),
('Random Access Memories');

select * from ejercicio4.album;


