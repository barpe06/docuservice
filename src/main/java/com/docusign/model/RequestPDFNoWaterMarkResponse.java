
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
 *         &lt;element name="RequestPDFNoWaterMarkResult" type="{http://www.docusign.net/API/3.0}EnvelopePDF" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "requestPDFNoWaterMarkResult"
})
@XmlRootElement(name = "RequestPDFNoWaterMarkResponse")
public class RequestPDFNoWaterMarkResponse {

    @XmlElement(name = "RequestPDFNoWaterMarkResult")
    protected EnvelopePDF requestPDFNoWaterMarkResult;

    /**
     * Gets the value of the requestPDFNoWaterMarkResult property.
     *
     * @return possible object is
     *         {@link EnvelopePDF }
     */
    public EnvelopePDF getRequestPDFNoWaterMarkResult() {
        return requestPDFNoWaterMarkResult;
    }

    /**
     * Sets the value of the requestPDFNoWaterMarkResult property.
     *
     * @param value allowed object is
     *              {@link EnvelopePDF }
     */
    public void setRequestPDFNoWaterMarkResult(EnvelopePDF value) {
        this.requestPDFNoWaterMarkResult = value;
    }

}
