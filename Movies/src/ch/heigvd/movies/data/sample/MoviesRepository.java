package ch.heigvd.movies.data.sample;

import ch.heigvd.movies.data.*;
import ch.heigvd.movies.interfaces.IMovieRepository;

public final class MoviesRepository implements IMovieRepository
{
	public MoviesRepository()
	{}	
	
	private static ActorList actorList = new ActorList()
	{
		private static final long serialVersionUID = 1L;
		{
			add(new Actor(1, "Jack", "Nicholson"));
			add(new Actor(2, "Denzel", "Washington"));
			add(new Actor(3, "Eva", "Green"));
			add(new Actor(4, "Aaron", "Paul"));			
			add(new Actor(5, "Ben", "Kingsley"));
			add(new Actor(6, "Helen", "Hunt"));
			add(new Actor(7, "Jennifer", "Lawrence"));			
			add(new Actor(8, "Catherine", "Zeta-Jones"));
			add(new Actor(9, "Tom", "Hanks"));			
			add(new Actor(10, "Ben", "Affleck"));
			add(new Actor(11, "Morgan", "Freeman"));			
			add(new Actor(12 ,"Robert", "Sean-Leonard"));
			add(new Actor(13, "Hugh", "Laurie"));
		}
	};
	
	private static final MovieList movieList = new MovieList()
	{
		private static final long serialVersionUID = 1L;
		{
			add(new Movie(1, "As Good As It Gets", 1997, actorList.getActors(1, 6)));
			add(new Movie(2, "Gandhi", 1982, actorList.getActors(5)));
			add(new Movie(3, "Hunger Games", 2013, actorList.getActors(7)));			
			add(new Movie(4, "House M.D.", 2004, actorList.getActors(13)));
			add(new Movie(5, "The Terminal", 2007, actorList.getActors(1, 6)));
			add(new Movie(6, "The Sum of All Fears", 2002, actorList.getActors(10, 11)));
			add(new Movie(7, "Breaking Bad", 2008, actorList.getActors(4)));			
			add(new Movie(8, "The Pelican Brief", 1993, actorList.getActors(2)));			
			add(new Movie(9, "Kingdom of Heaven", 1993, actorList.getActors(3)));			
			add(new Movie(10, "A few Good Men", 1992, actorList.getActors(1)));			
		}
	};	
		
	@Override
	public MovieList getMovies()
	{ return getMovies("*");	}
	
	@Override
	public ActorList getActors()
	{ return getActors("*");	}
	
	@Override
	public MovieList getMovies(String like)
	{ return movieList.searchLike(like); }
	
	@Override
	public ActorList getActors(String like)
	{ return actorList.searchLike(like); }

	@Override
	public Movie getMovie(Integer id) 
	{return movieList.searchBy(id);}
}
