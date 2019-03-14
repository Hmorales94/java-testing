package com.platzi.test.movies.service;

import com.platzi.test.movies.data.MovieRepository;
import com.platzi.test.movies.model.Genre;
import com.platzi.test.movies.model.Movie;
import org.hamcrest.CoreMatchers;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class MovieServiceShould {

    @Test
    public void findMoviesByGenre_comedy_comedyMovies() {

        MovieRepository movieRepository = Mockito.mock(MovieRepository.class);
        Mockito.when(movieRepository.findAll()).thenReturn(
                Arrays.asList(
                        new Movie(1,"Memento", 110, Genre.THRILLER),
                        new Movie(2,"Get Out", 115, Genre.HORROR),
                        new Movie(3,"Roma", 125, Genre.DRAMA),
                        new Movie(4,"Matrix", 128, Genre.ACTION),
                        new Movie(5,"Parent Trap", 109, Genre.COMEDY),
                        new Movie(6,"Slumdog Millionaire", 115, Genre.DRAMA),
                        new Movie(7,"Avengers: Endgame", 171, Genre.ACTION)
                )
        );

        MovieService movieService = new MovieService(movieRepository);
        Collection<Movie> movies =  movieService.findMoviesByGenre(Genre.COMEDY);

        List<Integer> moviesIds =  movies.stream().map(movie -> movie.getId()).collect(Collectors.toList());

        assertThat(moviesIds, CoreMatchers.is(Arrays.asList(5)));

    }
}