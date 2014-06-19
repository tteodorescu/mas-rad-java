package ch.heigvd.movies.data;

public class MovieList extends StringSearchableArrayList<Movie> 
{
	private static final long serialVersionUID = 1L;

	@Override 
	public MovieList searchLike(String like)
	{ return (MovieList)super.searchLike(like);}	
}
