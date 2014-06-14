
package com.docusign.model;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetConnectFailuresResult" type="{http://www.docusign.net/API/3.0}ArrayOfConnectFailure" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "getConnectFailuresResult"
})
@XmlRootElement(name = "GetConnectFailuresResponse")
public class GetConnectFailuresResponse {

    @XmlElement(name = "GetConnectFailuresResult")
    protected ArrayOfConnectFailure getConnectFailuresResult;

    /**
     * Gets the value of the getConnectFailuresResult property.
     *
     * @return possible object is
     *         {@link ArrayOfConnectFailure }
     */
    public ArrayOfConnectFailure getGetConnectFailuresResult() {
        return getConnectFailuresResult;
    }

    /**
     * Sets the value of the getConnectFailuresResult property.
     *
     * @param value allowed object is
     *              {@link ArrayOfConnectFailure }
     */
    public void setGetConnectFailuresResult(ArrayOfConnectFailure value) {
        this.getConnectFailuresResult = value;
    }

}
