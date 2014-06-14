
package com.docusign.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecipientSAMLAuthentication complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="RecipientSAMLAuthentication">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SAMLAttributes" type="{http://www.docusign.net/API/3.0}ArrayOfSAMLAttribute" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecipientSAMLAuthentication", propOrder = {
        "samlAttributes"
})
public class RecipientSAMLAuthentication {

    @XmlElement(name = "SAMLAttributes")
    protected ArrayOfSAMLAttribute samlAttributes;

    /**
     * Gets the value of the samlAttributes property.
     *
     * @return possible object is
     *         {@link ArrayOfSAMLAttribute }
     */
    public ArrayOfSAMLAttribute getSAMLAttributes() {
        return samlAttributes;
    }

    /**
     * Sets the value of the samlAttributes property.
     *
     * @param value allowed object is
     *              {@link ArrayOfSAMLAttribute }
     */
    public void setSAMLAttributes(ArrayOfSAMLAttribute value) {
        this.samlAttributes = value;
    }

}
