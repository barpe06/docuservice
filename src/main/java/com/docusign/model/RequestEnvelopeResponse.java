
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
 *         &lt;element name="RequestEnvelopeResult" type="{http://www.docusign.net/API/3.0}Envelope" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "requestEnvelopeResult"
})
@XmlRootElement(name = "RequestEnvelopeResponse")
public class RequestEnvelopeResponse {

    @XmlElement(name = "RequestEnvelopeResult")
    protected Envelope requestEnvelopeResult;

    /**
     * Gets the value of the requestEnvelopeResult property.
     *
     * @return possible object is
     *         {@link Envelope }
     */
    public Envelope getRequestEnvelopeResult() {
        return requestEnvelopeResult;
    }

    /**
     * Sets the value of the requestEnvelopeResult property.
     *
     * @param value allowed object is
     *              {@link Envelope }
     */
    public void setRequestEnvelopeResult(Envelope value) {
        this.requestEnvelopeResult = value;
    }

}
