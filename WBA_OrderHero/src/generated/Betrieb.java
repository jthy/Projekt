//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.13 at 01:16:37 PM MESZ 
//


package generated;

import java.math.BigInteger;
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
 *         &lt;element name="Betriebname" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="Adresse">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Stra�e" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlRootElement(name = "Betrieb")
public class Betrieb {

    @XmlElement(name = "Betriebname", required = true)
    protected Object betriebname;
    @XmlElement(name = "Adresse", required = true)
    protected Betrieb.Adresse adresse;

    /**
     * Gets the value of the betriebname property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getBetriebname() {
        return betriebname;
    }

    /**
     * Sets the value of the betriebname property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setBetriebname(Object value) {
        this.betriebname = value;
    }

    /**
     * Gets the value of the adresse property.
     * 
     * @return
     *     possible object is
     *     {@link Betrieb.Adresse }
     *     
     */
    public Betrieb.Adresse getAdresse() {
        return adresse;
    }

    /**
     * Sets the value of the adresse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Betrieb.Adresse }
     *     
     */
    public void setAdresse(Betrieb.Adresse value) {
        this.adresse = value;
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
     *         &lt;element name="Stra�e" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        protected String stra�e;
        @XmlElement(name = "Hausnummer", required = true)
        protected BigInteger hausnummer;
        @XmlElement(name = "PLZ", required = true)
        protected BigInteger plz;

        /**
         * Gets the value of the stra�e property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStra�e() {
            return stra�e;
        }

        /**
         * Sets the value of the stra�e property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStra�e(String value) {
            this.stra�e = value;
        }

        /**
         * Gets the value of the hausnummer property.
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
         * Sets the value of the hausnummer property.
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
         * Gets the value of the plz property.
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
         * Sets the value of the plz property.
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
