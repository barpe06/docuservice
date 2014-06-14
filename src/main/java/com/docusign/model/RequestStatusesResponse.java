
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
 *         &lt;element name="RequestStatusesResult" type="{http://www.docusign.net/API/3.0}FilteredEnvelopeStatuses" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "requestStatusesResult"
})
@XmlRootElement(name = "RequestStatusesResponse")
public class RequestStatusesResponse {

    @XmlElement(name = "RequestStatusesResult")
    protected FilteredEnvelopeStatuses requestStatusesResult;

    /**
     * Gets the value of the requestStatusesResult property.
     *
     * @return possible object is
     *         {@link FilteredEnvelopeStatuses }
     */
    public FilteredEnvelopeStatuses getRequestStatusesResult() {
        return requestStatusesResult;
    }

    /**
     * Sets the value of the requestStatusesResult property.
     *
     * @param value allowed object is
     *              {@link FilteredEnvelopeStatuses }
     */
    public void setRequestStatusesResult(FilteredEnvelopeStatuses value) {
        this.requestStatusesResult = value;
    }

}
