package ch.heigvd.client.movies.android.ws;

import ch.heigvd.movies.data.*;

import ch.heigvd.client.movies.android.common.IWSMovieRepository;

import ch.heigvd.client.movies.android.common.ActorAsyncTaskInfo;
import ch.heigvd.client.movies.android.common.MovieAsyncTaskInfo;

public class WSRepository implements IWSMovieRepository 
{				
	@Override
	public ActorList getActors() 
	{ return null;	}

	@Override
	public ActorList getActors(String like) 
	{ return null;}

	@Override
	public MovieList getMovies() 
	{
		return null;
	}
		
	@Override
	public MovieList getMovies(String like) 
	{
		return null;
	}

	@Override
	public void getActorsAsync(ActorAsyncTaskInfo info) 
	{ new RequestActorsTask().execute(info); }

	@Override
	public void getMoviesAsync(MovieAsyncTaskInfo info) 
	{ new RequestMoviesTask().execute(info); }
}
