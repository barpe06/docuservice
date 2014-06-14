
package com.docusign.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnvelopeStatusCode.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;simpleType name="EnvelopeStatusCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Any"/>
 *     &lt;enumeration value="Voided"/>
 *     &lt;enumeration value="Created"/>
 *     &lt;enumeration value="Deleted"/>
 *     &lt;enumeration value="Sent"/>
 *     &lt;enumeration value="Delivered"/>
 *     &lt;enumeration value="Signed"/>
 *     &lt;enumeration value="Completed"/>
 *     &lt;enumeration value="Declined"/>
 *     &lt;enumeration value="TimedOut"/>
 *     &lt;enumeration value="Template"/>
 *     &lt;enumeration value="Processing"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "EnvelopeStatusCode")
@XmlEnum
public enum EnvelopeStatusCode {

    @XmlEnumValue("Any")
    ANY("Any"),
    @XmlEnumValue("Voided")
    VOIDED("Voided"),
    @XmlEnumValue("Created")
    CREATED("Created"),
    @XmlEnumValue("Deleted")
    DELETED("Deleted"),
    @XmlEnumValue("Sent")
    SENT("Sent"),
    @XmlEnumValue("Delivered")
    DELIVERED("Delivered"),
    @XmlEnumValue("Signed")
    SIGNED("Signed"),
    @XmlEnumValue("Completed")
    COMPLETED("Completed"),
    @XmlEnumValue("Declined")
    DECLINED("Declined"),
    @XmlEnumValue("TimedOut")
    TIMED_OUT("TimedOut"),
    @XmlEnumValue("Template")
    TEMPLATE("Template"),
    @XmlEnumValue("Processing")
    PROCESSING("Processing");
    private final String value;

    EnvelopeStatusCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnvelopeStatusCode fromValue(String v) {
        for (EnvelopeStatusCode c : EnvelopeStatusCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
