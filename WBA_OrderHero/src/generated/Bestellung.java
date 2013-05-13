//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.05.12 um 03:08:58 PM CEST 
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
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Bestellungs_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="Lieferdatum" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element ref="{}Person"/>
 *         &lt;element ref="{}Person"/>
 *         &lt;element ref="{}Betrieb"/>
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
        @XmlElementRef(name = "Produkt", type = Produkt.class ),
        @XmlElementRef(name = "Betrieb", type = Betrieb.class ),
        @XmlElementRef(name = "Lieferdatum", type = JAXBElement.class ),
        @XmlElementRef(name = "Person", type = Person.class ),
        @XmlElementRef(name = "Bestellungs_ID", type = JAXBElement.class ),
        @XmlElementRef(name = "Bestellungsart", type = JAXBElement.class ),
        @XmlElementRef(name = "Gesamtbetrag_Bestellung", type = JAXBElement.class ),
        @XmlElementRef(name = "Zahlungsart", type = JAXBElement.class ),
        @XmlElementRef(name = "Anzahl", type = JAXBElement.class )
    })
    protected List<Object> content;

    /**
     * Ruft das restliche Contentmodell ab. 
     * 
     * <p>
     * Sie rufen diese "catch-all"-Eigenschaft aus folgendem Grund ab: 
     * Der Feldname "Person" wird von zwei verschiedenen Teilen eines Schemas verwendet. Siehe: 
     * Zeile 28 von file:/Users/shereesamannshausen/Documents/workspace/OrderHero/src/XSD/Geschaeftspartnerliste.xsd
     * Zeile 27 von file:/Users/shereesamannshausen/Documents/workspace/OrderHero/src/XSD/Geschaeftspartnerliste.xsd
     * <p>
     * Um diese Eigenschaft zu entfernen, wenden Sie eine Eigenschaftenanpassung für eine
     * der beiden folgenden Deklarationen an, um deren Namen zu ändern: 
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
     * {@link Produkt }
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link Betrieb }
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link Person }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
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
