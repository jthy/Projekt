//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.06.13 at 10:20:29 PM MESZ 
//


package generated;

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
 *         &lt;element name="Betriebs_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Betriebname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Adresse">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="strasse" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Hausnummer" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="PLZ">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
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
    "betriebsID",
    "betriebname",
    "adresse"
})
@XmlRootElement(name = "Betrieb")
public class Betrieb {

    @XmlElement(name = "Betriebs_ID")
    protected int betriebsID;
    @XmlElement(name = "Betriebname", required = true)
    protected String betriebname;
    @XmlElement(name = "Adresse", required = true)
    protected Betrieb.Adresse adresse;

    /**
     * Gets the value of the betriebsID property.
     * 
     */
    public int getBetriebsID() {
        return betriebsID;
    }

    /**
     * Sets the value of the betriebsID property.
     * 
     */
    public void setBetriebsID(int value) {
        this.betriebsID = value;
    }

    /**
     * Gets the value of the betriebname property.
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
     * Sets the value of the betriebname property.
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
     *         &lt;element name="strasse" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Hausnummer" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="PLZ">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
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
        "strasse",
        "hausnummer",
        "plz"
    })
    public static class Adresse {

        @XmlElement(required = true)
        protected String strasse;
        @XmlElement(name = "Hausnummer")
        protected int hausnummer;
        @XmlElement(name = "PLZ")
        protected int plz;

        /**
         * Gets the value of the strasse property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStrasse() {
            return strasse;
        }

        /**
         * Sets the value of the strasse property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStrasse(String value) {
            this.strasse = value;
        }

        /**
         * Gets the value of the hausnummer property.
         * 
         */
        public int getHausnummer() {
            return hausnummer;
        }

        /**
         * Sets the value of the hausnummer property.
         * 
         */
        public void setHausnummer(int value) {
            this.hausnummer = value;
        }

        /**
         * Gets the value of the plz property.
         * 
         */
        public int getPLZ() {
            return plz;
        }

        /**
         * Sets the value of the plz property.
         * 
         */
        public void setPLZ(int value) {
            this.plz = value;
        }

    }

}
