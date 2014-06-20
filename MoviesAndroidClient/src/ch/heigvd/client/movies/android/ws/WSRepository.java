package ch.heigvd.client.movies.android.ws;

import ch.heigvd.movies.data.*;
import ch.heigvd.client.movies.android.common.IWSMovieRepository;
import ch.heigvd.client.movies.android.common.ActorAsyncTaskInfo;
import ch.heigvd.client.movies.android.common.MovieAsyncTaskInfo;

public class WSRepository implements IWSMovieRepository 
{				
	@Override
	public ActorList getActors() 
	{  
		ActorList list = new ActorList();
		list.add(new Actor(1, "Use", "Async Methods"));
		return list;
	}

	@Override
	public ActorList getActors(String like) 
	{ return getActors(); }
	
	@Override
	public MovieList getMovies() 
	{ 
		MovieList list = new MovieList();
		list.add(new Movie(1, "Use Async Methods", 0, null));
		return list;
	}
		
	@Override
	public MovieList getMovies(String like) 
	{ return getMovies(); }

	@Override
	public Movie getMovie(Integer id) 
	{ return null; }	
	
	@Override
	public void getActorsAsync(ActorAsyncTaskInfo info) 
	{ new RequestActorsTask().execute(info); }

	@Override
	public void getMoviesAsync(MovieAsyncTaskInfo info) 
	{ new RequestMoviesTask().execute(info); }
}
