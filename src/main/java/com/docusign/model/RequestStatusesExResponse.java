
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
 *         &lt;element name="RequestStatusesExResult" type="{http://www.docusign.net/API/3.0}FilteredEnvelopeStatuses" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "requestStatusesExResult"
})
@XmlRootElement(name = "RequestStatusesExResponse")
public class RequestStatusesExResponse {

    @XmlElement(name = "RequestStatusesExResult")
    protected FilteredEnvelopeStatuses requestStatusesExResult;

    /**
     * Gets the value of the requestStatusesExResult property.
     *
     * @return possible object is
     *         {@link FilteredEnvelopeStatuses }
     */
    public FilteredEnvelopeStatuses getRequestStatusesExResult() {
        return requestStatusesExResult;
    }

    /**
     * Sets the value of the requestStatusesExResult property.
     *
     * @param value allowed object is
     *              {@link FilteredEnvelopeStatuses }
     */
    public void setRequestStatusesExResult(FilteredEnvelopeStatuses value) {
        this.requestStatusesExResult = value;
    }

}
