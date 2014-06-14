
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
 *         &lt;element name="CreateEnvelopeFromTemplatesAndFormsResult" type="{http://www.docusign.net/API/3.0}EnvelopeStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "createEnvelopeFromTemplatesAndFormsResult"
})
@XmlRootElement(name = "CreateEnvelopeFromTemplatesAndFormsResponse")
public class CreateEnvelopeFromTemplatesAndFormsResponse {

    @XmlElement(name = "CreateEnvelopeFromTemplatesAndFormsResult")
    protected EnvelopeStatus createEnvelopeFromTemplatesAndFormsResult;

    /**
     * Gets the value of the createEnvelopeFromTemplatesAndFormsResult property.
     *
     * @return possible object is
     *         {@link EnvelopeStatus }
     */
    public EnvelopeStatus getCreateEnvelopeFromTemplatesAndFormsResult() {
        return createEnvelopeFromTemplatesAndFormsResult;
    }

    /**
     * Sets the value of the createEnvelopeFromTemplatesAndFormsResult property.
     *
     * @param value allowed object is
     *              {@link EnvelopeStatus }
     */
    public void setCreateEnvelopeFromTemplatesAndFormsResult(EnvelopeStatus value) {
        this.createEnvelopeFromTemplatesAndFormsResult = value;
    }

}
