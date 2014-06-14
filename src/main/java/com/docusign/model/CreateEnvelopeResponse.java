
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
 *         &lt;element name="CreateEnvelopeResult" type="{http://www.docusign.net/API/3.0}EnvelopeStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "createEnvelopeResult"
})
@XmlRootElement(name = "CreateEnvelopeResponse")
public class CreateEnvelopeResponse {

    @XmlElement(name = "CreateEnvelopeResult")
    protected EnvelopeStatus createEnvelopeResult;

    /**
     * Gets the value of the createEnvelopeResult property.
     *
     * @return possible object is
     *         {@link EnvelopeStatus }
     */
    public EnvelopeStatus getCreateEnvelopeResult() {
        return createEnvelopeResult;
    }

    /**
     * Sets the value of the createEnvelopeResult property.
     *
     * @param value allowed object is
     *              {@link EnvelopeStatus }
     */
    public void setCreateEnvelopeResult(EnvelopeStatus value) {
        this.createEnvelopeResult = value;
    }

}
