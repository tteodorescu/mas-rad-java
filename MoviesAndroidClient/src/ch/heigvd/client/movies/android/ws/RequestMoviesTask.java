package ch.heigvd.client.movies.android.ws;

import android.util.Log;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;
//import org.ksoap2.serialization.PropertyInfo;


import ch.heigvd.client.movies.android.common.MoviesLoadCallback;
import ch.heigvd.movies.data.MovieList;
import android.os.AsyncTask;

public class RequestMoviesTask extends AsyncTask<MoviesLoadCallback, Integer, MovieList>
{ 
    private static final String METHOD_NAME = "getAllMovies";
 	
    private static MoviesLoadCallback callback;
    
	@Override
	protected MovieList doInBackground(MoviesLoadCallback... params) 
	{
		callback = params[0];
		
		SoapObject request = new SoapObject(MovieService.NAMESPACE, METHOD_NAME);
		
		/*PropertyInfo propInfo=new PropertyInfo();
		propInfo.name="arg0";
		propInfo.type=PropertyInfo.STRING_CLASS;
		  
		request.addProperty(propInfo, "John Smith");*/		
	
		android.os.Debug.waitForDebugger();		
		
		SoapSerializationEnvelope envelope = 
				new SoapSerializationEnvelope(SoapEnvelope.VER11);
		
		envelope.setOutputSoapObject(request);
		
		envelope.addMapping(MovieService.NAMESPACE, "getAllMoviesResponse", 
				new MovieListSoapResponseObject().getClass());
		
		envelope.addMapping(MovieService.NAMESPACE, "movie", 
				new MovieSoapResponseObject().getClass());
		
		envelope.addMapping(MovieService.NAMESPACE, "getAllActorsResponse", 
				new ActorListSoapResponseObject().getClass());		
		
		envelope.addMapping(MovieService.NAMESPACE, "actor", 
				new ActorSoapResponseObject().getClass());
		
		envelope.dotNet = false;
	
		MovieList movies = null;
		
	    try 
	    {
		   HttpTransportSE androidHttpTransport = new HttpTransportSE(MovieService.URL);
		   androidHttpTransport.debug = true;
		   
		   androidHttpTransport.call(MovieService.SOAP_ACTION, envelope);

//		   String response = androidHttpTransport.responseDump;
	   
		   movies = (MovieList)envelope.getResponse();

  		}
	    catch (Exception e) 
		{
	    	e.printStackTrace();
		}	  	   
	    
	    return movies;
	}
	
	 // This is called each time you call publishProgress()
    protected void onProgressUpdate(Integer... progress) 
    {}

    // This is called when doInBackground() is finished
    protected void onPostExecute(MovieList movies) 
    {	    
		callback.onMoviesListLoaded(movies);
    }	
}
