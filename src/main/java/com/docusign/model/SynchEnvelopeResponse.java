
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
 *         &lt;element name="SynchEnvelopeResult" type="{http://www.docusign.net/API/3.0}SynchEnvelopeStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "synchEnvelopeResult"
})
@XmlRootElement(name = "SynchEnvelopeResponse")
public class SynchEnvelopeResponse {

    @XmlElement(name = "SynchEnvelopeResult")
    protected SynchEnvelopeStatus synchEnvelopeResult;

    /**
     * Gets the value of the synchEnvelopeResult property.
     *
     * @return possible object is
     *         {@link SynchEnvelopeStatus }
     */
    public SynchEnvelopeStatus getSynchEnvelopeResult() {
        return synchEnvelopeResult;
    }

    /**
     * Sets the value of the synchEnvelopeResult property.
     *
     * @param value allowed object is
     *              {@link SynchEnvelopeStatus }
     */
    public void setSynchEnvelopeResult(SynchEnvelopeStatus value) {
        this.synchEnvelopeResult = value;
    }

}
