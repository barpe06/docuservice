
package com.docusign.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SynchEnvelopeStatus complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="SynchEnvelopeStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EnvelopeStatus" type="{http://www.docusign.net/API/3.0}EnvelopeStatusCode"/>
 *         &lt;element name="EnvelopeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SynchEnvelopeStatus", propOrder = {
        "envelopeStatus",
        "envelopeID"
})
public class SynchEnvelopeStatus {

    @XmlElement(name = "EnvelopeStatus", required = true)
    protected EnvelopeStatusCode envelopeStatus;
    @XmlElement(name = "EnvelopeID")
    protected String envelopeID;

    /**
     * Gets the value of the envelopeStatus property.
     *
     * @return possible object is
     *         {@link EnvelopeStatusCode }
     */
    public EnvelopeStatusCode getEnvelopeStatus() {
        return envelopeStatus;
    }

    /**
     * Sets the value of the envelopeStatus property.
     *
     * @param value allowed object is
     *              {@link EnvelopeStatusCode }
     */
    public void setEnvelopeStatus(EnvelopeStatusCode value) {
        this.envelopeStatus = value;
    }

    /**
     * Gets the value of the envelopeID property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getEnvelopeID() {
        return envelopeID;
    }

    /**
     * Sets the value of the envelopeID property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEnvelopeID(String value) {
        this.envelopeID = value;
    }

}
