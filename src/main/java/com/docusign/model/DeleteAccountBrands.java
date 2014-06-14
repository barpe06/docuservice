
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
 *         &lt;element name="BrandDeleteRequest" type="{http://www.docusign.net/API/3.0}BrandDeleteRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "accountId",
        "brandDeleteRequest"
})
@XmlRootElement(name = "DeleteAccountBrands")
public class DeleteAccountBrands {

    @XmlElement(name = "AccountId")
    protected String accountId;
    @XmlElement(name = "BrandDeleteRequest")
    protected BrandDeleteRequest brandDeleteRequest;

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
     * Gets the value of the brandDeleteRequest property.
     *
     * @return possible object is
     *         {@link BrandDeleteRequest }
     */
    public BrandDeleteRequest getBrandDeleteRequest() {
        return brandDeleteRequest;
    }

    /**
     * Sets the value of the brandDeleteRequest property.
     *
     * @param value allowed object is
     *              {@link BrandDeleteRequest }
     */
    public void setBrandDeleteRequest(BrandDeleteRequest value) {
        this.brandDeleteRequest = value;
    }

}
