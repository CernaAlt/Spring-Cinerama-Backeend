package com.devDJ.cinerma.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devDJ.cinerma.Entities.Movie;

public interface IMovieRepository extends JpaRepository<Movie,Long> {

}
