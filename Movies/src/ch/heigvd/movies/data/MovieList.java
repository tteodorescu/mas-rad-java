package ch.heigvd.movies.data;

import java.util.Iterator;

public class MovieList extends StringSearchableArrayList<Movie> 
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
}
