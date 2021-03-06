
package ch.heigvd.client.movies.ws.stub;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "MoviesWS", targetNamespace = "http://ch.heigvd.movies.ws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MoviesWS {


    /**
     * 
     * @param isSample
     * @param like
     * @return
     *     returns java.util.List<ch.heigvd.client.movies.ws.stub.Movie>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getMovies", targetNamespace = "http://ch.heigvd.movies.ws/", className = "ch.heigvd.client.movies.ws.stub.GetMovies")
    @ResponseWrapper(localName = "getMoviesResponse", targetNamespace = "http://ch.heigvd.movies.ws/", className = "ch.heigvd.client.movies.ws.stub.GetMoviesResponse")
    public List<Movie> getMovies(
        @WebParam(name = "like", targetNamespace = "")
        String like,
        @WebParam(name = "isSample", targetNamespace = "")
        boolean isSample);

    /**
     * 
     * @param isSample
     * @param like
     * @return
     *     returns java.util.List<ch.heigvd.client.movies.ws.stub.Actor>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getActors", targetNamespace = "http://ch.heigvd.movies.ws/", className = "ch.heigvd.client.movies.ws.stub.GetActors")
    @ResponseWrapper(localName = "getActorsResponse", targetNamespace = "http://ch.heigvd.movies.ws/", className = "ch.heigvd.client.movies.ws.stub.GetActorsResponse")
    public List<Actor> getActors(
        @WebParam(name = "like", targetNamespace = "")
        String like,
        @WebParam(name = "isSample", targetNamespace = "")
        boolean isSample);

    /**
     * 
     * @param isSample
     * @return
     *     returns java.util.List<ch.heigvd.client.movies.ws.stub.Movie>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllMovies", targetNamespace = "http://ch.heigvd.movies.ws/", className = "ch.heigvd.client.movies.ws.stub.GetAllMovies")
    @ResponseWrapper(localName = "getAllMoviesResponse", targetNamespace = "http://ch.heigvd.movies.ws/", className = "ch.heigvd.client.movies.ws.stub.GetAllMoviesResponse")
    public List<Movie> getAllMovies(
        @WebParam(name = "isSample", targetNamespace = "")
        boolean isSample);

    /**
     * 
     * @param isSample
     * @return
     *     returns java.util.List<ch.heigvd.client.movies.ws.stub.Actor>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllActors", targetNamespace = "http://ch.heigvd.movies.ws/", className = "ch.heigvd.client.movies.ws.stub.GetAllActors")
    @ResponseWrapper(localName = "getAllActorsResponse", targetNamespace = "http://ch.heigvd.movies.ws/", className = "ch.heigvd.client.movies.ws.stub.GetAllActorsResponse")
    public List<Actor> getAllActors(
        @WebParam(name = "isSample", targetNamespace = "")
        boolean isSample);

    /**
     * 
     * @param id
     * @param isSample
     * @return
     *     returns java.util.List<ch.heigvd.client.movies.ws.stub.Movie>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getMovie", targetNamespace = "http://ch.heigvd.movies.ws/", className = "ch.heigvd.client.movies.ws.stub.GetMovie")
    @ResponseWrapper(localName = "getMovieResponse", targetNamespace = "http://ch.heigvd.movies.ws/", className = "ch.heigvd.client.movies.ws.stub.GetMovieResponse")
    public List<Movie> getMovie(
        @WebParam(name = "id", targetNamespace = "")
        Integer id,
        @WebParam(name = "isSample", targetNamespace = "")
        boolean isSample);

}
