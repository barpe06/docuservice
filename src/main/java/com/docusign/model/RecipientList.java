
package com.docusign.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecipientList complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="RecipientList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReservedRecipientEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MultipleUsers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RecipientName" type="{http://www.docusign.net/API/3.0}ArrayOfString3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecipientList", propOrder = {
        "reservedRecipientEmail",
        "multipleUsers",
        "recipientName"
})
public class RecipientList {

    @XmlElement(name = "ReservedRecipientEmail")
    protected Boolean reservedRecipientEmail;
    @XmlElement(name = "MultipleUsers")
    protected Boolean multipleUsers;
    @XmlElement(name = "RecipientName")
    protected ArrayOfString3 recipientName;

    /**
     * Gets the value of the reservedRecipientEmail property.
     *
     * @return possible object is
     *         {@link Boolean }
     */
    public Boolean isReservedRecipientEmail() {
        return reservedRecipientEmail;
    }

    /**
     * Sets the value of the reservedRecipientEmail property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setReservedRecipientEmail(Boolean value) {
        this.reservedRecipientEmail = value;
    }

    /**
     * Gets the value of the multipleUsers property.
     *
     * @return possible object is
     *         {@link Boolean }
     */
    public Boolean isMultipleUsers() {
        return multipleUsers;
    }

    /**
     * Sets the value of the multipleUsers property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setMultipleUsers(Boolean value) {
        this.multipleUsers = value;
    }

    /**
     * Gets the value of the recipientName property.
     *
     * @return possible object is
     *         {@link ArrayOfString3 }
     */
    public ArrayOfString3 getRecipientName() {
        return recipientName;
    }

    /**
     * Sets the value of the recipientName property.
     *
     * @param value allowed object is
     *              {@link ArrayOfString3 }
     */
    public void setRecipientName(ArrayOfString3 value) {
        this.recipientName = value;
    }

}
