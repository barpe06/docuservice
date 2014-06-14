
package com.docusign.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FilteredEnvelopeStatuses complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="FilteredEnvelopeStatuses">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResultSetSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EnvelopeStatusFilter" type="{http://www.docusign.net/API/3.0}EnvelopeStatusFilter" minOccurs="0"/>
 *         &lt;element name="EnvelopeStatuses" type="{http://www.docusign.net/API/3.0}ArrayOfEnvelopeStatus"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilteredEnvelopeStatuses", propOrder = {
        "resultSetSize",
        "envelopeStatusFilter",
        "envelopeStatuses"
})
public class FilteredEnvelopeStatuses {

    @XmlElement(name = "ResultSetSize")
    protected int resultSetSize;
    @XmlElement(name = "EnvelopeStatusFilter")
    protected EnvelopeStatusFilter envelopeStatusFilter;
    @XmlElement(name = "EnvelopeStatuses", required = true, nillable = true)
    protected ArrayOfEnvelopeStatus envelopeStatuses;

    /**
     * Gets the value of the resultSetSize property.
     */
    public int getResultSetSize() {
        return resultSetSize;
    }

    /**
     * Sets the value of the resultSetSize property.
     */
    public void setResultSetSize(int value) {
        this.resultSetSize = value;
    }

    /**
     * Gets the value of the envelopeStatusFilter property.
     *
     * @return possible object is
     *         {@link EnvelopeStatusFilter }
     */
    public EnvelopeStatusFilter getEnvelopeStatusFilter() {
        return envelopeStatusFilter;
    }

    /**
     * Sets the value of the envelopeStatusFilter property.
     *
     * @param value allowed object is
     *              {@link EnvelopeStatusFilter }
     */
    public void setEnvelopeStatusFilter(EnvelopeStatusFilter value) {
        this.envelopeStatusFilter = value;
    }

    /**
     * Gets the value of the envelopeStatuses property.
     *
     * @return possible object is
     *         {@link ArrayOfEnvelopeStatus }
     */
    public ArrayOfEnvelopeStatus getEnvelopeStatuses() {
        return envelopeStatuses;
    }

    /**
     * Sets the value of the envelopeStatuses property.
     *
     * @param value allowed object is
     *              {@link ArrayOfEnvelopeStatus }
     */
    public void setEnvelopeStatuses(ArrayOfEnvelopeStatus value) {
        this.envelopeStatuses = value;
    }

}
