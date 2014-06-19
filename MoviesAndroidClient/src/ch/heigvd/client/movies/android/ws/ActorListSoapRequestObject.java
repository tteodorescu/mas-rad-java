package ch.heigvd.client.movies.android.ws;

import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;

public class ActorListSoapRequestObject extends SoapObject 
{
	private static final String ALL_METHOD_NAME = "getAllActors"; 
	private static final String METHOD_NAME = "geActors";
			
	public ActorListSoapRequestObject(boolean isSample, String like)
	{
		super(MovieService.NAMESPACE, 
				like == "*" ? ALL_METHOD_NAME : METHOD_NAME);
		
		PropertyInfo samplePropInfo = new PropertyInfo();
		samplePropInfo.name="isSample";
		samplePropInfo.type=PropertyInfo.BOOLEAN_CLASS;
		samplePropInfo.setValue(isSample);  
		
		addProperty(samplePropInfo);
		
		
		if (like != "*")
		{			
			PropertyInfo likePropInfo = new PropertyInfo();
			likePropInfo.name="like";
			likePropInfo.type=PropertyInfo.STRING_CLASS;
			samplePropInfo.setValue(like);
			
			addProperty(likePropInfo);			
		}
	}
}
