package ch.heigvd.movies.data;

import java.io.Serializable;
import java.util.Iterator;

public class ActorList extends StringSearchableArrayList<Actor> implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	public ActorList getActors(int... ids)
	{
		Iterator<Actor> iterator = iterator();
		ActorList actors = new ActorList(); 
		
		while(iterator.hasNext())
		{
			Actor actor = iterator.next(); 
			
			for (int i=0; i<ids.length; i++)
				if (actor.getID() == ids[i])
					actors.add(actor);
		}

		return actors;
	}
	
	@Override 
	public ActorList searchLike(String like)
	{ return (ActorList)super.searchLike(like);}
}
