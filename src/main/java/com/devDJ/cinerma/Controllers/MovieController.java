package com.devDJ.cinerma.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.devDJ.cinerma.Entities.Movie;
import com.devDJ.cinerma.Repository.IMovieRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@CrossOrigin
@RestController
@RequestMapping("/v1/movies")
public class MovieController {

    // inyectar el repsitorio
    @Autowired
    private IMovieRepository movieRepository;

    @GetMapping("/pelicula")
    public List<Movie> getCities() {
        return movieRepository.findAll();
    }

    @GetMapping("/pelicula/{id}")
    public Movie getMovie(@PathVariable Long id) {
        return movieRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "movie not found"));
    }

    @PostMapping("/pelicula")
    public Movie inserMovie(@RequestBody Movie movie) {
       return movieRepository.save(movie);
    }

    @DeleteMapping("/pelicula/{id}")
    public void deleteMovie(@PathVariable long id){
        movieRepository.deleteById(id);
    }

    //actulizar data movie
    @PutMapping("/pelicula/{id}")
    public Movie updateMovie(@PathVariable Long id, @RequestBody Movie movie) {
        Optional<Movie> optionalMovie = movieRepository.findById(id);
        if (optionalMovie.isPresent()) {
            Movie existingMovie = optionalMovie.get();
            existingMovie.setTitle(movie.getTitle());
            existingMovie.setSinopsis(movie.getSinopsis());
            existingMovie.setDirector(movie.getDirector());
            existingMovie.setGenre(movie.getGenre());
            existingMovie.setDuration(movie.getDuration());
            existingMovie.setAge(movie.getAge());
            existingMovie.setClassification(movie.getClassification());
            existingMovie.setStatus(movie.getStatus());
            existingMovie.setLanguage(movie.getLanguage());
            existingMovie.setAvailable(movie.getAvailable());
            existingMovie.setDistribution(movie.getDistribution());
            existingMovie.setImageCard(movie.getImageCard());
            existingMovie.setImageDeails(movie.getImageDeails());
            existingMovie.setUrlTrailer(movie.getUrlTrailer());
            // Actualiza otras propiedades según sea necesario
            return movieRepository.save(existingMovie);
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Movie not found");
        }
    }
    
}
