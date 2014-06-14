
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
 *         &lt;element name="RequestStatusCodesResult" type="{http://www.docusign.net/API/3.0}FilteredEnvelopeStatusChanges" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "requestStatusCodesResult"
})
@XmlRootElement(name = "RequestStatusCodesResponse")
public class RequestStatusCodesResponse {

    @XmlElement(name = "RequestStatusCodesResult")
    protected FilteredEnvelopeStatusChanges requestStatusCodesResult;

    /**
     * Gets the value of the requestStatusCodesResult property.
     *
     * @return possible object is
     *         {@link FilteredEnvelopeStatusChanges }
     */
    public FilteredEnvelopeStatusChanges getRequestStatusCodesResult() {
        return requestStatusCodesResult;
    }

    /**
     * Sets the value of the requestStatusCodesResult property.
     *
     * @param value allowed object is
     *              {@link FilteredEnvelopeStatusChanges }
     */
    public void setRequestStatusCodesResult(FilteredEnvelopeStatusChanges value) {
        this.requestStatusCodesResult = value;
    }

}
