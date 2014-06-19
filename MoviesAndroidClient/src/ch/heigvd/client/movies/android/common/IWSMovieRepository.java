package ch.heigvd.client.movies.android.common;


import ch.heigvd.movies.interfaces.IMovieRepository;

public interface IWSMovieRepository extends IMovieRepository {
	void getActorsAsync(ActorAsyncTaskInfo info);
	void getMoviesAsync(MovieAsyncTaskInfo info);	
}
