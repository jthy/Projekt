//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.16 at 01:50:44 PM MESZ 
//


package de.Boerse.xml;

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
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
 *                             &lt;element name="BoerseneintragsID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
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
 *         &lt;element name="KundenLieferantenListe">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
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
    "kundenLieferantenListe",
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
    @XmlElement(name = "KundenLieferantenListe", required = true)
    protected OrderHero.KundenLieferantenListe kundenLieferantenListe;
    @XmlElement(name = "Produkte", required = true)
    protected OrderHero.Produkte produkte;

    /**
     * Gets the value of the bestand property.
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
     * Sets the value of the bestand property.
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
     * Gets the value of the bestellungsliste property.
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
     * Sets the value of the bestellungsliste property.
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
     * Gets the value of the boerse property.
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
     * Sets the value of the boerse property.
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
     * Gets the value of the kundenLieferantenListe property.
     * 
     * @return
     *     possible object is
     *     {@link OrderHero.KundenLieferantenListe }
     *     
     */
    public OrderHero.KundenLieferantenListe getKundenLieferantenListe() {
        return kundenLieferantenListe;
    }

    /**
     * Sets the value of the kundenLieferantenListe property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderHero.KundenLieferantenListe }
     *     
     */
    public void setKundenLieferantenListe(OrderHero.KundenLieferantenListe value) {
        this.kundenLieferantenListe = value;
    }

    /**
     * Gets the value of the produkte property.
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
     * Sets the value of the produkte property.
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
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
         * Gets the value of the produkt property.
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
         * Sets the value of the produkt property.
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
         * Gets the value of the anzahl property.
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
         * Sets the value of the anzahl property.
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
         * Gets the value of the verfuegbarkeit property.
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
         * Sets the value of the verfuegbarkeit property.
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
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
         * Gets the value of the bestellung property.
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
         * Sets the value of the bestellung property.
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
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
     *                   &lt;element name="BoerseneintragsID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
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
         * Gets the value of the eintrag property.
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
         * Sets the value of the eintrag property.
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
        public static class Eintrag {

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
            protected OrderHero.Boerse.Eintrag.Kommentare kommentare;
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
             *     {@link OrderHero.Boerse.Eintrag.Kommentare }
             *     
             */
            public OrderHero.Boerse.Eintrag.Kommentare getKommentare() {
                return kommentare;
            }

            /**
             * Sets the value of the kommentare property.
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
        "person",
        "bestellung"
    })
    public static class KundenLieferantenListe {

        @XmlElement(name = "Person", required = true)
        protected Person person;
        @XmlElement(name = "Bestellung", required = true)
        protected List<Bestellung> bestellung;

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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
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
         * Gets the value of the produkt property.
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
         * Sets the value of the produkt property.
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
         * Gets the value of the verfuegbarkeit property.
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
         * Sets the value of the verfuegbarkeit property.
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

    }

}