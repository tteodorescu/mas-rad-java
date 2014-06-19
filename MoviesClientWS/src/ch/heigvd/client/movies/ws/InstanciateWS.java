
package ch.heigvd.client.movies.ws;

/*import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import javax.xml.namespace.QName;

import ch.heigvd.client.movies.ws.stub.*;

public class InstanciateWS {

	public static void main(String[] args)
	{
		MoviesWS port = null;
		
		try {
			MoviesWSService service = new MoviesWSService(
					new URL("http://localhost:8080/MoviesServer/movies?wsdl"), 
					new QName("http://ws.movies.heigvd.ch/", "MoviesWSService"));
				
			port = service.getMoviesWSPort();			
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		List<Actor> actors = port.getActors("", true);		
		for (Iterator<Actor> actor = actors.iterator(); actor.hasNext();)
		{
			
		}		
		
		System.exit(0);
	}
}*/