
package com.docusign.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfAddressBookRemoveItem complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="ArrayOfAddressBookRemoveItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddressBookRemoveItem" type="{http://www.docusign.net/API/3.0}AddressBookRemoveItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAddressBookRemoveItem", propOrder = {
        "addressBookRemoveItem"
})
public class ArrayOfAddressBookRemoveItem {

    @XmlElement(name = "AddressBookRemoveItem", nillable = true)
    protected List<AddressBookRemoveItem> addressBookRemoveItem;

    /**
     * Gets the value of the addressBookRemoveItem property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressBookRemoveItem property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressBookRemoveItem().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressBookRemoveItem }
     */
    public List<AddressBookRemoveItem> getAddressBookRemoveItem() {
        if (addressBookRemoveItem == null) {
            addressBookRemoveItem = new ArrayList<AddressBookRemoveItem>();
        }
        return this.addressBookRemoveItem;
    }

}
