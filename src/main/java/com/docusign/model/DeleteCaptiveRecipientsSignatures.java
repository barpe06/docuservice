
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
 *         &lt;element name="AccountId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Arg" type="{http://www.docusign.net/API/3.0}DeleteCaptiveRecipientsSignaturesArg" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "accountId",
        "arg"
})
@XmlRootElement(name = "DeleteCaptiveRecipientsSignatures")
public class DeleteCaptiveRecipientsSignatures {

    @XmlElement(name = "AccountId")
    protected String accountId;
    @XmlElement(name = "Arg")
    protected DeleteCaptiveRecipientsSignaturesArg arg;

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
     * Gets the value of the arg property.
     *
     * @return possible object is
     *         {@link DeleteCaptiveRecipientsSignaturesArg }
     */
    public DeleteCaptiveRecipientsSignaturesArg getArg() {
        return arg;
    }

    /**
     * Sets the value of the arg property.
     *
     * @param value allowed object is
     *              {@link DeleteCaptiveRecipientsSignaturesArg }
     */
    public void setArg(DeleteCaptiveRecipientsSignaturesArg value) {
        this.arg = value;
    }

}
