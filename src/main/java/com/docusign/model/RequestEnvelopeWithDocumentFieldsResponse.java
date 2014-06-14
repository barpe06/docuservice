
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
 *         &lt;element name="RequestEnvelopeWithDocumentFieldsResult" type="{http://www.docusign.net/API/3.0}Envelope" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "requestEnvelopeWithDocumentFieldsResult"
})
@XmlRootElement(name = "RequestEnvelopeWithDocumentFieldsResponse")
public class RequestEnvelopeWithDocumentFieldsResponse {

    @XmlElement(name = "RequestEnvelopeWithDocumentFieldsResult")
    protected Envelope requestEnvelopeWithDocumentFieldsResult;

    /**
     * Gets the value of the requestEnvelopeWithDocumentFieldsResult property.
     *
     * @return possible object is
     *         {@link Envelope }
     */
    public Envelope getRequestEnvelopeWithDocumentFieldsResult() {
        return requestEnvelopeWithDocumentFieldsResult;
    }

    /**
     * Sets the value of the requestEnvelopeWithDocumentFieldsResult property.
     *
     * @param value allowed object is
     *              {@link Envelope }
     */
    public void setRequestEnvelopeWithDocumentFieldsResult(Envelope value) {
        this.requestEnvelopeWithDocumentFieldsResult = value;
    }

}
