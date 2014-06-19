package ch.heigvd.movies.data;

import java.util.ArrayList;
import java.util.Collection;

import ch.heigvd.movies.interfaces.IMovieData;

public class MovieList extends ArrayList<Movie> 
{
	private static final long serialVersionUID = 1L;

	public MovieList() {
		// TODO Auto-generated constructor stub
	}

	public MovieList(int capacity) {
		super(capacity);
		// TODO Auto-generated constructor stub
	}

	public MovieList(Collection<Movie> collection) {
		super(collection);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean contains(Object o) 
	{
		if (o.getClass() == String.class)
		{
			String like = (String)o;
			
			if (like == "*")
				return true;
			
			for (IMovieData movie : this)
				 if (movie.toString().contains(like))
					 return true;
			
			return false;
		}
				
		return super.contains(o);		
	}
}
