package ch.heigvd.client.movies.android.common;

public abstract class AsyncTaskInfo {
	public boolean isSample;
	public String like;
	public long id;

	public AsyncTaskInfo()
	{ 
		isSample = true;
		like = "*";
		id=-1;
	}

	public AsyncTaskInfo(boolean isSample, long id)
	{ 
		this.isSample = isSample;
		this.like = "-1";		
		this.id = id;
	}

	public AsyncTaskInfo(boolean isSample, String like)
	{ 
		this.isSample = isSample;
		this.like = like;
		this.id = -1;		
	}			
}
