package ch.heigvd.client.movies.android.ws;

public class MovieService
{
    public static final String NAMESPACE = "http://ch.heigvd.movies.ws/";
    public static final String ADDRESS = "http://192.168.2.106:8080";
    public static final String URI = "/MoviesServer/MoviesWSService?WSDL";
    public static final String DEFAULT_URL = ADDRESS + URI; 
    public static final String SOAP_ACTION =  "\""+""+"\"";
    public static String CUSTOM_ADDRESS="";
    
    public static final String IMDB_SEARCH_URL = "http://www.imdb.com/search/";
    public static final String IMDB_SEARCH_URI = "title?title=";
    
    public static String getWSDLAddress()
    {
    	return CUSTOM_ADDRESS != null && CUSTOM_ADDRESS.length() > 0 ? 
    		CUSTOM_ADDRESS+URI : DEFAULT_URL;
    }
}
