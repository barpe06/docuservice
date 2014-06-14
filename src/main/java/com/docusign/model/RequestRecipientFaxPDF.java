
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
 *         &lt;element name="EnvelopeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClientUserID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AuthenticationAssertion" type="{http://www.docusign.net/API/3.0}RequestRecipientTokenAuthenticationAssertion" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "envelopeID",
        "clientUserID",
        "username",
        "email",
        "authenticationAssertion"
})
@XmlRootElement(name = "RequestRecipientFaxPDF")
public class RequestRecipientFaxPDF {

    @XmlElement(name = "EnvelopeID")
    protected String envelopeID;
    @XmlElement(name = "ClientUserID")
    protected String clientUserID;
    @XmlElement(name = "Username")
    protected String username;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "AuthenticationAssertion")
    protected RequestRecipientTokenAuthenticationAssertion authenticationAssertion;

    /**
     * Gets the value of the envelopeID property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getEnvelopeID() {
        return envelopeID;
    }

    /**
     * Sets the value of the envelopeID property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEnvelopeID(String value) {
        this.envelopeID = value;
    }

    /**
     * Gets the value of the clientUserID property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getClientUserID() {
        return clientUserID;
    }

    /**
     * Sets the value of the clientUserID property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setClientUserID(String value) {
        this.clientUserID = value;
    }

    /**
     * Gets the value of the username property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the email property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the authenticationAssertion property.
     *
     * @return possible object is
     *         {@link RequestRecipientTokenAuthenticationAssertion }
     */
    public RequestRecipientTokenAuthenticationAssertion getAuthenticationAssertion() {
        return authenticationAssertion;
    }

    /**
     * Sets the value of the authenticationAssertion property.
     *
     * @param value allowed object is
     *              {@link RequestRecipientTokenAuthenticationAssertion }
     */
    public void setAuthenticationAssertion(RequestRecipientTokenAuthenticationAssertion value) {
        this.authenticationAssertion = value;
    }

}
