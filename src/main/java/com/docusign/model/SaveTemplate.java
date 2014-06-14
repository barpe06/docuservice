
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
 *         &lt;element name="EnvelopeTemplate" type="{http://www.docusign.net/API/3.0}EnvelopeTemplate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "envelopeTemplate"
})
@XmlRootElement(name = "SaveTemplate")
public class SaveTemplate {

    @XmlElement(name = "EnvelopeTemplate")
    protected EnvelopeTemplate envelopeTemplate;

    /**
     * Gets the value of the envelopeTemplate property.
     *
     * @return possible object is
     *         {@link EnvelopeTemplate }
     */
    public EnvelopeTemplate getEnvelopeTemplate() {
        return envelopeTemplate;
    }

    /**
     * Sets the value of the envelopeTemplate property.
     *
     * @param value allowed object is
     *              {@link EnvelopeTemplate }
     */
    public void setEnvelopeTemplate(EnvelopeTemplate value) {
        this.envelopeTemplate = value;
    }

}
