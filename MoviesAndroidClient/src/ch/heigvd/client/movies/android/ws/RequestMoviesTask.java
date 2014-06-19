package ch.heigvd.client.movies.android.ws;

import android.os.AsyncTask;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

import ch.heigvd.client.movies.android.common.MovieAsyncTaskInfo;
import ch.heigvd.client.movies.android.common.MoviesLoadCallback;
import ch.heigvd.movies.data.MovieList;

public class RequestMoviesTask extends AsyncTask<MovieAsyncTaskInfo, Integer, MovieList>
{  	
    private static MoviesLoadCallback callback;
    
	@Override
	protected MovieList doInBackground(MovieAsyncTaskInfo... taskInfo) 
	{
		if (taskInfo == null)
			throw new NullPointerException("No async task information"); 
			
		callback = taskInfo[0].callback;		
		boolean all = taskInfo[0].like == "*";
		
		MovieListSoapRequestObject request = 
				new MovieListSoapRequestObject(
						taskInfo[0].isSample, taskInfo[0].like);
		
		android.os.Debug.waitForDebugger();		
		
		SoapSerializationEnvelope envelope = 
				new SoapSerializationEnvelope(SoapEnvelope.VER11);
		
		envelope.setOutputSoapObject(request);
		
		envelope.addMapping(MovieService.NAMESPACE, 
				all ? "getAllMoviesResponse" : "getMoviesResponse", 
				new MovieListSoapResponseObject().getClass());
		
		envelope.addMapping(MovieService.NAMESPACE, "movie", 
				new MovieSoapResponseObject().getClass());
		
		envelope.addMapping(MovieService.NAMESPACE, 
				all ? "getAllActorsResponse" : "getActorsResponse", 
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
