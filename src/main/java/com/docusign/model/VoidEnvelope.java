
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
 *         &lt;element name="EnvelopeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "envelopeID",
        "reason"
})
@XmlRootElement(name = "VoidEnvelope")
public class VoidEnvelope {

    @XmlElement(name = "EnvelopeID")
    protected String envelopeID;
    @XmlElement(name = "Reason")
    protected String reason;

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

    /**
     * Gets the value of the reason property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setReason(String value) {
        this.reason = value;
    }

}
