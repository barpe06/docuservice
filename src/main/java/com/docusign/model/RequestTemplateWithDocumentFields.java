
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
 *         &lt;element name="TemplateID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IncludeDocumentBytes" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "templateID",
        "includeDocumentBytes"
})
@XmlRootElement(name = "RequestTemplateWithDocumentFields")
public class RequestTemplateWithDocumentFields {

    @XmlElement(name = "TemplateID")
    protected String templateID;
    @XmlElement(name = "IncludeDocumentBytes")
    protected boolean includeDocumentBytes;

    /**
     * Gets the value of the templateID property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getTemplateID() {
        return templateID;
    }

    /**
     * Sets the value of the templateID property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTemplateID(String value) {
        this.templateID = value;
    }

    /**
     * Gets the value of the includeDocumentBytes property.
     */
    public boolean isIncludeDocumentBytes() {
        return includeDocumentBytes;
    }

    /**
     * Sets the value of the includeDocumentBytes property.
     */
    public void setIncludeDocumentBytes(boolean value) {
        this.includeDocumentBytes = value;
    }

}
