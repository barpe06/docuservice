
package com.docusign.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for AuthoritativeCopyExportDocuments complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="AuthoritativeCopyExportDocuments">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EnvelopeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DocumentPDF" type="{http://www.docusign.net/API/3.0}DocumentPDF" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthoritativeCopyExportDocuments", propOrder = {
        "envelopeId",
        "transactionId",
        "count",
        "documentPDF"
})
public class AuthoritativeCopyExportDocuments {

    @XmlElement(name = "EnvelopeId")
    protected String envelopeId;
    @XmlElement(name = "TransactionId")
    protected String transactionId;
    @XmlElement(name = "Count")
    protected int count;
    @XmlElement(name = "DocumentPDF")
    protected List<DocumentPDF> documentPDF;

    /**
     * Gets the value of the envelopeId property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getEnvelopeId() {
        return envelopeId;
    }

    /**
     * Sets the value of the envelopeId property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEnvelopeId(String value) {
        this.envelopeId = value;
    }

    /**
     * Gets the value of the transactionId property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTransactionId(String value) {
        this.transactionId = value;
    }

    /**
     * Gets the value of the count property.
     */
    public int getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     */
    public void setCount(int value) {
        this.count = value;
    }

    /**
     * Gets the value of the documentPDF property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentPDF property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentPDF().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentPDF }
     */
    public List<DocumentPDF> getDocumentPDF() {
        if (documentPDF == null) {
            documentPDF = new ArrayList<DocumentPDF>();
        }
        return this.documentPDF;
    }

}
