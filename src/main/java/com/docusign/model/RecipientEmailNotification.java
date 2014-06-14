
package com.docusign.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecipientEmailNotification complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="RecipientEmailNotification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmailBlurb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Language" type="{http://www.docusign.net/API/3.0}SupportedLanguage" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecipientEmailNotification", propOrder = {
        "subject",
        "emailBlurb",
        "language"
})
public class RecipientEmailNotification {

    @XmlElement(name = "Subject")
    protected String subject;
    @XmlElement(name = "EmailBlurb")
    protected String emailBlurb;
    @XmlElement(name = "Language")
    protected SupportedLanguage language;

    /**
     * Gets the value of the subject property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * Gets the value of the emailBlurb property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getEmailBlurb() {
        return emailBlurb;
    }

    /**
     * Sets the value of the emailBlurb property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEmailBlurb(String value) {
        this.emailBlurb = value;
    }

    /**
     * Gets the value of the language property.
     *
     * @return possible object is
     *         {@link SupportedLanguage }
     */
    public SupportedLanguage getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     *
     * @param value allowed object is
     *              {@link SupportedLanguage }
     */
    public void setLanguage(SupportedLanguage value) {
        this.language = value;
    }

}
