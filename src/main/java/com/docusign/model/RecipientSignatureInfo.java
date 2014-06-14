
package com.docusign.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecipientSignatureInfo complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="RecipientSignatureInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SignatureName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SignatureInitials" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FontStyle" type="{http://www.docusign.net/API/3.0}FontStyleCode"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecipientSignatureInfo", propOrder = {
        "signatureName",
        "signatureInitials",
        "fontStyle"
})
public class RecipientSignatureInfo {

    @XmlElement(name = "SignatureName")
    protected String signatureName;
    @XmlElement(name = "SignatureInitials")
    protected String signatureInitials;
    @XmlElement(name = "FontStyle", required = true)
    protected FontStyleCode fontStyle;

    /**
     * Gets the value of the signatureName property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getSignatureName() {
        return signatureName;
    }

    /**
     * Sets the value of the signatureName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSignatureName(String value) {
        this.signatureName = value;
    }

    /**
     * Gets the value of the signatureInitials property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getSignatureInitials() {
        return signatureInitials;
    }

    /**
     * Sets the value of the signatureInitials property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSignatureInitials(String value) {
        this.signatureInitials = value;
    }

    /**
     * Gets the value of the fontStyle property.
     *
     * @return possible object is
     *         {@link FontStyleCode }
     */
    public FontStyleCode getFontStyle() {
        return fontStyle;
    }

    /**
     * Sets the value of the fontStyle property.
     *
     * @param value allowed object is
     *              {@link FontStyleCode }
     */
    public void setFontStyle(FontStyleCode value) {
        this.fontStyle = value;
    }

}
