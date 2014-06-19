package ch.heigvd.client.movies.android.common;

public class MovieAsyncTaskInfo {
	public MoviesLoadCallback callback;
	public boolean isSample;
	public String like;
	
	public MovieAsyncTaskInfo()
	{ 
		isSample = true;
		like = "*";
	}
	
	public MovieAsyncTaskInfo(MoviesLoadCallback callback, boolean isSample, String like)
	{ 
		this.isSample = isSample;
		this.like = like;
		this.callback = callback;		
	}	
}
