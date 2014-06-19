
package ch.heigvd.client.movies.ws.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getActors complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getActors">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="partialName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "getActors", propOrder = {
    "partialName",
    "isSample"
})
public class GetActors {

    protected String partialName;
    protected boolean isSample;

    /**
     * Gets the value of the partialName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartialName() {
        return partialName;
    }

    /**
     * Sets the value of the partialName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartialName(String value) {
        this.partialName = value;
    }

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
