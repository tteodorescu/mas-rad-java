package ch.heigvd.client.movies.android.ws;

public abstract class MovieSoapSerializationEnvelope extends CustomSoapSerializationEnvelope{
	public MovieSoapSerializationEnvelope(int version, MovieListSoapRequestObject request) 
	{
		super(version, request);
		
		addMapping(MovieService.NAMESPACE, "movie", new MovieSoapResponseObject().getClass());
		addMapping(MovieService.NAMESPACE, "getActorsResponse", new ActorListSoapResponseObject().getClass());				
		addMapping(MovieService.NAMESPACE, "actor", new ActorSoapResponseObject().getClass());		
	}
}
