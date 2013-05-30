//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.30 at 06:06:19 PM MESZ 
//


package generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="Person" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Person_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Person_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
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

        @XmlElement(name = "Person_ID")
        protected int personID;
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
         * Gets the value of the personID property.
         * 
         */
        public int getPersonID() {
            return personID;
        }

        /**
         * Sets the value of the personID property.
         * 
         */
        public void setPersonID(int value) {
            this.personID = value;
        }

        /**
         * Gets the value of the typ property.
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
         * Sets the value of the typ property.
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
         * Gets the value of the vorname property.
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
         * Sets the value of the vorname property.
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
         * Gets the value of the nachname property.
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
         * Sets the value of the nachname property.
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
         * Gets the value of the alter property.
         * 
         */
        public int getAlter() {
            return alter;
        }

        /**
         * Sets the value of the alter property.
         * 
         */
        public void setAlter(int value) {
            this.alter = value;
        }

        /**
         * Gets the value of the betrieb property.
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
         * Sets the value of the betrieb property.
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
