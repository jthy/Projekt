//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.16 at 12:41:10 PM MESZ 
//


package generated;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="BoerseneintragsID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element ref="{}Person"/>
 *         &lt;element name="Erstellungsdatum" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Titel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Informationstext" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Startdatum" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Ablaufdatum" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Kommentare">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{}Person"/>
 *                   &lt;element name="Datum" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="Informationstext" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Typ">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Angebot"/>
 *               &lt;enumeration value="Gesuch"/>
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
    "boerseneintragsID",
    "person",
    "erstellungsdatum",
    "titel",
    "informationstext",
    "startdatum",
    "ablaufdatum",
    "kommentare",
    "typ"
})
@XmlRootElement(name = "BoersenEintrag")
public class BoersenEintrag {

    @XmlElement(name = "BoerseneintragsID", required = true)
    protected BigInteger boerseneintragsID;
    @XmlElement(name = "Person", required = true)
    protected Person person;
    @XmlElement(name = "Erstellungsdatum", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar erstellungsdatum;
    @XmlElement(name = "Titel", required = true)
    protected String titel;
    @XmlElement(name = "Informationstext", required = true)
    protected String informationstext;
    @XmlElement(name = "Startdatum", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startdatum;
    @XmlElement(name = "Ablaufdatum", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ablaufdatum;
    @XmlElement(name = "Kommentare", required = true)
    protected BoersenEintrag.Kommentare kommentare;
    @XmlElement(name = "Typ", required = true)
    protected String typ;

    /**
     * Gets the value of the boerseneintragsID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBoerseneintragsID() {
        return boerseneintragsID;
    }

    /**
     * Sets the value of the boerseneintragsID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBoerseneintragsID(BigInteger value) {
        this.boerseneintragsID = value;
    }

    /**
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setPerson(Person value) {
        this.person = value;
    }

    /**
     * Gets the value of the erstellungsdatum property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getErstellungsdatum() {
        return erstellungsdatum;
    }

    /**
     * Sets the value of the erstellungsdatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setErstellungsdatum(XMLGregorianCalendar value) {
        this.erstellungsdatum = value;
    }

    /**
     * Gets the value of the titel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitel() {
        return titel;
    }

    /**
     * Sets the value of the titel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitel(String value) {
        this.titel = value;
    }

    /**
     * Gets the value of the informationstext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInformationstext() {
        return informationstext;
    }

    /**
     * Sets the value of the informationstext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInformationstext(String value) {
        this.informationstext = value;
    }

    /**
     * Gets the value of the startdatum property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartdatum() {
        return startdatum;
    }

    /**
     * Sets the value of the startdatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartdatum(XMLGregorianCalendar value) {
        this.startdatum = value;
    }

    /**
     * Gets the value of the ablaufdatum property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAblaufdatum() {
        return ablaufdatum;
    }

    /**
     * Sets the value of the ablaufdatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAblaufdatum(XMLGregorianCalendar value) {
        this.ablaufdatum = value;
    }

    /**
     * Gets the value of the kommentare property.
     * 
     * @return
     *     possible object is
     *     {@link BoersenEintrag.Kommentare }
     *     
     */
    public BoersenEintrag.Kommentare getKommentare() {
        return kommentare;
    }

    /**
     * Sets the value of the kommentare property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoersenEintrag.Kommentare }
     *     
     */
    public void setKommentare(BoersenEintrag.Kommentare value) {
        this.kommentare = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{}Person"/>
     *         &lt;element name="Datum" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="Informationstext" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "person",
        "datum",
        "informationstext"
    })
    public static class Kommentare {

        @XmlElement(name = "Person", required = true)
        protected Person person;
        @XmlElement(name = "Datum", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar datum;
        @XmlElement(name = "Informationstext", required = true)
        protected String informationstext;

        /**
         * Gets the value of the person property.
         * 
         * @return
         *     possible object is
         *     {@link Person }
         *     
         */
        public Person getPerson() {
            return person;
        }

        /**
         * Sets the value of the person property.
         * 
         * @param value
         *     allowed object is
         *     {@link Person }
         *     
         */
        public void setPerson(Person value) {
            this.person = value;
        }

        /**
         * Gets the value of the datum property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDatum() {
            return datum;
        }

        /**
         * Sets the value of the datum property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDatum(XMLGregorianCalendar value) {
            this.datum = value;
        }

        /**
         * Gets the value of the informationstext property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInformationstext() {
            return informationstext;
        }

        /**
         * Sets the value of the informationstext property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInformationstext(String value) {
            this.informationstext = value;
        }

    }

}
