
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
 *         &lt;element name="GetAccountMembershipFeaturesListResult" type="{http://www.docusign.net/API/3.0}AccountMembershipFeaturesList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "getAccountMembershipFeaturesListResult"
})
@XmlRootElement(name = "GetAccountMembershipFeaturesListResponse")
public class GetAccountMembershipFeaturesListResponse {

    @XmlElement(name = "GetAccountMembershipFeaturesListResult")
    protected AccountMembershipFeaturesList getAccountMembershipFeaturesListResult;

    /**
     * Gets the value of the getAccountMembershipFeaturesListResult property.
     *
     * @return possible object is
     *         {@link AccountMembershipFeaturesList }
     */
    public AccountMembershipFeaturesList getGetAccountMembershipFeaturesListResult() {
        return getAccountMembershipFeaturesListResult;
    }

    /**
     * Sets the value of the getAccountMembershipFeaturesListResult property.
     *
     * @param value allowed object is
     *              {@link AccountMembershipFeaturesList }
     */
    public void setGetAccountMembershipFeaturesListResult(AccountMembershipFeaturesList value) {
        this.getAccountMembershipFeaturesListResult = value;
    }

}
