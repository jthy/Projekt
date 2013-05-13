//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.05.12 um 03:08:34 PM CEST 
//


package generated;

import java.math.BigInteger;
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
 *         &lt;element name="Bestand">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{}Produkt"/>
 *                   &lt;element name="Anzahl" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="Verfuegbarkeit">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="verfuegbar"/>
 *                         &lt;enumeration value="momentan_nicht_verfuegbar"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Bestellungsliste">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{}Bestellung"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Boerse">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Eintrag">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{}Person"/>
 *                             &lt;element name="Erstellungsdatum" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                             &lt;element name="Titel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Informationstext" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Startdatum" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                             &lt;element name="Ablaufdatum" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                             &lt;element name="Kommentare">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element ref="{}Person"/>
 *                                       &lt;element name="Datum" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                                       &lt;element name="Informationstext" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Typ">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="Angebot"/>
 *                                   &lt;enumeration value="Gesuch"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Geschaeftspartnerliste">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Listentyp">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="Kundenliste"/>
 *                         &lt;enumeration value="Lieferantenliste"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element ref="{}Person"/>
 *                   &lt;element ref="{}Bestellung" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Produkte">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{}Produkt"/>
 *                   &lt;element name="Verfuegbarkeit">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="verfuegbar"/>
 *                         &lt;enumeration value="momentan_nicht_verfuegbar"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element ref="{}Person"/>
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
    "bestand",
    "bestellungsliste",
    "boerse",
    "geschaeftspartnerliste",
    "produkte"
})
@XmlRootElement(name = "OrderHero")
public class OrderHero {

    @XmlElement(name = "Bestand", required = true)
    protected OrderHero.Bestand bestand;
    @XmlElement(name = "Bestellungsliste", required = true)
    protected OrderHero.Bestellungsliste bestellungsliste;
    @XmlElement(name = "Boerse", required = true)
    protected OrderHero.Boerse boerse;
    @XmlElement(name = "Geschaeftspartnerliste", required = true)
    protected OrderHero.Geschaeftspartnerliste geschaeftspartnerliste;
    @XmlElement(name = "Produkte", required = true)
    protected OrderHero.Produkte produkte;

    /**
     * Ruft den Wert der bestand-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OrderHero.Bestand }
     *     
     */
    public OrderHero.Bestand getBestand() {
        return bestand;
    }

    /**
     * Legt den Wert der bestand-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderHero.Bestand }
     *     
     */
    public void setBestand(OrderHero.Bestand value) {
        this.bestand = value;
    }

    /**
     * Ruft den Wert der bestellungsliste-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OrderHero.Bestellungsliste }
     *     
     */
    public OrderHero.Bestellungsliste getBestellungsliste() {
        return bestellungsliste;
    }

    /**
     * Legt den Wert der bestellungsliste-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderHero.Bestellungsliste }
     *     
     */
    public void setBestellungsliste(OrderHero.Bestellungsliste value) {
        this.bestellungsliste = value;
    }

    /**
     * Ruft den Wert der boerse-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OrderHero.Boerse }
     *     
     */
    public OrderHero.Boerse getBoerse() {
        return boerse;
    }

    /**
     * Legt den Wert der boerse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderHero.Boerse }
     *     
     */
    public void setBoerse(OrderHero.Boerse value) {
        this.boerse = value;
    }

    /**
     * Ruft den Wert der geschaeftspartnerliste-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OrderHero.Geschaeftspartnerliste }
     *     
     */
    public OrderHero.Geschaeftspartnerliste getGeschaeftspartnerliste() {
        return geschaeftspartnerliste;
    }

    /**
     * Legt den Wert der geschaeftspartnerliste-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderHero.Geschaeftspartnerliste }
     *     
     */
    public void setGeschaeftspartnerliste(OrderHero.Geschaeftspartnerliste value) {
        this.geschaeftspartnerliste = value;
    }

    /**
     * Ruft den Wert der produkte-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OrderHero.Produkte }
     *     
     */
    public OrderHero.Produkte getProdukte() {
        return produkte;
    }

