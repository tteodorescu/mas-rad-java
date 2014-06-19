package ch.heigvd.movies.data;

import java.util.ArrayList;
import java.util.Collection;

public class ActorList extends ArrayList<Actor> 
{
	private static final long serialVersionUID = 1L;

	public ActorList() {
		// TODO Auto-generated constructor stub
	}

	public ActorList(int capacity) {
		super(capacity);
		// TODO Auto-generated constructor stub
	}

	public ActorList(Collection<Actor> collection) {
		super(collection);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean contains(Object o) 
	{
		if (o.getClass() == String.class)
		{
			String like = (String)o;
			
			if (like == "*")
				return true;
			
			for (Object movie : this)
				 if (movie.toString().contains(like))
					 return true;
			
			return false;
		}
			
		return super.contains(o);		
	}

}
