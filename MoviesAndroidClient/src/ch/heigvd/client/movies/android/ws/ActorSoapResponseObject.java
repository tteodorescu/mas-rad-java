package ch.heigvd.client.movies.android.ws;

import java.util.Hashtable;

import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;

import ch.heigvd.movies.data.Actor;

public class ActorSoapResponseObject extends Actor implements KvmSerializable
{	
	private static final long serialVersionUID = -4928916143884058762L;

	private static final class Properties
	{
		public static final String id = "id";		
		public static final String firstName = "firstName";
		public static final String lastName = "lastName";				
	}
		
	public ActorSoapResponseObject(){}

	public ActorSoapResponseObject(SoapObject soapObject)
	{
		try
		{
	        if (soapObject.hasProperty(Properties.id))
	            id = Integer.parseInt(soapObject.getProperty(Properties.id).toString());
	        
	        if (soapObject.hasProperty(Properties.firstName))
	            firstName = soapObject.getProperty(Properties.firstName).toString();
	
	        if (soapObject.hasProperty(Properties.lastName))
	            lastName = soapObject.getProperty(Properties.lastName).toString();
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
			case 1: return firstName;	
			case 2: return lastName;
		}
		
		return null;
	}

	@Override
	public int getPropertyCount() 
	{return 3;	}

	@Override
	public void getPropertyInfo(int index, 
			@SuppressWarnings("rawtypes") Hashtable properties, PropertyInfo info) 
	{
		switch(index)
		{
        	case 0:
        		info.type = PropertyInfo.INTEGER_CLASS;
        		info.name = Properties.firstName;
        		break;		
	        case 1:
	            info.type = PropertyInfo.STRING_CLASS;
	            info.name = Properties.firstName;
	            break;
	        case 2:
	            info.type = PropertyInfo.STRING_CLASS;
	            info.name = Properties.lastName;
	            break;
		}
	}

	@Override
	public void setProperty(int index, Object object) 
	{
		switch(index)
		{
			case 0: id=(Integer)object; break;		
			case 1: firstName=(String)object; break;		
			case 2: lastName = (String)object; break;		
		}				
	}	
}
