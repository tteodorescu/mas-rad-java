package ch.heigvd.movies.interfaces;

import ch.heigvd.movies.data.ActorList;
import ch.heigvd.movies.data.MovieList;

public interface IMovieRepository 
{
	ActorList getActors();
	MovieList getMovies();
	ActorList getActors(String like);
	MovieList getMovies(String like);	
}
