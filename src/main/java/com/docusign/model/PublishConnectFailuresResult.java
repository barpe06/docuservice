
package com.docusign.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PublishConnectFailuresResult complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="PublishConnectFailuresResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EnvelopeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConfigId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConfigUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.docusign.net/API/3.0}ConnectPublishStatus"/>
 *         &lt;element name="StatusMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublishConnectFailuresResult", propOrder = {
        "envelopeId",
        "configId",
        "configUrl",
        "status",
        "statusMessage"
})
public class PublishConnectFailuresResult {

    @XmlElement(name = "EnvelopeId")
    protected String envelopeId;
    @XmlElement(name = "ConfigId")
    protected String configId;
    @XmlElement(name = "ConfigUrl")
    protected String configUrl;
    @XmlElement(name = "Status", required = true)
    protected ConnectPublishStatus status;
    @XmlElement(name = "StatusMessage")
    protected String statusMessage;

    /**
     * Gets the value of the envelopeId property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getEnvelopeId() {
        return envelopeId;
    }

    /**
     * Sets the value of the envelopeId property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEnvelopeId(String value) {
        this.envelopeId = value;
    }

    /**
     * Gets the value of the configId property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getConfigId() {
        return configId;
    }

    /**
     * Sets the value of the configId property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setConfigId(String value) {
        this.configId = value;
    }

    /**
     * Gets the value of the configUrl property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getConfigUrl() {
        return configUrl;
    }

    /**
     * Sets the value of the configUrl property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setConfigUrl(String value) {
        this.configUrl = value;
    }

    /**
     * Gets the value of the status property.
     *
     * @return possible object is
     *         {@link ConnectPublishStatus }
     */
    public ConnectPublishStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     *
     * @param value allowed object is
     *              {@link ConnectPublishStatus }
     */
    public void setStatus(ConnectPublishStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the statusMessage property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getStatusMessage() {
        return statusMessage;
    }

    /**
     * Sets the value of the statusMessage property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setStatusMessage(String value) {
        this.statusMessage = value;
    }

}
