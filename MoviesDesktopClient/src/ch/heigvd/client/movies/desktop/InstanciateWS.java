package ch.heigvd.client.movies.desktop;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;

import ch.heigvd.client.movies.ws.stub.*;
import ch.heigvd.movies.data.ActorList;

/*
 * Movies desktop client test class. Use this as example for implementing Desktop applications 
 * using Movies SOAP web service
 * */
public class InstanciateWS 
{
	private static class WSInfo
	{
		public static final String URL = "http://localhost:8080/MoviesServer/movies?wsdl";
		public static final String NAMESPACE_URI = "http://ws.movies.heigvd.ch/";
		public static final String LOCALPART = "MoviesWSService";
	}
	 	
	public static void main(String[] args)
	{
		MoviesWS port = null;
		
		try 
		{
			MoviesWSService service = new MoviesWSService(
					new URL(WSInfo.URL), 
					new QName(WSInfo.NAMESPACE_URI, WSInfo.LOCALPART));
				
			port = service.getMoviesWSPort();			
			
		} 
		catch (MalformedURLException e) 
		{
			e.printStackTrace();
		}

		ActorList actorList = new ActorList();
		List<Actor> actors = port.getActors("", true);
		
		int count = actors.size();
		for (int i=0; i<count; i++)
		{
			Actor actor = (Actor)actors.get(i);
			actorList.add(new ch.heigvd.movies.data.Actor(
							actor.getId(),
							actor.getFirstName(), 
							actor.getLastName()));
			
			System.out.format("Actor: %s", actor.toString());
		}
		
		System.exit(0);
	}
}