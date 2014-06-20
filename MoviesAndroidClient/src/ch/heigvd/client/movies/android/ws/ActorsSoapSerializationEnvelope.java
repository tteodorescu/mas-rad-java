package ch.heigvd.client.movies.android.ws;

public class ActorsSoapSerializationEnvelope extends ActorSoapSerializationEnvelope{
	public ActorsSoapSerializationEnvelope(int version, ActorListSoapRequestObject request) 
	{
		super(version, request);
		
		addMapping(MovieService.NAMESPACE, "getActorsResponse", new MovieListSoapResponseObject().getClass());		
	}
}