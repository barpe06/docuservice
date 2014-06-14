
package com.docusign.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeleteCaptiveRecipientsSignaturesArg complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="DeleteCaptiveRecipientsSignaturesArg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CaptiveRecipients" type="{http://www.docusign.net/API/3.0}ArrayOfCaptiveRecipient" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteCaptiveRecipientsSignaturesArg", propOrder = {
        "captiveRecipients"
})
public class DeleteCaptiveRecipientsSignaturesArg {

    @XmlElement(name = "CaptiveRecipients")
    protected ArrayOfCaptiveRecipient captiveRecipients;

    /**
     * Gets the value of the captiveRecipients property.
     *
     * @return possible object is
     *         {@link ArrayOfCaptiveRecipient }
     */
    public ArrayOfCaptiveRecipient getCaptiveRecipients() {
        return captiveRecipients;
    }

    /**
     * Sets the value of the captiveRecipients property.
     *
     * @param value allowed object is
     *              {@link ArrayOfCaptiveRecipient }
     */
    public void setCaptiveRecipients(ArrayOfCaptiveRecipient value) {
        this.captiveRecipients = value;
    }

}
