package ch.heigvd.client.movies.android.common;

public class MovieAsyncTaskInfo extends AsyncTaskInfo {
	public MoviesLoadCallback callback;
		
	public MovieAsyncTaskInfo(MoviesLoadCallback callback, boolean isSample, long id)
	{ 
		super(isSample, id);
		this.callback = callback;		
	}
	
	public MovieAsyncTaskInfo(MoviesLoadCallback callback, boolean isSample, String like)
	{ 
		super(isSample, like);		
		this.callback = callback;
	}	
}
