
package com.docusign.model;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for EnvelopeStatusFilterBeginDateTime complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="EnvelopeStatusFilterBeginDateTime">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>dateTime">
 *       &lt;attribute name="statusQualifier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnvelopeStatusFilterBeginDateTime", propOrder = {
        "value"
})
public class EnvelopeStatusFilterBeginDateTime {

    @XmlValue
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar value;
    @XmlAttribute(namespace = "http://www.docusign.net/API/3.0")
    protected String statusQualifier;

    /**
     * Gets the value of the value property.
     *
     * @return possible object is
     *         {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setValue(XMLGregorianCalendar value) {
        this.value = value;
    }

    /**
     * Gets the value of the statusQualifier property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getStatusQualifier() {
        return statusQualifier;
    }

    /**
     * Sets the value of the statusQualifier property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setStatusQualifier(String value) {
        this.statusQualifier = value;
    }

}
