//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.05.12 um 03:07:06 PM CEST 
//


package generated;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="Eintrag" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{}Person"/>
 *                   &lt;element name="Erstellungsdatum" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="Titel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Informationstext" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Startdatum" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="Ablaufdatum" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="Kommentare">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{}Person"/>
 *                             &lt;element name="Datum" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                             &lt;element name="Informationstext" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Typ">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="Angebot"/>
 *                         &lt;enumeration value="Gesuch"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
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
    "eintrag"
})
@XmlRootElement(name = "Boerse")
public class Boerse {

    @XmlElement(name = "Eintrag", required = true)
    protected List<Boerse.Eintrag> eintrag;

    /**
     * Gets the value of the eintrag property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eintrag property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEintrag().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Boerse.Eintrag }
     * 
     * 
     */
    public List<Boerse.Eintrag> getEintrag() {
        if (eintrag == null) {
            eintrag = new ArrayList<Boerse.Eintrag>();
        }
        return this.eintrag;
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
        "person",
        "erstellungsdatum",
        "titel",
        "informationstext",
        "startdatum",
        "ablaufdatum",
        "kommentare",
        "typ"
    })
    public static class Eintrag {

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
        protected Boerse.Eintrag.Kommentare kommentare;
        @XmlElement(name = "Typ", required = true)
        protected String typ;

        /**
         * Ruft den Wert der person-Eigenschaft ab.
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
         * Legt den Wert der person-Eigenschaft fest.
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
         * Ruft den Wert der erstellungsdatum-Eigenschaft ab.
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
         * Legt den Wert der erstellungsdatum-Eigenschaft fest.
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
         * Ruft den Wert der titel-Eigenschaft ab.
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
         * Legt den Wert der titel-Eigenschaft fest.
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
         * Ruft den Wert der informationstext-Eigenschaft ab.
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
         * Legt den Wert der informationstext-Eigenschaft fest.
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
         * Ruft den Wert der startdatum-Eigenschaft ab.
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
         * Legt den Wert der startdatum-Eigenschaft fest.
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
         * Ruft den Wert der ablaufdatum-Eigenschaft ab.
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
         * Legt den Wert der ablaufdatum-Eigenschaft fest.
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
         * Ruft den Wert der kommentare-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Boerse.Eintrag.Kommentare }
         *     
         */
        public Boerse.Eintrag.Kommentare getKommentare() {
            return kommentare;
        }

        /**
         * Legt den Wert der kommentare-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Boerse.Eintrag.Kommentare }
         *     
         */
        public void setKommentare(Boerse.Eintrag.Kommentare value) {
            this.kommentare = value;
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
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
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
             * Ruft den Wert der person-Eigenschaft ab.
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
             * Legt den Wert der person-Eigenschaft fest.
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
             * Ruft den Wert der datum-Eigenschaft ab.
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
             * Legt den Wert der datum-Eigenschaft fest.
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
             * Ruft den Wert der informationstext-Eigenschaft ab.
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
             * Legt den Wert der informationstext-Eigenschaft fest.
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

}
