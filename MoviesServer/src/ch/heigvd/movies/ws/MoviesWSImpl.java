package ch.heigvd.movies.ws;

import javax.jws.WebService;

import ch.heigvd.movies.data.ActorList;
import ch.heigvd.movies.data.Movie;
import ch.heigvd.movies.data.MovieList;
import ch.heigvd.movies.interfaces.BasicMovieRepositories;
import ch.heigvd.movies.interfaces.RepositoryFactory;
import ch.heigvd.movies.interfaces.ServerMovieRepositories;

@WebService(
		portName="MoviesWSPort", 
		serviceName = "MoviesWSService", 
		targetNamespace="http://ch.heigvd.movies.ws/", 
		endpointInterface="ch.heigvd.movies.ws.MoviesWSInterface")
public class MoviesWSImpl implements MoviesWSInterface 
{		
	public MovieList getMovies(String partialTitle, boolean isSample) 
	{
		return (MovieList)RepositoryFactory.getRepository(
				isSample ? 
						BasicMovieRepositories.SAMPLE_REPOSITORY : 
						ServerMovieRepositories.WS_REPOSITORY).
							getMovies(partialTitle);
	}
	
	public ActorList getActors(String partialName, boolean isSample) 
	{	
		return (ActorList)RepositoryFactory.getRepository(
				isSample ? 
						BasicMovieRepositories.SAMPLE_REPOSITORY : 
						ServerMovieRepositories.WS_REPOSITORY).
							getActors(partialName);
	}
	
	public MovieList getAllMovies(boolean isSample) 
	{
		return (MovieList)RepositoryFactory.getRepository(
				isSample ? 
						BasicMovieRepositories.SAMPLE_REPOSITORY : 
						ServerMovieRepositories.WS_REPOSITORY).
							getMovies();
	}
	
	public ActorList getAllActors(boolean isSample) 
	{
		return (ActorList)RepositoryFactory.getRepository( 
						isSample ? 
								BasicMovieRepositories.SAMPLE_REPOSITORY : 
								ServerMovieRepositories.WS_REPOSITORY).
									getActors();
	}

	@Override
	public MovieList getMovie(Integer id, boolean isSample) {
		//as doing another pair of Soap objects at client's level requests time, get a list with an element 
		MovieList list = new MovieList(); 
				
		Movie movie = RepositoryFactory.getRepository( 
				isSample ? 
						BasicMovieRepositories.SAMPLE_REPOSITORY : 
						ServerMovieRepositories.WS_REPOSITORY).
							getMovie(id);
		list.add(movie);
		return list;
	}
}