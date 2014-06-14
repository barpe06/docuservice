
package com.docusign.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PublishConnectFailuresFilter complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="PublishConnectFailuresFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Synchronous" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EnvelopeIds" type="{http://www.docusign.net/API/3.0}ArrayOfString2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublishConnectFailuresFilter", propOrder = {
        "accountId",
        "synchronous",
        "envelopeIds"
})
public class PublishConnectFailuresFilter {

    @XmlElement(name = "AccountId")
    protected String accountId;
    @XmlElement(name = "Synchronous")
    protected Boolean synchronous;
    @XmlElement(name = "EnvelopeIds")
    protected ArrayOfString2 envelopeIds;

    /**
     * Gets the value of the accountId property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Sets the value of the accountId property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAccountId(String value) {
        this.accountId = value;
    }

    /**
     * Gets the value of the synchronous property.
     *
     * @return possible object is
     *         {@link Boolean }
     */
    public Boolean isSynchronous() {
        return synchronous;
    }

    /**
     * Sets the value of the synchronous property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setSynchronous(Boolean value) {
        this.synchronous = value;
    }

    /**
     * Gets the value of the envelopeIds property.
     *
     * @return possible object is
     *         {@link ArrayOfString2 }
     */
    public ArrayOfString2 getEnvelopeIds() {
        return envelopeIds;
    }

    /**
     * Sets the value of the envelopeIds property.
     *
     * @param value allowed object is
     *              {@link ArrayOfString2 }
     */
    public void setEnvelopeIds(ArrayOfString2 value) {
        this.envelopeIds = value;
    }

}
