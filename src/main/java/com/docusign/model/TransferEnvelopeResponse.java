
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
 *         &lt;element name="TransferEnvelopeResult" type="{http://www.docusign.net/API/3.0}TransferEnvelopeStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "transferEnvelopeResult"
})
@XmlRootElement(name = "TransferEnvelopeResponse")
public class TransferEnvelopeResponse {

    @XmlElement(name = "TransferEnvelopeResult")
    protected TransferEnvelopeStatus transferEnvelopeResult;

    /**
     * Gets the value of the transferEnvelopeResult property.
     *
     * @return possible object is
     *         {@link TransferEnvelopeStatus }
     */
    public TransferEnvelopeStatus getTransferEnvelopeResult() {
        return transferEnvelopeResult;
    }

    /**
     * Sets the value of the transferEnvelopeResult property.
     *
     * @param value allowed object is
     *              {@link TransferEnvelopeStatus }
     */
    public void setTransferEnvelopeResult(TransferEnvelopeStatus value) {
        this.transferEnvelopeResult = value;
    }

}
