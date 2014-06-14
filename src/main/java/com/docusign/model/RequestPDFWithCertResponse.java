
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
 *         &lt;element name="RequestPDFWithCertResult" type="{http://www.docusign.net/API/3.0}EnvelopePDF" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "requestPDFWithCertResult"
})
@XmlRootElement(name = "RequestPDFWithCertResponse")
public class RequestPDFWithCertResponse {

    @XmlElement(name = "RequestPDFWithCertResult")
    protected EnvelopePDF requestPDFWithCertResult;

    /**
     * Gets the value of the requestPDFWithCertResult property.
     *
     * @return possible object is
     *         {@link EnvelopePDF }
     */
    public EnvelopePDF getRequestPDFWithCertResult() {
        return requestPDFWithCertResult;
    }

    /**
     * Sets the value of the requestPDFWithCertResult property.
     *
     * @param value allowed object is
     *              {@link EnvelopePDF }
     */
    public void setRequestPDFWithCertResult(EnvelopePDF value) {
        this.requestPDFWithCertResult = value;
    }

}
