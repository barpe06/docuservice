
package com.docusign.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TabTypeCode.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;simpleType name="TabTypeCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="InitialHere"/>
 *     &lt;enumeration value="SignHere"/>
 *     &lt;enumeration value="FullName"/>
 *     &lt;enumeration value="FirstName"/>
 *     &lt;enumeration value="LastName"/>
 *     &lt;enumeration value="EmailAddress"/>
 *     &lt;enumeration value="Company"/>
 *     &lt;enumeration value="Title"/>
 *     &lt;enumeration value="DateSigned"/>
 *     &lt;enumeration value="InitialHereOptional"/>
 *     &lt;enumeration value="EnvelopeID"/>
 *     &lt;enumeration value="Custom"/>
 *     &lt;enumeration value="SignerAttachment"/>
 *     &lt;enumeration value="SignHereOptional"/>
 *     &lt;enumeration value="Approve"/>
 *     &lt;enumeration value="Decline"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "TabTypeCode")
@XmlEnum
public enum TabTypeCode {

    @XmlEnumValue("InitialHere")
    INITIAL_HERE("InitialHere"),
    @XmlEnumValue("SignHere")
    SIGN_HERE("SignHere"),
    @XmlEnumValue("FullName")
    FULL_NAME("FullName"),
    @XmlEnumValue("FirstName")
    FIRST_NAME("FirstName"),
    @XmlEnumValue("LastName")
    LAST_NAME("LastName"),
    @XmlEnumValue("EmailAddress")
    EMAIL_ADDRESS("EmailAddress"),
    @XmlEnumValue("Company")
    COMPANY("Company"),
    @XmlEnumValue("Title")
    TITLE("Title"),
    @XmlEnumValue("DateSigned")
    DATE_SIGNED("DateSigned"),
    @XmlEnumValue("InitialHereOptional")
    INITIAL_HERE_OPTIONAL("InitialHereOptional"),
    @XmlEnumValue("EnvelopeID")
    ENVELOPE_ID("EnvelopeID"),
    @XmlEnumValue("Custom")
    CUSTOM("Custom"),
    @XmlEnumValue("SignerAttachment")
    SIGNER_ATTACHMENT("SignerAttachment"),
    @XmlEnumValue("SignHereOptional")
    SIGN_HERE_OPTIONAL("SignHereOptional"),
    @XmlEnumValue("Approve")
    APPROVE("Approve"),
    @XmlEnumValue("Decline")
    DECLINE("Decline");
    private final String value;

    TabTypeCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TabTypeCode fromValue(String v) {
        for (TabTypeCode c : TabTypeCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
