
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
 *         &lt;element name="GetRecipientListResult" type="{http://www.docusign.net/API/3.0}RecipientList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "getRecipientListResult"
})
@XmlRootElement(name = "GetRecipientListResponse")
public class GetRecipientListResponse {

    @XmlElement(name = "GetRecipientListResult")
    protected RecipientList getRecipientListResult;

    /**
     * Gets the value of the getRecipientListResult property.
     *
     * @return possible object is
     *         {@link RecipientList }
     */
    public RecipientList getGetRecipientListResult() {
        return getRecipientListResult;
    }

    /**
     * Sets the value of the getRecipientListResult property.
     *
     * @param value allowed object is
     *              {@link RecipientList }
     */
    public void setGetRecipientListResult(RecipientList value) {
        this.getRecipientListResult = value;
    }

}
