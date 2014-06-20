package ch.heigvd.client.movies.android.ws;

public class OneMovieSoapSerializationEnvelope extends MovieSoapSerializationEnvelope{
	public OneMovieSoapSerializationEnvelope(int version, MovieListSoapRequestObject request) 
	{
		super(version, request);
		
		addMapping(MovieService.NAMESPACE, "getMovieResponse", new MovieListSoapResponseObject().getClass());
	}
}
