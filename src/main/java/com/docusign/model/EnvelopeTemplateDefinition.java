
package com.docusign.model;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for EnvelopeTemplateDefinition complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="EnvelopeTemplateDefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TemplateID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="TemplatePassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TemplateDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastModified" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="PageCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnvelopeTemplateDefinition", propOrder = {
        "templateID",
        "name",
        "shared",
        "templatePassword",
        "templateDescription",
        "lastModified",
        "pageCount"
})
public class EnvelopeTemplateDefinition {

    @XmlElement(name = "TemplateID")
    protected String templateID;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Shared")
    protected boolean shared;
    @XmlElement(name = "TemplatePassword")
    protected String templatePassword;
    @XmlElement(name = "TemplateDescription")
    protected String templateDescription;
    @XmlElement(name = "LastModified")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModified;
    @XmlElement(name = "PageCount")
    protected Integer pageCount;

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
     * Gets the value of the shared property.
     */
    public boolean isShared() {
        return shared;
    }

    /**
     * Sets the value of the shared property.
     */
    public void setShared(boolean value) {
        this.shared = value;
    }

    /**
     * Gets the value of the templatePassword property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getTemplatePassword() {
        return templatePassword;
    }

    /**
     * Sets the value of the templatePassword property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTemplatePassword(String value) {
        this.templatePassword = value;
    }

    /**
     * Gets the value of the templateDescription property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getTemplateDescription() {
        return templateDescription;
    }

    /**
     * Sets the value of the templateDescription property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTemplateDescription(String value) {
        this.templateDescription = value;
    }

    /**
     * Gets the value of the lastModified property.
     *
     * @return possible object is
     *         {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getLastModified() {
        return lastModified;
    }

    /**
     * Sets the value of the lastModified property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setLastModified(XMLGregorianCalendar value) {
        this.lastModified = value;
    }

    /**
     * Gets the value of the pageCount property.
     *
     * @return possible object is
     *         {@link Integer }
     */
    public Integer getPageCount() {
        return pageCount;
    }

    /**
     * Sets the value of the pageCount property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setPageCount(Integer value) {
        this.pageCount = value;
    }

}
