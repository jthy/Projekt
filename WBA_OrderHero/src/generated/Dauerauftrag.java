//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.05.12 um 03:07:14 PM CEST 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element ref="{}Bestellung"/>
 *         &lt;element name="Beginn" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="Ende" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Regelmaeßigkeit">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="monatlich"/>
 *               &lt;enumeration value="woechentlich"/>
 *               &lt;enumeration value="taeglich"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
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
    "bestellung",
    "beginn",
    "ende",
    "regelmae\u00dfigkeit"
})
@XmlRootElement(name = "Dauerauftrag")
public class Dauerauftrag {

    @XmlElement(name = "Bestellung", required = true)
    protected Bestellung bestellung;
    @XmlElement(name = "Beginn", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar beginn;
    @XmlElement(name = "Ende")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ende;
    @XmlElement(name = "Regelmae\u00dfigkeit", required = true)
    protected String regelmaeßigkeit;

    /**
     * Ruft den Wert der bestellung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Bestellung }
     *     
     */
    public Bestellung getBestellung() {
        return bestellung;
    }

    /**
     * Legt den Wert der bestellung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Bestellung }
     *     
     */
    public void setBestellung(Bestellung value) {
        this.bestellung = value;
    }

    /**
     * Ruft den Wert der beginn-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBeginn() {
        return beginn;
    }

    /**
     * Legt den Wert der beginn-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBeginn(XMLGregorianCalendar value) {
        this.beginn = value;
    }

    /**
     * Ruft den Wert der ende-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEnde() {
        return ende;
    }

    /**
     * Legt den Wert der ende-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEnde(XMLGregorianCalendar value) {
        this.ende = value;
    }

    /**
     * Ruft den Wert der regelmaeßigkeit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegelmaeßigkeit() {
        return regelmaeßigkeit;
    }

    /**
     * Legt den Wert der regelmaeßigkeit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegelmaeßigkeit(String value) {
        this.regelmaeßigkeit = value;
    }

}
