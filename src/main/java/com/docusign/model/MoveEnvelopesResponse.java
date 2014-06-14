
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
 *         &lt;element name="MoveEnvelopesResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "moveEnvelopesResult"
})
@XmlRootElement(name = "MoveEnvelopesResponse")
public class MoveEnvelopesResponse {

    @XmlElement(name = "MoveEnvelopesResult")
    protected boolean moveEnvelopesResult;

    /**
     * Gets the value of the moveEnvelopesResult property.
     */
    public boolean isMoveEnvelopesResult() {
        return moveEnvelopesResult;
    }

    /**
     * Sets the value of the moveEnvelopesResult property.
     */
    public void setMoveEnvelopesResult(boolean value) {
        this.moveEnvelopesResult = value;
    }

}
