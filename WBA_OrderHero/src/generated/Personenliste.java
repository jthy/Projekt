//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.05.12 um 03:49:00 PM CEST 
//


package generated;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="Person" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Person_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="Typ">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="Gastronom"/>
 *                         &lt;enumeration value="Lieferant"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="Vorname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Nachname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Alter">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                         &lt;minInclusive value="18"/>
 *                         &lt;maxInclusive value="100"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element ref="{}Betrieb"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
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
    "person"
})
@XmlRootElement(name = "Personenliste")
public class Personenliste {

    @XmlElement(name = "Person", required = true)
    protected List<Personenliste.Person> person;

    /**
     * Gets the value of the person property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the person property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPerson().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Personenliste.Person }
     * 
     * 
     */
    public List<Personenliste.Person> getPerson() {
        if (person == null) {
            person = new ArrayList<Personenliste.Person>();
        }
        return this.person;
    }


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
     *         &lt;element name="Person_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="Typ">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="Gastronom"/>
     *               &lt;enumeration value="Lieferant"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="Vorname" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Nachname" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Alter">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *               &lt;minInclusive value="18"/>
     *               &lt;maxInclusive value="100"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element ref="{}Betrieb"/>
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
        "personID",
        "typ",
        "vorname",
        "nachname",
        "alter",
        "betrieb"
    })
    public static class Person {

        @XmlElement(name = "Person_ID", required = true)
        protected BigInteger personID;
        @XmlElement(name = "Typ", required = true)
        protected String typ;
        @XmlElement(name = "Vorname", required = true)
        protected String vorname;
        @XmlElement(name = "Nachname", required = true)
        protected String nachname;
        @XmlElement(name = "Alter")
        protected int alter;
        @XmlElement(name = "Betrieb", required = true)
        protected Betrieb betrieb;

        /**
         * Ruft den Wert der personID-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getPersonID() {
            return personID;
        }

        /**
         * Legt den Wert der personID-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setPersonID(BigInteger value) {
            this.personID = value;
        }

        /**
         * Ruft den Wert der typ-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTyp() {
            return typ;
        }

        /**
         * Legt den Wert der typ-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTyp(String value) {
            this.typ = value;
        }

        /**
         * Ruft den Wert der vorname-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVorname() {
            return vorname;
        }

        /**
         * Legt den Wert der vorname-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVorname(String value) {
            this.vorname = value;
        }

        /**
         * Ruft den Wert der nachname-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNachname() {
            return nachname;
        }

        /**
         * Legt den Wert der nachname-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNachname(String value) {
            this.nachname = value;
        }

        /**
         * Ruft den Wert der alter-Eigenschaft ab.
         * 
         */
        public int getAlter() {
            return alter;
        }

        /**
         * Legt den Wert der alter-Eigenschaft fest.
         * 
         */
        public void setAlter(int value) {
            this.alter = value;
        }

        /**
         * Ruft den Wert der betrieb-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Betrieb }
         *     
         */
        public Betrieb getBetrieb() {
            return betrieb;
        }

        /**
         * Legt den Wert der betrieb-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Betrieb }
         *     
         */
        public void setBetrieb(Betrieb value) {
            this.betrieb = value;
        }

    }

}
