
package ch.heigvd.movies.ws.jaxws;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import ch.heigvd.movies.data.Actor;

@XmlRootElement(name = "getActorsResponse", namespace = "http://ch.heigvd.movies.ws/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getActorsResponse", namespace = "http://ch.heigvd.movies.ws/")
public class GetActorsResponse {

    @XmlElement(name = "return", namespace = "")
    private ArrayList<Actor> _return;

    /**
     * 
     * @return
     *     returns ArrayList<Actor>
     */
    public ArrayList<Actor> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(ArrayList<Actor> _return) {
        this._return = _return;
    }

}
