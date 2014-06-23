
package ch.heigvd.movies.ws.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getMovies", namespace = "http://ch.heigvd.movies.ws/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMovies", namespace = "http://ch.heigvd.movies.ws/", propOrder = {
    "like",
    "isSample"
})
public class GetMovies {

    @XmlElement(name = "like", namespace = "")
    private String like;
    @XmlElement(name = "isSample", namespace = "")
    private boolean isSample;

    /**
     * 
     * @return
     *     returns String
     */
    public String getLike() {
        return this.like;
    }

    /**
     * 
     * @param like
     *     the value for the like property
     */
    public void setLike(String like) {
        this.like = like;
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
