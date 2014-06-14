
package com.docusign.model;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;


/**
 * <p>Java class for DocumentStatus complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="DocumentStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TemplateName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sequence" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="DocumentFields" type="{http://www.docusign.net/API/3.0}ArrayOfDocumentField" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentStatus", propOrder = {
        "id",
        "name",
        "templateName",
        "sequence",
        "documentFields"
})
public class DocumentStatus {

    @XmlElement(name = "ID")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger id;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "TemplateName")
    protected String templateName;
    @XmlElement(name = "Sequence")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger sequence;
    @XmlElement(name = "DocumentFields")
    protected ArrayOfDocumentField documentFields;

    /**
     * Gets the value of the id property.
     *
     * @return possible object is
     *         {@link BigInteger }
     */
    public BigInteger getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setID(BigInteger value) {
        this.id = value;
    }

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
     * Gets the value of the templateName property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * Sets the value of the templateName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTemplateName(String value) {
        this.templateName = value;
    }

    /**
     * Gets the value of the sequence property.
     *
     * @return possible object is
     *         {@link BigInteger }
     */
    public BigInteger getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     *
     * @param value allowed object is
     *              {@link BigInteger }
     */
    public void setSequence(BigInteger value) {
        this.sequence = value;
    }

    /**
     * Gets the value of the documentFields property.
     *
     * @return possible object is
     *         {@link ArrayOfDocumentField }
     */
    public ArrayOfDocumentField getDocumentFields() {
        return documentFields;
    }

    /**
     * Sets the value of the documentFields property.
     *
     * @param value allowed object is
     *              {@link ArrayOfDocumentField }
     */
    public void setDocumentFields(ArrayOfDocumentField value) {
        this.documentFields = value;
    }

}
