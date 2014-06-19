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
			add(new Actor("Bruce", "Willis"));
			add(new Actor("Sylvester", "Stallone"));
			add(new Actor("Christopher", "Plummer"));
			add(new Actor("Roger", "Moore"));			
			add(new Actor("Kevin", "Bacon"));
			add(new Actor("Reese", "Whiterspoon"));
			add(new Actor("Clark", "Gable"));			
		}
	};
	
	private static final MovieList movieList = new MovieList()
	{
		private static final long serialVersionUID = 1L;
		{
			add(new Movie("A Beautiful Mind", 2000, actorList));
			add(new Movie("Closer", 2008, actorList));
			add(new Movie("Once Upon A Time", 1999, actorList));
			add(new Movie("Scarface", 1990, actorList));			
			add(new Movie("Dr House", 2008, actorList));
			add(new Movie("Desperate Housewives", 2007, actorList));
			add(new Movie("OSS 117", 2004, actorList));			
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
	{	
		return movieList;
//		return (MovieList)movieList.stream().
//				filter(movie -> movie.toString().equals(like));
	}
	
	@Override
	public ActorList getActors(String like)
	{
		return actorList;		
		//return (ActorList)actorList.stream().
			//	filter(actor -> actor.toString().equals(like));		
	}
}
