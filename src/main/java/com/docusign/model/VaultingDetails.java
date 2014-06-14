
package com.docusign.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VaultingDetails complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="VaultingDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EODTransactionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EODTransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EODDocumentProfileID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VaultingDetails", propOrder = {
        "eodTransactionName",
        "eodTransactionID",
        "eodDocumentProfileID"
})
public class VaultingDetails {

    @XmlElement(name = "EODTransactionName")
    protected String eodTransactionName;
    @XmlElement(name = "EODTransactionID")
    protected String eodTransactionID;
    @XmlElement(name = "EODDocumentProfileID")
    protected String eodDocumentProfileID;

    /**
     * Gets the value of the eodTransactionName property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getEODTransactionName() {
        return eodTransactionName;
    }

    /**
     * Sets the value of the eodTransactionName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEODTransactionName(String value) {
        this.eodTransactionName = value;
    }

    /**
     * Gets the value of the eodTransactionID property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getEODTransactionID() {
        return eodTransactionID;
    }

    /**
     * Sets the value of the eodTransactionID property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEODTransactionID(String value) {
        this.eodTransactionID = value;
    }

    /**
     * Gets the value of the eodDocumentProfileID property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getEODDocumentProfileID() {
        return eodDocumentProfileID;
    }

    /**
     * Sets the value of the eodDocumentProfileID property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEODDocumentProfileID(String value) {
        this.eodDocumentProfileID = value;
    }

}
