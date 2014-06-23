package ch.heigvd.client.movies.android.ws;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

import ch.heigvd.client.movies.android.common.ActorAsyncTaskInfo;
import ch.heigvd.client.movies.android.common.ActorsLoadCallback;
import ch.heigvd.movies.data.ActorList;
import android.os.AsyncTask;

public class RequestActorsTask extends AsyncTask<ActorAsyncTaskInfo, Integer, ActorList>
{ 
 	
    private static ActorsLoadCallback callback;
    
	@Override
	protected ActorList doInBackground(ActorAsyncTaskInfo... taskInfo) 
	{
		if (taskInfo == null)
			throw new NullPointerException("No async task information"); 
			
		callback = taskInfo[0].callback;		
		
		ActorListSoapRequestObject request = 
				new ActorListSoapRequestObject(
						taskInfo[0].isSample, taskInfo[0].like);
			
		android.os.Debug.waitForDebugger();		
		
		SoapSerializationEnvelope envelope = 
				taskInfo[0].id != -1 ?
						new ActorSoapSerializationEnvelope(SoapEnvelope.VER11, request) :
							taskInfo[0].like != null && taskInfo[0].like == "*" ?							
									new ActorsSoapSerializationEnvelope(SoapEnvelope.VER11, request) :
										new AllActorsSoapSerializationEnvelope(SoapEnvelope.VER11, request);
			
		ActorList actors = null;
		
	    try 
	    {
		   HttpTransportSE androidHttpTransport = 
				   new HttpTransportSE(MovieService.getWSDLAddress());
		   
		   androidHttpTransport.debug = true;
		   
		   androidHttpTransport.call(MovieService.SOAP_ACTION, envelope);

//		   String response = androidHttpTransport.responseDump;
		  
		   actors = (ActorList)envelope.getResponse();

  		}
	    catch (Exception e) 
		{
	    	e.printStackTrace();
		}	  	   
	    
	    return actors;
	}
	
	 // This is called each time you call publishProgress()
    protected void onProgressUpdate(Integer... progress) 
    {}

    // This is called when doInBackground() is finished
    protected void onPostExecute(ActorList result) 
    {	    
		callback.onActorsListLoaded(result);
    }	
}
