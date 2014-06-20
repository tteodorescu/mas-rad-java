package ch.heigvd.client.movies.android.ws;

public class ActorSoapSerializationEnvelope extends CustomSoapSerializationEnvelope{
	public ActorSoapSerializationEnvelope(int version, ActorListSoapRequestObject request) 
	{
		super(version, request);
		
		addMapping(MovieService.NAMESPACE, "getActorResponse", new MovieListSoapResponseObject().getClass());						
		addMapping(MovieService.NAMESPACE, "actor", new ActorSoapResponseObject().getClass());		
	}
}