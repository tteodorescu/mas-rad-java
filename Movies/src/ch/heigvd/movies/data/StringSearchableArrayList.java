package ch.heigvd.movies.data;

import java.util.ArrayList;
import java.util.Iterator;

public class StringSearchableArrayList<T> extends ArrayList<T>
{
	private static final long serialVersionUID = -8909527282537944205L;

	public StringSearchableArrayList<T> searchLike(String like)
	{
		if (like == "*")
			return this;
		
		Iterator<T> iterator = (Iterator<T>) iterator();
		StringSearchableArrayList<T> list = new StringSearchableArrayList<T>(); 
		
		while(iterator.hasNext())
		{
			T item = iterator.next();
			if (item.toString().contains(like))
				list.add(item);				
		}
		
		return list; 
	}	
	
	@Override
	public boolean contains(Object o) 
	{
		if (o.getClass() == String.class)
		{
			String like = (String)o;
			
			if (like == "*")
				return true;
			
			for (Object item : this)
				 if (item.toString().contains(like))
					 return true;
			
			return false;
		}
			
		return super.contains(o);		
	}	
}