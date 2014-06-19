package ch.heigvd.client.movies.android.common;

public class ActorAsyncTaskInfo {
	public ActorsLoadCallback callback;
	public boolean isSample;
	public String like;
	
	public ActorAsyncTaskInfo()
	{ 
		isSample = true;
		like = "*";
	}
	
	public ActorAsyncTaskInfo(ActorsLoadCallback callback, boolean isSample, String like)
	{ 
		this.isSample = isSample;
		this.like = like;
		this.callback = callback;		
	}		
}
