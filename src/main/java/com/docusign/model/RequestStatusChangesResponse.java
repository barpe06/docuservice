
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
 *         &lt;element name="RequestStatusChangesResult" type="{http://www.docusign.net/API/3.0}FilteredEnvelopeStatusChanges" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "requestStatusChangesResult"
})
@XmlRootElement(name = "RequestStatusChangesResponse")
public class RequestStatusChangesResponse {

    @XmlElement(name = "RequestStatusChangesResult")
    protected FilteredEnvelopeStatusChanges requestStatusChangesResult;

    /**
     * Gets the value of the requestStatusChangesResult property.
     *
     * @return possible object is
     *         {@link FilteredEnvelopeStatusChanges }
     */
    public FilteredEnvelopeStatusChanges getRequestStatusChangesResult() {
        return requestStatusChangesResult;
    }

    /**
     * Sets the value of the requestStatusChangesResult property.
     *
     * @param value allowed object is
     *              {@link FilteredEnvelopeStatusChanges }
     */
    public void setRequestStatusChangesResult(FilteredEnvelopeStatusChanges value) {
        this.requestStatusChangesResult = value;
    }

}
