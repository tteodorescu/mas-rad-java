
package ch.heigvd.client.movies.ws.stub;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ch.heigvd.client.movies.ws.stub package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetAllMoviesResponse_QNAME = new QName("http://ch.heigvd.movies.ws/", "getAllMoviesResponse");
    private final static QName _GetMoviesResponse_QNAME = new QName("http://ch.heigvd.movies.ws/", "getMoviesResponse");
    private final static QName _GetAllActors_QNAME = new QName("http://ch.heigvd.movies.ws/", "getAllActors");
    private final static QName _GetAllActorsResponse_QNAME = new QName("http://ch.heigvd.movies.ws/", "getAllActorsResponse");
    private final static QName _GetActorsResponse_QNAME = new QName("http://ch.heigvd.movies.ws/", "getActorsResponse");
    private final static QName _GetMovies_QNAME = new QName("http://ch.heigvd.movies.ws/", "getMovies");
    private final static QName _GetActors_QNAME = new QName("http://ch.heigvd.movies.ws/", "getActors");
    private final static QName _GetAllMovies_QNAME = new QName("http://ch.heigvd.movies.ws/", "getAllMovies");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ch.heigvd.client.movies.ws.stub
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetMovies }
     * 
     */
    public GetMovies createGetMovies() {
        return new GetMovies();
    }

    /**
     * Create an instance of {@link GetActorsResponse }
     * 
     */
    public GetActorsResponse createGetActorsResponse() {
        return new GetActorsResponse();
    }

    /**
     * Create an instance of {@link GetAllMovies }
     * 
     */
    public GetAllMovies createGetAllMovies() {
        return new GetAllMovies();
    }

    /**
     * Create an instance of {@link GetActors }
     * 
     */
    public GetActors createGetActors() {
        return new GetActors();
    }

    /**
     * Create an instance of {@link GetMoviesResponse }
     * 
     */
    public GetMoviesResponse createGetMoviesResponse() {
        return new GetMoviesResponse();
    }

    /**
     * Create an instance of {@link GetAllMoviesResponse }
     * 
     */
    public GetAllMoviesResponse createGetAllMoviesResponse() {
        return new GetAllMoviesResponse();
    }

    /**
     * Create an instance of {@link GetAllActorsResponse }
     * 
     */
    public GetAllActorsResponse createGetAllActorsResponse() {
        return new GetAllActorsResponse();
    }

    /**
     * Create an instance of {@link GetAllActors }
     * 
     */
    public GetAllActors createGetAllActors() {
        return new GetAllActors();
    }

    /**
     * Create an instance of {@link Movie }
     * 
     */
    public Movie createMovie() {
        return new Movie();
    }

    /**
     * Create an instance of {@link Actor }
     * 
     */
    public Actor createActor() {
        return new Actor();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllMoviesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ch.heigvd.movies.ws/", name = "getAllMoviesResponse")
    public JAXBElement<GetAllMoviesResponse> createGetAllMoviesResponse(GetAllMoviesResponse value) {
        return new JAXBElement<GetAllMoviesResponse>(_GetAllMoviesResponse_QNAME, GetAllMoviesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMoviesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ch.heigvd.movies.ws/", name = "getMoviesResponse")
    public JAXBElement<GetMoviesResponse> createGetMoviesResponse(GetMoviesResponse value) {
        return new JAXBElement<GetMoviesResponse>(_GetMoviesResponse_QNAME, GetMoviesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllActors }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ch.heigvd.movies.ws/", name = "getAllActors")
    public JAXBElement<GetAllActors> createGetAllActors(GetAllActors value) {
        return new JAXBElement<GetAllActors>(_GetAllActors_QNAME, GetAllActors.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllActorsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ch.heigvd.movies.ws/", name = "getAllActorsResponse")
    public JAXBElement<GetAllActorsResponse> createGetAllActorsResponse(GetAllActorsResponse value) {
        return new JAXBElement<GetAllActorsResponse>(_GetAllActorsResponse_QNAME, GetAllActorsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetActorsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ch.heigvd.movies.ws/", name = "getActorsResponse")
    public JAXBElement<GetActorsResponse> createGetActorsResponse(GetActorsResponse value) {
        return new JAXBElement<GetActorsResponse>(_GetActorsResponse_QNAME, GetActorsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMovies }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ch.heigvd.movies.ws/", name = "getMovies")
    public JAXBElement<GetMovies> createGetMovies(GetMovies value) {
        return new JAXBElement<GetMovies>(_GetMovies_QNAME, GetMovies.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetActors }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ch.heigvd.movies.ws/", name = "getActors")
    public JAXBElement<GetActors> createGetActors(GetActors value) {
        return new JAXBElement<GetActors>(_GetActors_QNAME, GetActors.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllMovies }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ch.heigvd.movies.ws/", name = "getAllMovies")
    public JAXBElement<GetAllMovies> createGetAllMovies(GetAllMovies value) {
        return new JAXBElement<GetAllMovies>(_GetAllMovies_QNAME, GetAllMovies.class, null, value);
    }

}
