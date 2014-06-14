
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
 *         &lt;element name="DeleteAccountBrandsResult" type="{http://www.docusign.net/API/3.0}BrandResults" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "deleteAccountBrandsResult"
})
@XmlRootElement(name = "DeleteAccountBrandsResponse")
public class DeleteAccountBrandsResponse {

    @XmlElement(name = "DeleteAccountBrandsResult")
    protected BrandResults deleteAccountBrandsResult;

    /**
     * Gets the value of the deleteAccountBrandsResult property.
     *
     * @return possible object is
     *         {@link BrandResults }
     */
    public BrandResults getDeleteAccountBrandsResult() {
        return deleteAccountBrandsResult;
    }

    /**
     * Sets the value of the deleteAccountBrandsResult property.
     *
     * @param value allowed object is
     *              {@link BrandResults }
     */
    public void setDeleteAccountBrandsResult(BrandResults value) {
        this.deleteAccountBrandsResult = value;
    }

}
