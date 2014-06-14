
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
 *         &lt;element name="GetFolderItemsResult" type="{http://www.docusign.net/API/3.0}FolderResults" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "getFolderItemsResult"
})
@XmlRootElement(name = "GetFolderItemsResponse")
public class GetFolderItemsResponse {

    @XmlElement(name = "GetFolderItemsResult")
    protected FolderResults getFolderItemsResult;

    /**
     * Gets the value of the getFolderItemsResult property.
     *
     * @return possible object is
     *         {@link FolderResults }
     */
    public FolderResults getGetFolderItemsResult() {
        return getFolderItemsResult;
    }

    /**
     * Sets the value of the getFolderItemsResult property.
     *
     * @param value allowed object is
     *              {@link FolderResults }
     */
    public void setGetFolderItemsResult(FolderResults value) {
        this.getFolderItemsResult = value;
    }

}
