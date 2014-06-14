
package com.docusign.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateAddressBookResult complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="UpdateAddressBookResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Success" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AddressBookItems" type="{http://www.docusign.net/API/3.0}ArrayOfAddressBookItem1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateAddressBookResult", propOrder = {
        "success",
        "addressBookItems"
})
public class UpdateAddressBookResult {

    @XmlElement(name = "Success")
    protected boolean success;
    @XmlElement(name = "AddressBookItems")
    protected ArrayOfAddressBookItem1 addressBookItems;

    /**
     * Gets the value of the success property.
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * Sets the value of the success property.
     */
    public void setSuccess(boolean value) {
        this.success = value;
    }

    /**
     * Gets the value of the addressBookItems property.
     *
     * @return possible object is
     *         {@link ArrayOfAddressBookItem1 }
     */
    public ArrayOfAddressBookItem1 getAddressBookItems() {
        return addressBookItems;
    }

    /**
     * Sets the value of the addressBookItems property.
     *
     * @param value allowed object is
     *              {@link ArrayOfAddressBookItem1 }
     */
    public void setAddressBookItems(ArrayOfAddressBookItem1 value) {
        this.addressBookItems = value;
    }

}
