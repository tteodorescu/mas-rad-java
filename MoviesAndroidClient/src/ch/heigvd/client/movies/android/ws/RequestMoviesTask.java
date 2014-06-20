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
		
		MovieListSoapRequestObject request = null;
		
		
		request = taskInfo[0].id == -1 ? 
				new MovieListSoapRequestObject(taskInfo[0].isSample, taskInfo[0].like):
				new MovieListSoapRequestObject(taskInfo[0].isSample, taskInfo[0].id);
		
		android.os.Debug.waitForDebugger();		
		
		SoapSerializationEnvelope envelope =
				taskInfo[0].id != -1 ?
						new OneMovieSoapSerializationEnvelope(SoapEnvelope.VER11, request) :
							taskInfo[0].like != null && taskInfo[0].like == "*" ?									
						new AllMoviesSoapSerializationEnvelope(SoapEnvelope.VER11, request) :
					    new MoviesSoapSerializationEnvelope(SoapEnvelope.VER11, request);							;
			
		MovieList movies = null;
		
	    try 
	    {
		   HttpTransportSE androidHttpTransport = new HttpTransportSE(MovieService.URL);
		   androidHttpTransport.debug = true;
		   
		   androidHttpTransport.call(MovieService.SOAP_ACTION, envelope);
	   
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
    { callback.onMoviesListLoaded(movies != null ? movies : new MovieList());}    
}
