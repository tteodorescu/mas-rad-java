package ch.heigvd.client.movies.android.common;


import ch.heigvd.movies.interfaces.IMovieRepository;

public interface IWSMovieRepository extends IMovieRepository {
	void getActorsAsync(String like, ActorsLoadCallback callback);
	void getMoviesAsync(String like, MoviesLoadCallback callback);	
}
