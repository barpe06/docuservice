
package com.docusign.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CaptiveRecipientResults complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="CaptiveRecipientResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CaptiveRecipients" type="{http://www.docusign.net/API/3.0}ArrayOfCaptiveRecipient1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CaptiveRecipientResults", propOrder = {
        "captiveRecipients"
})
public class CaptiveRecipientResults {

    @XmlElement(name = "CaptiveRecipients")
    protected ArrayOfCaptiveRecipient1 captiveRecipients;

    /**
     * Gets the value of the captiveRecipients property.
     *
     * @return possible object is
     *         {@link ArrayOfCaptiveRecipient1 }
     */
    public ArrayOfCaptiveRecipient1 getCaptiveRecipients() {
        return captiveRecipients;
    }

    /**
     * Sets the value of the captiveRecipients property.
     *
     * @param value allowed object is
     *              {@link ArrayOfCaptiveRecipient1 }
     */
    public void setCaptiveRecipients(ArrayOfCaptiveRecipient1 value) {
        this.captiveRecipients = value;
    }

}
