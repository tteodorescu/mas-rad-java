package ch.heigvd.client.movies.android.ws;

import ch.heigvd.client.movies.android.common.ActorsLoadCallback;
import ch.heigvd.client.movies.android.common.IWSMovieRepository;
import ch.heigvd.client.movies.android.common.MoviesLoadCallback;
import ch.heigvd.movies.data.*;
import ch.heigvd.movies.interfaces.IMovieRepository;

public class WSRepositoryFactory implements IWSMovieRepository 
{	
	static IWSMovieRepository repository = null;
 
	public static IMovieRepository getRepository()
	{
		if (repository == null)
		{
			Class<?> repositoryClass = null;
			try 
			{
				repositoryClass = Class.forName(
						"ch.heigvd.client.movies.android.ws.WSRepositoryFactory");

				repository = (IWSMovieRepository)repositoryClass.newInstance();
				
			} 
			catch (Exception e) 
			{				
				e.printStackTrace();
			}		
		}
				
		return repository;		
	}	
			
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
	public void getActorsAsync(String like, ActorsLoadCallback callback) 
	{ new RequestActorsTask().execute(callback); }

	@Override
	public void getMoviesAsync(String like, MoviesLoadCallback callback) 
	{ new RequestMoviesTask().execute(callback); }
}
