
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
 *         &lt;element name="AcknowledgeAuthoritativeCopyExportResult" type="{http://www.docusign.net/API/3.0}AuthoritativeCopyExportStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "acknowledgeAuthoritativeCopyExportResult"
})
@XmlRootElement(name = "AcknowledgeAuthoritativeCopyExportResponse")
public class AcknowledgeAuthoritativeCopyExportResponse {

    @XmlElement(name = "AcknowledgeAuthoritativeCopyExportResult")
    protected AuthoritativeCopyExportStatus acknowledgeAuthoritativeCopyExportResult;

    /**
     * Gets the value of the acknowledgeAuthoritativeCopyExportResult property.
     *
     * @return possible object is
     *         {@link AuthoritativeCopyExportStatus }
     */
    public AuthoritativeCopyExportStatus getAcknowledgeAuthoritativeCopyExportResult() {
        return acknowledgeAuthoritativeCopyExportResult;
    }

    /**
     * Sets the value of the acknowledgeAuthoritativeCopyExportResult property.
     *
     * @param value allowed object is
     *              {@link AuthoritativeCopyExportStatus }
     */
    public void setAcknowledgeAuthoritativeCopyExportResult(AuthoritativeCopyExportStatus value) {
        this.acknowledgeAuthoritativeCopyExportResult = value;
    }

}
