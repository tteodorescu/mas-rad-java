
package ch.heigvd.movies.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getAllActors", namespace = "http://ch.heigvd.movies.ws/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAllActors", namespace = "http://ch.heigvd.movies.ws/")
public class GetAllActors {

    @XmlElement(name = "isSample", namespace = "")
    private boolean isSample;

    /**
     * 
     * @return
     *     returns boolean
     */
    public boolean isIsSample() {
        return this.isSample;
    }

    /**
     * 
     * @param isSample
     *     the value for the isSample property
     */
    public void setIsSample(boolean isSample) {
        this.isSample = isSample;
    }

}
