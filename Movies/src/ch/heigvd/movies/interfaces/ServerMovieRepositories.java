package ch.heigvd.movies.interfaces;


public class ServerMovieRepositories extends BasicMovieRepositories {
	public static final String WS_REPOSITORY = 
			"ch.heigvd.client.movies.android.ws.WSRepository";	
	@SuppressWarnings("unused")
	private static final String IMDB_REPOSITORY = 
			"ch.heigvd.movies.ws.IMDBRepository";
}
