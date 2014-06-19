package ch.heigvd.client.movies.android.ws;

import java.util.Hashtable;
import java.util.Vector;

import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;

import ch.heigvd.movies.data.ActorList;

public class ActorListSoapResponseObject extends Vector<ActorSoapResponseObject> implements KvmSerializable
{
	private static final long serialVersionUID = 2154100522901132210L;
 	private Vector<ActorSoapResponseObject> soapActors;
		
	public ActorListSoapResponseObject()
	{
		soapActors = new Vector<ActorSoapResponseObject>();	
	}
	
	public ActorListSoapResponseObject(Vector<ActorSoapResponseObject> actors)
	{
		soapActors = actors;
	}	
		
	@Override
	public Object getProperty(int index) 
	{ 
		ActorList actors = new ActorList();
		for(ActorSoapResponseObject actor : soapActors)
			actors.add(actor);
		
		return actors;
	}

	@Override
	public int getPropertyCount() 
	{ return 1; }

	@Override
	public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable properties, PropertyInfo info) 
	{
	    info.type = PropertyInfo.MULTI_REF;
		info.name="return";	    
	}

	@Override
	public void setProperty(int index, Object object) 
	{ 
		soapActors.add(new ActorSoapResponseObject((SoapObject)object));	
	}	
}
