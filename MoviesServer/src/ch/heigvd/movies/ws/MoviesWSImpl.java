package ch.heigvd.movies.ws;

import javax.jws.WebService;

import ch.heigvd.movies.data.ActorList;
import ch.heigvd.movies.data.MovieList;
import ch.heigvd.movies.interfaces.RepositoryFactory;

@WebService(
		portName="MoviesWSPort", 
		serviceName = "MoviesWSService", 
		targetNamespace="http://ch.heigvd.movies.ws/", 
		endpointInterface="ch.heigvd.movies.ws.MoviesWSInterface")
public class MoviesWSImpl implements MoviesWSInterface 
{
	public MovieList getMovies(String partialTitle, boolean isSample) 
	{
		if (isSample)
			return (MovieList)RepositoryFactory.getRepository().getMovies(partialTitle); 
		
		return null;
	}
	
	public ActorList getActors(String partialName, boolean isSample) 
	{	
		if (isSample)
			return (ActorList)RepositoryFactory.getRepository().getActors(partialName);
		
		return null;
	}
	
	public MovieList getAllMovies() 
	{
		return (MovieList)RepositoryFactory.getRepository().getMovies();
	}
	
	public ActorList getAllActors() 
	{
		return (ActorList)RepositoryFactory.getRepository().getActors();
	}
}
