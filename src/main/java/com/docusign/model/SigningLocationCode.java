
package com.docusign.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SigningLocationCode.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;simpleType name="SigningLocationCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="InPerson"/>
 *     &lt;enumeration value="Online"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "SigningLocationCode")
@XmlEnum
public enum SigningLocationCode {

    @XmlEnumValue("InPerson")
    IN_PERSON("InPerson"),
    @XmlEnumValue("Online")
    ONLINE("Online");
    private final String value;

    SigningLocationCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SigningLocationCode fromValue(String v) {
        for (SigningLocationCode c : SigningLocationCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
