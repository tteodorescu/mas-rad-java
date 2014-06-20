package ch.heigvd.client.movies.android.ws;

import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.SoapSerializationEnvelope;

public class CustomSoapSerializationEnvelope extends SoapSerializationEnvelope 
{
	public CustomSoapSerializationEnvelope(int version, KvmSerializable request) 
	{
		super(version);
		setOutputSoapObject(request);		
		dotNet = false;		
	}
}
