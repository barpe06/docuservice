
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
 *         &lt;element name="GetAccountBrandsResult" type="{http://www.docusign.net/API/3.0}BrandResults" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "getAccountBrandsResult"
})
@XmlRootElement(name = "GetAccountBrandsResponse")
public class GetAccountBrandsResponse {

    @XmlElement(name = "GetAccountBrandsResult")
    protected BrandResults getAccountBrandsResult;

    /**
     * Gets the value of the getAccountBrandsResult property.
     *
     * @return possible object is
     *         {@link BrandResults }
     */
    public BrandResults getGetAccountBrandsResult() {
        return getAccountBrandsResult;
    }

    /**
     * Sets the value of the getAccountBrandsResult property.
     *
     * @param value allowed object is
     *              {@link BrandResults }
     */
    public void setGetAccountBrandsResult(BrandResults value) {
        this.getAccountBrandsResult = value;
    }

}
