package ch.heigvd.movies.interfaces;

import ch.heigvd.movies.data.ActorList;
import ch.heigvd.movies.data.Movie;
import ch.heigvd.movies.data.MovieList;

public interface IMovieRepository 
{
	Movie getMovie(Integer id);	
	ActorList getActors();
	MovieList getMovies();
	ActorList getActors(String like);
	MovieList getMovies(String like);	
}
