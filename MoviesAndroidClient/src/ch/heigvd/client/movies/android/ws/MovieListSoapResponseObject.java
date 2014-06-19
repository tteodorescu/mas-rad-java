package ch.heigvd.client.movies.android.ws;

import java.util.Hashtable;
import java.util.Vector;

import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;

import ch.heigvd.movies.data.MovieList;

public class MovieListSoapResponseObject extends Vector<MovieSoapResponseObject> implements KvmSerializable
{
	private static final long serialVersionUID = 3185435877405416343L;
	private Vector<MovieSoapResponseObject> soapMovies = new Vector<MovieSoapResponseObject>();
		
	public MovieListSoapResponseObject()
	{
		soapMovies = new Vector<MovieSoapResponseObject>();
	}
	
	public MovieListSoapResponseObject(SoapObject object)
	{}	
		
	@Override
	public Object getProperty(int index) 
	{ 
		MovieList movies = new MovieList();
		for(MovieSoapResponseObject movie : soapMovies)
			movies.add(movie);
		
		return movies;
	}

	@Override
	public int getPropertyCount() 
	{ return 1; }

	@Override
	public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable properties, PropertyInfo info) 
	{
	    info.type = PropertyInfo.OBJECT_CLASS;
		info.name="return";	    
	}

	@Override
	public void setProperty(int index, Object object) 
	{ 
		soapMovies.add(new MovieSoapResponseObject((SoapObject)object));	
	}	
}
