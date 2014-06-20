package ch.heigvd.client.movies.android.ws;

import java.util.Hashtable;
import java.util.Vector;

import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;

import ch.heigvd.movies.data.Movie;

public class MovieSoapResponseObject extends Movie implements KvmSerializable
{	
	private static final long serialVersionUID = 5859254854437769640L;

	private static final class Properties
	{
		public static final String id = "id";		
		public static final String title = "title";
		public static final String year = "year";
		public static final String actors = "actors";		
	}

 	private Vector<ActorSoapResponseObject> soapActors = new Vector<ActorSoapResponseObject>();	
	
	public MovieSoapResponseObject(){}

	public MovieSoapResponseObject(SoapObject soapObject)
	{
		try
		{
	        if (soapObject.hasProperty(Properties.id))
	            title = soapObject.getProperty(Properties.id).toString();
	        
	        if (soapObject.hasProperty(Properties.title))
	            title = soapObject.getProperty(Properties.title).toString();
	
	        if (soapObject.hasProperty(Properties.year))
	            year = Integer.valueOf(soapObject.getProperty(Properties.year).toString());

	        if (soapObject.hasProperty(Properties.actors))
	        {
	        	int count = soapObject.getPropertyCount();
	        	for (int i=3; i<count; i++)
	        		soapActors.add(new ActorSoapResponseObject((SoapObject)soapObject.getProperty(i)));
	        }
		}
		catch(Exception ex)
		{}
    }	
		
	@Override
	public Object getProperty(int index) 
	{
		switch(index)
		{
			case 0: return id;		
			case 1: return title;
			case 2: return year;
			case 3: return soapActors;		
		}
		
		return null;
	}

	@Override
	public int getPropertyCount() 
	{return 4;	}

	@Override
	public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable properties, PropertyInfo info) 
	{
		switch(index)
		{
        	case 0:
        		info.type = PropertyInfo.INTEGER_CLASS;
        		info.name = Properties.id;
        		break;		
	        case 1:
	            info.type = PropertyInfo.STRING_CLASS;
	            info.name = Properties.title;
	            break;
	        case 2:
	            info.type = PropertyInfo.INTEGER_CLASS;
	            info.name = Properties.year;
	            break;		
	        case 3:
	            info.type = PropertyInfo.MULTI_REF;
	            info.name = Properties.actors;
		}		
	}

	@Override
	public void setProperty(int index, Object object) 
	{
		switch(index)
		{
			case 0: id=(Integer)object; break;		
			case 1: title=(String)object; break;		
			case 2: year = (Integer)object; break;		
			case 3: soapActors = (ActorListSoapResponseObject)object; break;
		}				
	}	
}
