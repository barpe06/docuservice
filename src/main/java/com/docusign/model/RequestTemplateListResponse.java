
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
 *         &lt;element name="RequestTemplateListResult" type="{http://www.docusign.net/API/3.0}ArrayOfEnvelopeTemplate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "requestTemplateListResult"
})
@XmlRootElement(name = "RequestTemplateListResponse")
public class RequestTemplateListResponse {

    @XmlElement(name = "RequestTemplateListResult")
    protected ArrayOfEnvelopeTemplate requestTemplateListResult;

    /**
     * Gets the value of the requestTemplateListResult property.
     *
     * @return possible object is
     *         {@link ArrayOfEnvelopeTemplate }
     */
    public ArrayOfEnvelopeTemplate getRequestTemplateListResult() {
        return requestTemplateListResult;
    }

    /**
     * Sets the value of the requestTemplateListResult property.
     *
     * @param value allowed object is
     *              {@link ArrayOfEnvelopeTemplate }
     */
    public void setRequestTemplateListResult(ArrayOfEnvelopeTemplate value) {
        this.requestTemplateListResult = value;
    }

}
