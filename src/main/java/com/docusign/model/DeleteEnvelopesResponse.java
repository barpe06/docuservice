
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
 *         &lt;element name="DeleteEnvelopesResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "deleteEnvelopesResult"
})
@XmlRootElement(name = "DeleteEnvelopesResponse")
public class DeleteEnvelopesResponse {

    @XmlElement(name = "DeleteEnvelopesResult")
    protected boolean deleteEnvelopesResult;

    /**
     * Gets the value of the deleteEnvelopesResult property.
     */
    public boolean isDeleteEnvelopesResult() {
        return deleteEnvelopesResult;
    }

    /**
     * Sets the value of the deleteEnvelopesResult property.
     */
    public void setDeleteEnvelopesResult(boolean value) {
        this.deleteEnvelopesResult = value;
    }

}