    /**
     * Legt den Wert der produkte-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderHero.Produkte }
     *     
     */
    public void setProdukte(OrderHero.Produkte value) {
        this.produkte = value;
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
     *         &lt;element ref="{}Produkt"/>
     *         &lt;element name="Anzahl" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="Verfuegbarkeit">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="verfuegbar"/>
     *               &lt;enumeration value="momentan_nicht_verfuegbar"/>
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
        "produkt",
        "anzahl",
        "verfuegbarkeit"
    })
    public static class Bestand {

        @XmlElement(name = "Produkt", required = true)
        protected Produkt produkt;
        @XmlElement(name = "Anzahl", required = true)
        protected BigInteger anzahl;
        @XmlElement(name = "Verfuegbarkeit", required = true)
        protected String verfuegbarkeit;

        /**
         * Ruft den Wert der produkt-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Produkt }
         *     
         */
        public Produkt getProdukt() {
            return produkt;
        }

        /**
         * Legt den Wert der produkt-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Produkt }
         *     
         */
        public void setProdukt(Produkt value) {
            this.produkt = value;
        }

        /**
         * Ruft den Wert der anzahl-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getAnzahl() {
            return anzahl;
        }

        /**
         * Legt den Wert der anzahl-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setAnzahl(BigInteger value) {
            this.anzahl = value;
        }

        /**
         * Ruft den Wert der verfuegbarkeit-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVerfuegbarkeit() {
            return verfuegbarkeit;
        }

        /**
         * Legt den Wert der verfuegbarkeit-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVerfuegbarkeit(String value) {
            this.verfuegbarkeit = value;
        }

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
     *         &lt;element ref="{}Bestellung"/>
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
        "bestellung"
    })
    public static class Bestellungsliste {

        @XmlElement(name = "Bestellung", required = true)
        protected Bestellung bestellung;

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
     *         &lt;element name="Eintrag">
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
    public static class Boerse {

        @XmlElement(name = "Eintrag", required = true)
        protected OrderHero.Boerse.Eintrag eintrag;

        /**
         * Ruft den Wert der eintrag-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link OrderHero.Boerse.Eintrag }
         *     
         */
        public OrderHero.Boerse.Eintrag getEintrag() {
            return eintrag;
        }

        /**
         * Legt den Wert der eintrag-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link OrderHero.Boerse.Eintrag }
         *     
         */
        public void setEintrag(OrderHero.Boerse.Eintrag value) {
            this.eintrag = value;
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
            protected OrderHero.Boerse.Eintrag.Kommentare kommentare;
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
             *     {@link OrderHero.Boerse.Eintrag.Kommentare }
             *     
             */
            public OrderHero.Boerse.Eintrag.Kommentare getKommentare() {
                return kommentare;
            }

            /**
             * Legt den Wert der kommentare-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link OrderHero.Boerse.Eintrag.Kommentare }
             *     
             */
            public void setKommentare(OrderHero.Boerse.Eintrag.Kommentare value) {
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
     *         &lt;element name="Listentyp">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="Kundenliste"/>
     *               &lt;enumeration value="Lieferantenliste"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element ref="{}Person"/>
     *         &lt;element ref="{}Bestellung" maxOccurs="unbounded"/>
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
        "listentyp",
        "person",
        "bestellung"
    })
    public static class Geschaeftspartnerliste {

        @XmlElement(name = "Listentyp", required = true)
        protected String listentyp;
        @XmlElement(name = "Person", required = true)
        protected Person person;
        @XmlElement(name = "Bestellung", required = true)
        protected List<Bestellung> bestellung;

        /**
         * Ruft den Wert der listentyp-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getListentyp() {
            return listentyp;
        }

        /**
         * Legt den Wert der listentyp-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setListentyp(String value) {
            this.listentyp = value;
        }

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
         * Gets the value of the bestellung property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bestellung property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBestellung().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Bestellung }
         * 
         * 
         */
        public List<Bestellung> getBestellung() {
            if (bestellung == null) {
                bestellung = new ArrayList<Bestellung>();
            }
            return this.bestellung;
        }

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
     *         &lt;element ref="{}Produkt"/>
     *         &lt;element name="Verfuegbarkeit">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="verfuegbar"/>
     *               &lt;enumeration value="momentan_nicht_verfuegbar"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element ref="{}Person"/>
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
        "produkt",
        "verfuegbarkeit",
        "person"
    })
    public static class Produkte {

        @XmlElement(name = "Produkt", required = true)
        protected Produkt produkt;
        @XmlElement(name = "Verfuegbarkeit", required = true)
        protected String verfuegbarkeit;
        @XmlElement(name = "Person", required = true)
        protected Person person;

        /**
         * Ruft den Wert der produkt-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Produkt }
         *     
         */
        public Produkt getProdukt() {
            return produkt;
        }

        /**
         * Legt den Wert der produkt-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Produkt }
         *     
         */
        public void setProdukt(Produkt value) {
            this.produkt = value;
        }

        /**
         * Ruft den Wert der verfuegbarkeit-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVerfuegbarkeit() {
            return verfuegbarkeit;
        }

        /**
         * Legt den Wert der verfuegbarkeit-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVerfuegbarkeit(String value) {
            this.verfuegbarkeit = value;
        }

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

    }

}
