package ch.heigvd.movies.data;

import java.io.Serializable;
import java.util.Iterator;

public class MovieList extends StringSearchableArrayList<Movie> implements Serializable
{
	private static final long serialVersionUID = 1L;

	@Override 
	public MovieList searchLike(String like)
	{ return (MovieList)super.searchLike(like);}
	
	public Movie searchBy(Integer id)
	{
		Iterator<Movie> iterator = (Iterator<Movie>) iterator();
 		
		while(iterator.hasNext())
		{
			Movie item = iterator.next();
			if (item.getID() == id)
				return item;
		}
		
		return new Movie();
	}
	
	@Override
	public MovieList create()
	{ return new MovieList(); }	
}
