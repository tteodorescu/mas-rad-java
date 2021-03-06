
package ch.heigvd.client.movies.ws.stub;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "MoviesWSService", targetNamespace = "http://ch.heigvd.movies.ws/", wsdlLocation = "file:/home/traian/Workspaces/eclipse-kepler/MoviesProject/MoviesServer/target/jaxws/wsgen/wsdl/MoviesWSService.wsdl")
public class MoviesWSService
    extends Service
{

    private final static URL MOVIESWSSERVICE_WSDL_LOCATION;
    private final static WebServiceException MOVIESWSSERVICE_EXCEPTION;
    private final static QName MOVIESWSSERVICE_QNAME = new QName("http://ch.heigvd.movies.ws/", "MoviesWSService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/home/traian/Workspaces/eclipse-kepler/MoviesProject/MoviesServer/target/jaxws/wsgen/wsdl/MoviesWSService.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MOVIESWSSERVICE_WSDL_LOCATION = url;
        MOVIESWSSERVICE_EXCEPTION = e;
    }

    public MoviesWSService() {
        super(__getWsdlLocation(), MOVIESWSSERVICE_QNAME);
    }

    public MoviesWSService(WebServiceFeature... features) {
        super(__getWsdlLocation(), MOVIESWSSERVICE_QNAME, features);
    }

    public MoviesWSService(URL wsdlLocation) {
        super(wsdlLocation, MOVIESWSSERVICE_QNAME);
    }

    public MoviesWSService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MOVIESWSSERVICE_QNAME, features);
    }

    public MoviesWSService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MoviesWSService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns MoviesWS
     */
    @WebEndpoint(name = "MoviesWSPort")
    public MoviesWS getMoviesWSPort() {
        return super.getPort(new QName("http://ch.heigvd.movies.ws/", "MoviesWSPort"), MoviesWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MoviesWS
     */
    @WebEndpoint(name = "MoviesWSPort")
    public MoviesWS getMoviesWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ch.heigvd.movies.ws/", "MoviesWSPort"), MoviesWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MOVIESWSSERVICE_EXCEPTION!= null) {
            throw MOVIESWSSERVICE_EXCEPTION;
        }
        return MOVIESWSSERVICE_WSDL_LOCATION;
    }

}
