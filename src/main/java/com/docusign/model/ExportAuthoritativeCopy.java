
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
 *         &lt;element name="EnvelopeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "envelopeId"
})
@XmlRootElement(name = "ExportAuthoritativeCopy")
public class ExportAuthoritativeCopy {

    @XmlElement(name = "EnvelopeId")
    protected String envelopeId;

    /**
     * Gets the value of the envelopeId property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getEnvelopeId() {
        return envelopeId;
    }

    /**
     * Sets the value of the envelopeId property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEnvelopeId(String value) {
        this.envelopeId = value;
    }

}
