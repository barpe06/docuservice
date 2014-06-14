
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
 *         &lt;element name="UpdateAddressBookItemsResult" type="{http://www.docusign.net/API/3.0}UpdateAddressBookResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "updateAddressBookItemsResult"
})
@XmlRootElement(name = "UpdateAddressBookItemsResponse")
public class UpdateAddressBookItemsResponse {

    @XmlElement(name = "UpdateAddressBookItemsResult")
    protected UpdateAddressBookResult updateAddressBookItemsResult;

    /**
     * Gets the value of the updateAddressBookItemsResult property.
     *
     * @return possible object is
     *         {@link UpdateAddressBookResult }
     */
    public UpdateAddressBookResult getUpdateAddressBookItemsResult() {
        return updateAddressBookItemsResult;
    }

    /**
     * Sets the value of the updateAddressBookItemsResult property.
     *
     * @param value allowed object is
     *              {@link UpdateAddressBookResult }
     */
    public void setUpdateAddressBookItemsResult(UpdateAddressBookResult value) {
        this.updateAddressBookItemsResult = value;
    }

}
