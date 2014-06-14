
package com.docusign.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecipientCorrectionStatus complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="RecipientCorrectionStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CorrectionSucceeded" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="RecipientCorrection" type="{http://www.docusign.net/API/3.0}RecipientCorrection" minOccurs="0"/>
 *         &lt;element name="RecipientStatus" type="{http://www.docusign.net/API/3.0}RecipientStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecipientCorrectionStatus", propOrder = {
        "correctionSucceeded",
        "recipientCorrection",
        "recipientStatus"
})
public class RecipientCorrectionStatus {

    @XmlElement(name = "CorrectionSucceeded")
    protected boolean correctionSucceeded;
    @XmlElement(name = "RecipientCorrection")
    protected RecipientCorrection recipientCorrection;
    @XmlElement(name = "RecipientStatus")
    protected RecipientStatus recipientStatus;

    /**
     * Gets the value of the correctionSucceeded property.
     */
    public boolean isCorrectionSucceeded() {
        return correctionSucceeded;
    }

    /**
     * Sets the value of the correctionSucceeded property.
     */
    public void setCorrectionSucceeded(boolean value) {
        this.correctionSucceeded = value;
    }

    /**
     * Gets the value of the recipientCorrection property.
     *
     * @return possible object is
     *         {@link RecipientCorrection }
     */
    public RecipientCorrection getRecipientCorrection() {
        return recipientCorrection;
    }

    /**
     * Sets the value of the recipientCorrection property.
     *
     * @param value allowed object is
     *              {@link RecipientCorrection }
     */
    public void setRecipientCorrection(RecipientCorrection value) {
        this.recipientCorrection = value;
    }

    /**
     * Gets the value of the recipientStatus property.
     *
     * @return possible object is
     *         {@link RecipientStatus }
     */
    public RecipientStatus getRecipientStatus() {
        return recipientStatus;
    }

    /**
     * Sets the value of the recipientStatus property.
     *
     * @param value allowed object is
     *              {@link RecipientStatus }
     */
    public void setRecipientStatus(RecipientStatus value) {
        this.recipientStatus = value;
    }

}
