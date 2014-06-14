
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
 *         &lt;element name="ConnectFailuresFilter" type="{http://www.docusign.net/API/3.0}ConnectFailuresFilter" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "connectFailuresFilter"
})
@XmlRootElement(name = "GetConnectFailures")
public class GetConnectFailures {

    @XmlElement(name = "ConnectFailuresFilter")
    protected ConnectFailuresFilter connectFailuresFilter;

    /**
     * Gets the value of the connectFailuresFilter property.
     *
     * @return possible object is
     *         {@link ConnectFailuresFilter }
     */
    public ConnectFailuresFilter getConnectFailuresFilter() {
        return connectFailuresFilter;
    }

    /**
     * Sets the value of the connectFailuresFilter property.
     *
     * @param value allowed object is
     *              {@link ConnectFailuresFilter }
     */
    public void setConnectFailuresFilter(ConnectFailuresFilter value) {
        this.connectFailuresFilter = value;
    }

}
