package ch.heigvd.client.movies.android.ws;

public class AllActorsSoapSerializationEnvelope extends ActorSoapSerializationEnvelope{
		public AllActorsSoapSerializationEnvelope(int version, ActorListSoapRequestObject request) 
		{
			super(version, request);			
			addMapping(MovieService.NAMESPACE, "getAllActorsResponse", new MovieListSoapResponseObject().getClass());		
		}	
}
