
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
 *         &lt;element name="GetAuthenticationTokenResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "getAuthenticationTokenResult"
})
@XmlRootElement(name = "GetAuthenticationTokenResponse")
public class GetAuthenticationTokenResponse {

    @XmlElement(name = "GetAuthenticationTokenResult")
    protected String getAuthenticationTokenResult;

    /**
     * Gets the value of the getAuthenticationTokenResult property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getGetAuthenticationTokenResult() {
        return getAuthenticationTokenResult;
    }

    /**
     * Sets the value of the getAuthenticationTokenResult property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setGetAuthenticationTokenResult(String value) {
        this.getAuthenticationTokenResult = value;
    }

}
