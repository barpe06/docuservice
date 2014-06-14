
package com.docusign.model;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;


/**
 * <p>Java class for DocumentPDF complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="DocumentPDF">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PDFBytes" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="DocumentID" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="DocumentType" type="{http://www.docusign.net/API/3.0}DocumentType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentPDF", propOrder = {
        "name",
        "pdfBytes",
        "documentID",
        "documentType"
})
public class DocumentPDF {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "PDFBytes")
    protected byte[] pdfBytes;
    @XmlElement(name = "DocumentID")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger documentID;
    @XmlElement(name = "DocumentType")
    protected DocumentType documentType;

    /**
     * Gets the value of the name property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the pdfBytes property.
     *
     * @return possible object is
     *         byte[]
     */
    public byte[] getPDFBytes() {
        return pdfBytes;
    }

    /**
     * Sets the value of the pdfBytes property.
     *
     * @param value allowed object is
     *              byte[]
     */
    public void setPDFBytes(byte[] value) {
        this.pdfBytes = ((byte[]) value);
    }

    /**
     * Gets the value of the documentID property.
     *
     * @return possible object is
     *         {@link BigInteger }
     */
    public BigInteger getDocumentID() {
        return documentID;
    }

    /**
     * Sets the value of the documentID property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setDocumentID(BigInteger value) {
        this.documentID = value;
    }

    /**
     * Gets the value of the documentType property.
     *
     * @return possible object is
     *         {@link DocumentType }
     */
    public DocumentType getDocumentType() {
        return documentType;
    }

    /**
     * Sets the value of the documentType property.
     *
     * @param value allowed object is
     *              {@link DocumentType }
     */
    public void setDocumentType(DocumentType value) {
        this.documentType = value;
    }

}
