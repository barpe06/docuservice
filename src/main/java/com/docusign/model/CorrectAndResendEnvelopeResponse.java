
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
 *         &lt;element name="CorrectAndResendEnvelopeResult" type="{http://www.docusign.net/API/3.0}CorrectionStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "correctAndResendEnvelopeResult"
})
@XmlRootElement(name = "CorrectAndResendEnvelopeResponse")
public class CorrectAndResendEnvelopeResponse {

    @XmlElement(name = "CorrectAndResendEnvelopeResult")
    protected CorrectionStatus correctAndResendEnvelopeResult;

    /**
     * Gets the value of the correctAndResendEnvelopeResult property.
     *
     * @return possible object is
     *         {@link CorrectionStatus }
     */
    public CorrectionStatus getCorrectAndResendEnvelopeResult() {
        return correctAndResendEnvelopeResult;
    }

    /**
     * Sets the value of the correctAndResendEnvelopeResult property.
     *
     * @param value allowed object is
     *              {@link CorrectionStatus }
     */
    public void setCorrectAndResendEnvelopeResult(CorrectionStatus value) {
        this.correctAndResendEnvelopeResult = value;
    }

}
