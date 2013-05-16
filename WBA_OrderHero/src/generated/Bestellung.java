//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.16 at 01:29:47 PM MESZ 
//


package generated;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Bestellungs_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="Lieferdatum" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element ref="{}Person"/>
 *         &lt;element ref="{}Betrieb"/>
 *         &lt;element ref="{}Person"/>
 *         &lt;element ref="{}Betrieb"/>
 *         &lt;element name="Anzahl" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element ref="{}Produkt"/>
 *         &lt;element name="Bestellungsart">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Dauerauftrag"/>
 *               &lt;enumeration value="Einmalige_Bestellung"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Zahlungsart">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Rechnung"/>
 *               &lt;enumeration value="Lastschrift"/>
 *               &lt;enumeration value="Vorkasse"/>
 *               &lt;enumeration value="PayPal"/>
 *               &lt;enumeration value="Kreditkarte"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Gesamtbetrag_Bestellung" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "Bestellung")
public class Bestellung {

    @XmlElementRefs({
        @XmlElementRef(name = "Lieferdatum", type = JAXBElement.class),
        @XmlElementRef(name = "Bestellungsart", type = JAXBElement.class),
        @XmlElementRef(name = "Betrieb", type = Betrieb.class),
        @XmlElementRef(name = "Produkt", type = Produkt.class),
        @XmlElementRef(name = "Gesamtbetrag_Bestellung", type = JAXBElement.class),
        @XmlElementRef(name = "Zahlungsart", type = JAXBElement.class),
        @XmlElementRef(name = "Person", type = Person.class),
        @XmlElementRef(name = "Bestellungs_ID", type = JAXBElement.class),
        @XmlElementRef(name = "Anzahl", type = JAXBElement.class)
    })
    protected List<Object> content;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "Person" is used by two different parts of a schema. See: 
     * line 109 of file:/Users/juliathyssen/git/Projekt/WBA_OrderHero/src/XSD/OrderHero.xsd
     * line 107 of file:/Users/juliathyssen/git/Projekt/WBA_OrderHero/src/XSD/OrderHero.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link Produkt }
     * {@link Betrieb }
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link Person }
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * 
     */
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
    }

}
