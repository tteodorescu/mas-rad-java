
package ch.heigvd.client.movies.ws.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getAllMovies complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getAllMovies">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="isSample" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAllMovies", propOrder = {
    "isSample"
})
public class GetAllMovies {

    protected boolean isSample;

    /**
     * Gets the value of the isSample property.
     * 
     */
    public boolean isIsSample() {
        return isSample;
    }

    /**
     * Sets the value of the isSample property.
     * 
     */
    public void setIsSample(boolean value) {
        this.isSample = value;
    }

}
