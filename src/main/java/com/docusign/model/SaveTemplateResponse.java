
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
 *         &lt;element name="SaveTemplateResult" type="{http://www.docusign.net/API/3.0}SaveTemplateResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "saveTemplateResult"
})
@XmlRootElement(name = "SaveTemplateResponse")
public class SaveTemplateResponse {

    @XmlElement(name = "SaveTemplateResult")
    protected SaveTemplateResult saveTemplateResult;

    /**
     * Gets the value of the saveTemplateResult property.
     *
     * @return possible object is
     *         {@link SaveTemplateResult }
     */
    public SaveTemplateResult getSaveTemplateResult() {
        return saveTemplateResult;
    }

    /**
     * Sets the value of the saveTemplateResult property.
     *
     * @param value allowed object is
     *              {@link SaveTemplateResult }
     */
    public void setSaveTemplateResult(SaveTemplateResult value) {
        this.saveTemplateResult = value;
    }

}
