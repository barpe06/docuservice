
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
 *         &lt;element name="GoToEnvelopeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "goToEnvelopeID"
})
@XmlRootElement(name = "GetAuthenticationToken")
public class GetAuthenticationToken {

    @XmlElement(name = "GoToEnvelopeID")
    protected String goToEnvelopeID;

    /**
     * Gets the value of the goToEnvelopeID property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getGoToEnvelopeID() {
        return goToEnvelopeID;
    }

    /**
     * Sets the value of the goToEnvelopeID property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setGoToEnvelopeID(String value) {
        this.goToEnvelopeID = value;
    }

}
