
package com.docusign.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Notification complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="Notification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UseAccountDefaults" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Reminders" type="{http://www.docusign.net/API/3.0}Reminders" minOccurs="0"/>
 *         &lt;element name="Expirations" type="{http://www.docusign.net/API/3.0}Expirations" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Notification", propOrder = {
        "useAccountDefaults",
        "reminders",
        "expirations"
})
public class Notification {

    @XmlElement(name = "UseAccountDefaults")
    protected Boolean useAccountDefaults;
    @XmlElement(name = "Reminders")
    protected Reminders reminders;
    @XmlElement(name = "Expirations")
    protected Expirations expirations;

    /**
     * Gets the value of the useAccountDefaults property.
     *
     * @return possible object is
     *         {@link Boolean }
     */
    public Boolean isUseAccountDefaults() {
        return useAccountDefaults;
    }

    /**
     * Sets the value of the useAccountDefaults property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setUseAccountDefaults(Boolean value) {
        this.useAccountDefaults = value;
    }

    /**
     * Gets the value of the reminders property.
     *
     * @return possible object is
     *         {@link Reminders }
     */
    public Reminders getReminders() {
        return reminders;
    }

    /**
     * Sets the value of the reminders property.
     *
     * @param value allowed object is
     *              {@link Reminders }
     */
    public void setReminders(Reminders value) {
        this.reminders = value;
    }

    /**
     * Gets the value of the expirations property.
     *
     * @return possible object is
     *         {@link Expirations }
     */
    public Expirations getExpirations() {
        return expirations;
    }

    /**
     * Sets the value of the expirations property.
     *
     * @param value allowed object is
     *              {@link Expirations }
     */
    public void setExpirations(Expirations value) {
        this.expirations = value;
    }

}
