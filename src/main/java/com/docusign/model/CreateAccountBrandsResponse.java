
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
 *         &lt;element name="CreateAccountBrandsResult" type="{http://www.docusign.net/API/3.0}BrandResults" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "createAccountBrandsResult"
})
@XmlRootElement(name = "CreateAccountBrandsResponse")
public class CreateAccountBrandsResponse {

    @XmlElement(name = "CreateAccountBrandsResult")
    protected BrandResults createAccountBrandsResult;

    /**
     * Gets the value of the createAccountBrandsResult property.
     *
     * @return possible object is
     *         {@link BrandResults }
     */
    public BrandResults getCreateAccountBrandsResult() {
        return createAccountBrandsResult;
    }

    /**
     * Sets the value of the createAccountBrandsResult property.
     *
     * @param value allowed object is
     *              {@link BrandResults }
     */
    public void setCreateAccountBrandsResult(BrandResults value) {
        this.createAccountBrandsResult = value;
    }

}
