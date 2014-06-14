
package com.docusign.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfInlineTemplate complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="ArrayOfInlineTemplate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InlineTemplate" type="{http://www.docusign.net/API/3.0}InlineTemplate" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfInlineTemplate", propOrder = {
        "inlineTemplate"
})
public class ArrayOfInlineTemplate {

    @XmlElement(name = "InlineTemplate")
    protected List<InlineTemplate> inlineTemplate;

    /**
     * Gets the value of the inlineTemplate property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inlineTemplate property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInlineTemplate().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link InlineTemplate }
     */
    public List<InlineTemplate> getInlineTemplate() {
        if (inlineTemplate == null) {
            inlineTemplate = new ArrayList<InlineTemplate>();
        }
        return this.inlineTemplate;
    }

}
