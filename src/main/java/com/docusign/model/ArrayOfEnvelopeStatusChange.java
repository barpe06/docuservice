
package com.docusign.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfEnvelopeStatusChange complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="ArrayOfEnvelopeStatusChange">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EnvelopeStatusChange" type="{http://www.docusign.net/API/3.0}EnvelopeStatusChange" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfEnvelopeStatusChange", propOrder = {
        "envelopeStatusChange"
})
public class ArrayOfEnvelopeStatusChange {

    @XmlElement(name = "EnvelopeStatusChange")
    protected List<EnvelopeStatusChange> envelopeStatusChange;

    /**
     * Gets the value of the envelopeStatusChange property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the envelopeStatusChange property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnvelopeStatusChange().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link EnvelopeStatusChange }
     */
    public List<EnvelopeStatusChange> getEnvelopeStatusChange() {
        if (envelopeStatusChange == null) {
            envelopeStatusChange = new ArrayList<EnvelopeStatusChange>();
        }
        return this.envelopeStatusChange;
    }

}
