
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
 *         &lt;element name="BrandDefinitions" type="{http://www.docusign.net/API/3.0}BrandDefinitions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "accountId",
        "brandDefinitions"
})
@XmlRootElement(name = "CreateAccountBrands")
public class CreateAccountBrands {

    @XmlElement(name = "AccountId")
    protected String accountId;
    @XmlElement(name = "BrandDefinitions")
    protected BrandDefinitions brandDefinitions;

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
     * Gets the value of the brandDefinitions property.
     *
     * @return possible object is
     *         {@link BrandDefinitions }
     */
    public BrandDefinitions getBrandDefinitions() {
        return brandDefinitions;
    }

    /**
     * Sets the value of the brandDefinitions property.
     *
     * @param value allowed object is
     *              {@link BrandDefinitions }
     */
    public void setBrandDefinitions(BrandDefinitions value) {
        this.brandDefinitions = value;
    }

}