
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
 *         &lt;element name="ExportAuthoritativeCopyResult" type="{http://www.docusign.net/API/3.0}AuthoritativeCopyExportDocuments" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "exportAuthoritativeCopyResult"
})
@XmlRootElement(name = "ExportAuthoritativeCopyResponse")
public class ExportAuthoritativeCopyResponse {

    @XmlElement(name = "ExportAuthoritativeCopyResult")
    protected AuthoritativeCopyExportDocuments exportAuthoritativeCopyResult;

    /**
     * Gets the value of the exportAuthoritativeCopyResult property.
     *
     * @return possible object is
     *         {@link AuthoritativeCopyExportDocuments }
     */
    public AuthoritativeCopyExportDocuments getExportAuthoritativeCopyResult() {
        return exportAuthoritativeCopyResult;
    }

    /**
     * Sets the value of the exportAuthoritativeCopyResult property.
     *
     * @param value allowed object is
     *              {@link AuthoritativeCopyExportDocuments }
     */
    public void setExportAuthoritativeCopyResult(AuthoritativeCopyExportDocuments value) {
        this.exportAuthoritativeCopyResult = value;
    }

}
