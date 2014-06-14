
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
 *         &lt;element name="SenderAccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecipientEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "senderAccountId",
        "recipientEmail"
})
@XmlRootElement(name = "GetRecipientList")
public class GetRecipientList {

    @XmlElement(name = "SenderAccountId")
    protected String senderAccountId;
    @XmlElement(name = "RecipientEmail")
    protected String recipientEmail;

    /**
     * Gets the value of the senderAccountId property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getSenderAccountId() {
        return senderAccountId;
    }

    /**
     * Sets the value of the senderAccountId property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSenderAccountId(String value) {
        this.senderAccountId = value;
    }

    /**
     * Gets the value of the recipientEmail property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getRecipientEmail() {
        return recipientEmail;
    }

    /**
     * Sets the value of the recipientEmail property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setRecipientEmail(String value) {
        this.recipientEmail = value;
    }

}
