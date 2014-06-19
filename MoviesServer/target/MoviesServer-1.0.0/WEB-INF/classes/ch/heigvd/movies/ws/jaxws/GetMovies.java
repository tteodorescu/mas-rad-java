
package ch.heigvd.movies.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getMovies", namespace = "http://ch.heigvd.movies.ws/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMovies", namespace = "http://ch.heigvd.movies.ws/", propOrder = {
    "partialTitle",
    "isSample"
})
public class GetMovies {

    @XmlElement(name = "partialTitle", namespace = "")
    private String partialTitle;
    @XmlElement(name = "isSample", namespace = "")
    private boolean isSample;

    /**
     * 
     * @return
     *     returns String
     */
    public String getPartialTitle() {
        return this.partialTitle;
    }

    /**
     * 
     * @param partialTitle
     *     the value for the partialTitle property
     */
    public void setPartialTitle(String partialTitle) {
        this.partialTitle = partialTitle;
    }

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
