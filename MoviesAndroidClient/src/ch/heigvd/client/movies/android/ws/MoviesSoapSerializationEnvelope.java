package ch.heigvd.client.movies.android.ws;

import org.ksoap2.SoapFault;

public class MoviesSoapSerializationEnvelope extends MovieSoapSerializationEnvelope{
	public MoviesSoapSerializationEnvelope(int version, MovieListSoapRequestObject request) 
	{
		super(version, request);
		
		addMapping(MovieService.NAMESPACE, "getMoviesResponse", new MovieListSoapResponseObject().getClass());
	}
	
	@Override()
	public Object getResponse() throws SoapFault
	{
		return super.getResponse();
	}	
}
