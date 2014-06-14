
package com.docusign.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfRecipientEsign complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="ArrayOfRecipientEsign">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RecipientEsign" type="{http://www.docusign.net/API/3.0}RecipientEsign" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRecipientEsign", propOrder = {
        "recipientEsign"
})
public class ArrayOfRecipientEsign {

    @XmlElement(name = "RecipientEsign")
    protected List<RecipientEsign> recipientEsign;

    /**
     * Gets the value of the recipientEsign property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recipientEsign property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecipientEsign().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link RecipientEsign }
     */
    public List<RecipientEsign> getRecipientEsign() {
        if (recipientEsign == null) {
            recipientEsign = new ArrayList<RecipientEsign>();
        }
        return this.recipientEsign;
    }

}
