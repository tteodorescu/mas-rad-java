package ch.heigvd.client.movies.android.ws;

public class AllMoviesSoapSerializationEnvelope extends MovieSoapSerializationEnvelope{
	public AllMoviesSoapSerializationEnvelope(int version, MovieListSoapRequestObject request) 
	{
		super(version, request);
		
		addMapping(MovieService.NAMESPACE, "getAllMoviesResponse", new MovieListSoapResponseObject().getClass());
	}
}