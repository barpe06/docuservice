
package com.docusign.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TemplateReferenceFieldData complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="TemplateReferenceFieldData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DataValues" type="{http://www.docusign.net/API/3.0}ArrayOfTemplateReferenceFieldDataDataValue" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TemplateReferenceFieldData", propOrder = {
        "dataValues"
})
public class TemplateReferenceFieldData {

    @XmlElement(name = "DataValues")
    protected ArrayOfTemplateReferenceFieldDataDataValue dataValues;

    /**
     * Gets the value of the dataValues property.
     *
     * @return possible object is
     *         {@link ArrayOfTemplateReferenceFieldDataDataValue }
     */
    public ArrayOfTemplateReferenceFieldDataDataValue getDataValues() {
        return dataValues;
    }

    /**
     * Sets the value of the dataValues property.
     *
     * @param value allowed object is
     *              {@link ArrayOfTemplateReferenceFieldDataDataValue }
     */
    public void setDataValues(ArrayOfTemplateReferenceFieldDataDataValue value) {
        this.dataValues = value;
    }

}
