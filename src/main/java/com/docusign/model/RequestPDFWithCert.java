
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
 *         &lt;element name="AddWaterMark" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "envelopeID",
        "addWaterMark"
})
@XmlRootElement(name = "RequestPDFWithCert")
public class RequestPDFWithCert {

    @XmlElement(name = "EnvelopeID")
    protected String envelopeID;
    @XmlElement(name = "AddWaterMark")
    protected boolean addWaterMark;

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
     * Gets the value of the addWaterMark property.
     */
    public boolean isAddWaterMark() {
        return addWaterMark;
    }

    /**
     * Sets the value of the addWaterMark property.
     */
    public void setAddWaterMark(boolean value) {
        this.addWaterMark = value;
    }

}
