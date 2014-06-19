package ch.heigvd.client.movies.android.ws;

import java.util.Hashtable;

import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;

import ch.heigvd.movies.data.Actor;

public class ActorSoapResponseObject extends Actor implements KvmSerializable
{	
	private static final class Properties
	{
		public static final String firstName = "firstName";
		public static final String lastName = "lastName";		
	}
		
	public ActorSoapResponseObject(){}

	public ActorSoapResponseObject(SoapObject soapObject)
	{
		try
		{
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
			case 0: return firstName;	
			case 1: return lastName;
		}
		
		return null;
	}

	@Override
	public int getPropertyCount() 
	{return 2;	}

	@Override
	public void getPropertyInfo(int index, 
			@SuppressWarnings("rawtypes") Hashtable properties, PropertyInfo info) 
	{
		switch(index)
		{
	        case 0:
	            info.type = PropertyInfo.STRING_CLASS;
	            info.name = Properties.firstName;
	            break;
	        case 1:
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
			case 0: firstName=(String)object; break;		
			case 1: lastName = (String)object; break;		
		}				
	}	
}
