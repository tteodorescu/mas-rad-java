
package ch.heigvd.movies.ws.jaxws;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import ch.heigvd.movies.data.Movie;

@XmlRootElement(name = "getAllMoviesResponse", namespace = "http://ch.heigvd.movies.ws/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAllMoviesResponse", namespace = "http://ch.heigvd.movies.ws/")
public class GetAllMoviesResponse {

    @XmlElement(name = "return", namespace = "")
    private ArrayList<Movie> _return;

    /**
     * 
     * @return
     *     returns ArrayList<Movie>
     */
    public ArrayList<Movie> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(ArrayList<Movie> _return) {
        this._return = _return;
    }

}
