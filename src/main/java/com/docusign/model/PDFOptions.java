
package com.docusign.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PDFOptions complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="PDFOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ShowChanges" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AddWaterMark" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IncludeCert" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PDFOptions", propOrder = {
        "showChanges",
        "addWaterMark",
        "includeCert"
})
public class PDFOptions {

    @XmlElement(name = "ShowChanges")
    protected boolean showChanges;
    @XmlElement(name = "AddWaterMark")
    protected boolean addWaterMark;
    @XmlElement(name = "IncludeCert")
    protected boolean includeCert;

    /**
     * Gets the value of the showChanges property.
     */
    public boolean isShowChanges() {
        return showChanges;
    }

    /**
     * Sets the value of the showChanges property.
     */
    public void setShowChanges(boolean value) {
        this.showChanges = value;
    }

    /**
     * Gets the value of the addWaterMark property.
     */
    public boolean isAddWaterMark() {
        return addWaterMark;
    }

    /**
     * Sets the value of the addWaterMark property.
     */
    public void setAddWaterMark(boolean value) {
        this.addWaterMark = value;
    }

    /**
     * Gets the value of the includeCert property.
     */
    public boolean isIncludeCert() {
        return includeCert;
    }

    /**
     * Sets the value of the includeCert property.
     */
    public void setIncludeCert(boolean value) {
        this.includeCert = value;
    }

}
