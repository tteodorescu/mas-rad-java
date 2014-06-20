package ch.heigvd.client.movies.android.common;

public final class MovieRequests 
{	
	public static String get(MovieRequest request)
	{
		switch(request)
		{
			case Movie:
				return "getMovieRequest";
				
			case Movies:
				return "getMoviesRequest";
				
			case AllMovies:
				return "getAllMoviesRequest";
				
			case Actors:
				return "getActorsRequest";
				
			case AllActors:
				return "getAllActorsRequest";		
		}
		
		return "invalidRequest";		
	}	
}
