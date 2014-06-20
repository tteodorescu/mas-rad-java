package ch.heigvd.client.movies.android.common;

public class ActorAsyncTaskInfo extends AsyncTaskInfo{
	public ActorsLoadCallback callback;
		
	public ActorAsyncTaskInfo(ActorsLoadCallback callback, boolean isSample, long id)
	{ 
		super(isSample, id);
		this.callback = callback;
	}
	
	public ActorAsyncTaskInfo(ActorsLoadCallback callback, boolean isSample, String like)
	{ 
		super(isSample, like);		
		this.callback = callback;		
	}		
}
