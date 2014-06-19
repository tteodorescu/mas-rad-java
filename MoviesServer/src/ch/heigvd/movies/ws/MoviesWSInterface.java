package ch.heigvd.movies.ws;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import ch.heigvd.movies.data.Actor;
import ch.heigvd.movies.data.Movie;

@WebService(name="MoviesWS", targetNamespace = "http://ch.heigvd.movies.ws/")
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL)
public interface MoviesWSInterface 
{			
	@WebMethod(operationName = "getActors")	
	public ArrayList<Actor> getActors(
			@WebParam(name="partialName") String partialName, 
			@WebParam(name="isSample") boolean isSample);
		
	@WebMethod(operationName = "getMovies")
	public ArrayList<Movie> getMovies(
			@WebParam(name="partialTitle") String partialTitle, 
			@WebParam(name="isSample") boolean isSample);
			
	@WebMethod(operationName = "getAllActors")	
	public ArrayList<Actor> getAllActors();
		
	@WebMethod(operationName = "getAllMovies")
	public ArrayList<Movie> getAllMovies();	
}