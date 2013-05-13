//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.05.12 um 03:06:55 PM CEST 
//


package generated;

import java.math.BigInteger;
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
 *         &lt;element name="Betrieb">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Betriebname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Adresse">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Straße" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Hausnummer" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                             &lt;element name="PLZ">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                   &lt;pattern value="(D )?[0-9]{5}"/>
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
    "betrieb"
})
@XmlRootElement(name = "Betriebliste")
public class Betriebliste {

    @XmlElement(name = "Betrieb", required = true)
    protected Betriebliste.Betrieb betrieb;

    /**
     * Ruft den Wert der betrieb-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Betriebliste.Betrieb }
     *     
     */
    public Betriebliste.Betrieb getBetrieb() {
        return betrieb;
    }

    /**
     * Legt den Wert der betrieb-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Betriebliste.Betrieb }
     *     
     */
    public void setBetrieb(Betriebliste.Betrieb value) {
        this.betrieb = value;
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
     *         &lt;element name="Betriebname" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Adresse">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Straße" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Hausnummer" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                   &lt;element name="PLZ">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                         &lt;pattern value="(D )?[0-9]{5}"/>
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
        "betriebname",
        "adresse"
    })
    public static class Betrieb {

        @XmlElement(name = "Betriebname", required = true)
        protected String betriebname;
        @XmlElement(name = "Adresse", required = true)
        protected Betriebliste.Betrieb.Adresse adresse;

        /**
         * Ruft den Wert der betriebname-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBetriebname() {
            return betriebname;
        }

        /**
         * Legt den Wert der betriebname-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBetriebname(String value) {
            this.betriebname = value;
        }

        /**
         * Ruft den Wert der adresse-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Betriebliste.Betrieb.Adresse }
         *     
         */
        public Betriebliste.Betrieb.Adresse getAdresse() {
            return adresse;
        }

        /**
         * Legt den Wert der adresse-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Betriebliste.Betrieb.Adresse }
         *     
         */
        public void setAdresse(Betriebliste.Betrieb.Adresse value) {
            this.adresse = value;
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
         *         &lt;element name="Straße" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Hausnummer" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *         &lt;element name="PLZ">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *               &lt;pattern value="(D )?[0-9]{5}"/>
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
            "stra\u00dfe",
            "hausnummer",
            "plz"
        })
        public static class Adresse {

            @XmlElement(name = "Stra\u00dfe", required = true)
            protected String straße;
            @XmlElement(name = "Hausnummer", required = true)
            protected BigInteger hausnummer;
            @XmlElement(name = "PLZ", required = true)
            protected BigInteger plz;

            /**
             * Ruft den Wert der straße-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStraße() {
                return straße;
            }

            /**
             * Legt den Wert der straße-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStraße(String value) {
                this.straße = value;
            }

            /**
             * Ruft den Wert der hausnummer-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getHausnummer() {
                return hausnummer;
            }

            /**
             * Legt den Wert der hausnummer-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setHausnummer(BigInteger value) {
                this.hausnummer = value;
            }

            /**
             * Ruft den Wert der plz-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getPLZ() {
                return plz;
            }

            /**
             * Legt den Wert der plz-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setPLZ(BigInteger value) {
                this.plz = value;
            }

        }

    }

}
