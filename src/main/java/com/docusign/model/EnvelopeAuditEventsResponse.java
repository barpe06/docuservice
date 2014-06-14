
package com.docusign.model;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


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
 *         &lt;element name="EnvelopeAuditEventsResult" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;any/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "envelopeAuditEventsResult"
})
@XmlRootElement(name = "EnvelopeAuditEventsResponse")
public class EnvelopeAuditEventsResponse {

    @XmlElement(name = "EnvelopeAuditEventsResult")
    protected EnvelopeAuditEventsResponse.EnvelopeAuditEventsResult envelopeAuditEventsResult;

    /**
     * Gets the value of the envelopeAuditEventsResult property.
     *
     * @return possible object is
     *         {@link EnvelopeAuditEventsResponse.EnvelopeAuditEventsResult }
     */
    public EnvelopeAuditEventsResponse.EnvelopeAuditEventsResult getEnvelopeAuditEventsResult() {
        return envelopeAuditEventsResult;
    }

    /**
     * Sets the value of the envelopeAuditEventsResult property.
     *
     * @param value allowed object is
     *              {@link EnvelopeAuditEventsResponse.EnvelopeAuditEventsResult }
     */
    public void setEnvelopeAuditEventsResult(EnvelopeAuditEventsResponse.EnvelopeAuditEventsResult value) {
        this.envelopeAuditEventsResult = value;
    }


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
     *         &lt;any/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "content"
    })
    public static class EnvelopeAuditEventsResult {

        @XmlMixed
        @XmlAnyElement(lax = true)
        protected List<Object> content;

        /**
         * Gets the value of the content property.
         * <p/>
         * <p/>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the content property.
         * <p/>
         * <p/>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContent().add(newItem);
         * </pre>
         * <p/>
         * <p/>
         * <p/>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * {@link Object }
         */
        public List<Object> getContent() {
            if (content == null) {
                content = new ArrayList<Object>();
            }
            return this.content;
        }

    }

}
