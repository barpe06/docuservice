
package com.docusign.model;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;


/**
 * <p>Java class for PDFMetaDataTemplate complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="PDFMetaDataTemplate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Sequence" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PDFMetaDataTemplate", propOrder = {
        "sequence"
})
public class PDFMetaDataTemplate {

    @XmlElement(name = "Sequence")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger sequence;

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

}
