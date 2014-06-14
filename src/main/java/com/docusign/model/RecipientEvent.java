
package com.docusign.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecipientEvent complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="RecipientEvent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RecipientEventStatusCode" type="{http://www.docusign.net/API/3.0}RecipientEventStatusCode"/>
 *         &lt;element name="IncludeDocuments" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecipientEvent", propOrder = {
        "recipientEventStatusCode",
        "includeDocuments"
})
public class RecipientEvent {

    @XmlElement(name = "RecipientEventStatusCode", required = true)
    protected RecipientEventStatusCode recipientEventStatusCode;
    @XmlElement(name = "IncludeDocuments")
    protected boolean includeDocuments;

    /**
     * Gets the value of the recipientEventStatusCode property.
     *
     * @return possible object is
     *         {@link RecipientEventStatusCode }
     */
    public RecipientEventStatusCode getRecipientEventStatusCode() {
        return recipientEventStatusCode;
    }

    /**
     * Sets the value of the recipientEventStatusCode property.
     *
     * @param value allowed object is
     *              {@link RecipientEventStatusCode }
     */
    public void setRecipientEventStatusCode(RecipientEventStatusCode value) {
        this.recipientEventStatusCode = value;
    }

    /**
     * Gets the value of the includeDocuments property.
     */
    public boolean isIncludeDocuments() {
        return includeDocuments;
    }

    /**
     * Sets the value of the includeDocuments property.
     */
    public void setIncludeDocuments(boolean value) {
        this.includeDocuments = value;
    }

}
