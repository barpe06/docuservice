
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
 *         &lt;element name="UploadTemplateResult" type="{http://www.docusign.net/API/3.0}SaveTemplateResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "uploadTemplateResult"
})
@XmlRootElement(name = "UploadTemplateResponse")
public class UploadTemplateResponse {

    @XmlElement(name = "UploadTemplateResult")
    protected SaveTemplateResult uploadTemplateResult;

    /**
     * Gets the value of the uploadTemplateResult property.
     *
     * @return possible object is
     *         {@link SaveTemplateResult }
     */
    public SaveTemplateResult getUploadTemplateResult() {
        return uploadTemplateResult;
    }

    /**
     * Sets the value of the uploadTemplateResult property.
     *
     * @param value allowed object is
     *              {@link SaveTemplateResult }
     */
    public void setUploadTemplateResult(SaveTemplateResult value) {
        this.uploadTemplateResult = value;
    }

}
