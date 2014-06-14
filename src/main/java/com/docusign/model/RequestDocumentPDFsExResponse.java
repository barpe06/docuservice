
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
 *         &lt;element name="RequestDocumentPDFsExResult" type="{http://www.docusign.net/API/3.0}DocumentPDFs" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "requestDocumentPDFsExResult"
})
@XmlRootElement(name = "RequestDocumentPDFsExResponse")
public class RequestDocumentPDFsExResponse {

    @XmlElement(name = "RequestDocumentPDFsExResult")
    protected DocumentPDFs requestDocumentPDFsExResult;

    /**
     * Gets the value of the requestDocumentPDFsExResult property.
     *
     * @return possible object is
     *         {@link DocumentPDFs }
     */
    public DocumentPDFs getRequestDocumentPDFsExResult() {
        return requestDocumentPDFsExResult;
    }

    /**
     * Sets the value of the requestDocumentPDFsExResult property.
     *
     * @param value allowed object is
     *              {@link DocumentPDFs }
     */
    public void setRequestDocumentPDFsExResult(DocumentPDFs value) {
        this.requestDocumentPDFsExResult = value;
    }

}
