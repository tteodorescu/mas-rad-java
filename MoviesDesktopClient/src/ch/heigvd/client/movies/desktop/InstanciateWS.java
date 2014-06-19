package ch.heigvd.client.movies.desktop;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;

import ch.heigvd.client.movies.ws.stub.*;
import ch.heigvd.movies.data.ActorList;

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

		ActorList actorList = new ActorList();
		List<Actor> actors = port.getActors("", true);
		
		int count = actors.size();
		for (int i=0; i<count; i++)
			actorList.add(new ch.heigvd.movies.data.Actor(
					((Actor)actors.get(i)).getFirstName(), 
					((Actor)actors.get(i)).getLastName()));
		
		System.exit(0);
	}
}