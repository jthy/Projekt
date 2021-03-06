//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.30 at 06:05:45 PM MESZ 
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
 *         &lt;element name="Produkte">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Produkt_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="Produktname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Preis_in_Euro" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                   &lt;element name="Beschreibung" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Menge" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "produkte"
})
@XmlRootElement(name = "Bestand")
public class Bestand {

    @XmlElement(name = "Produkte", required = true)
    protected Bestand.Produkte produkte;

    /**
     * Gets the value of the produkte property.
     * 
     * @return
     *     possible object is
     *     {@link Bestand.Produkte }
     *     
     */
    public Bestand.Produkte getProdukte() {
        return produkte;
    }

    /**
     * Sets the value of the produkte property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bestand.Produkte }
     *     
     */
    public void setProdukte(Bestand.Produkte value) {
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
     *         &lt;element name="Produkt_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="Produktname" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Preis_in_Euro" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *         &lt;element name="Beschreibung" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Menge" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
        "produktID",
        "produktname",
        "preisInEuro",
        "beschreibung",
        "menge"
    })
    public static class Produkte {

        @XmlElement(name = "Produkt_ID")
        protected int produktID;
        @XmlElement(name = "Produktname", required = true)
        protected String produktname;
        @XmlElement(name = "Preis_in_Euro")
        protected float preisInEuro;
        @XmlElement(name = "Beschreibung", required = true)
        protected String beschreibung;
        @XmlElement(name = "Menge")
        protected int menge;

        /**
         * Gets the value of the produktID property.
         * 
         */
        public int getProduktID() {
            return produktID;
        }

        /**
         * Sets the value of the produktID property.
         * 
         */
        public void setProduktID(int value) {
            this.produktID = value;
        }

        /**
         * Gets the value of the produktname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProduktname() {
            return produktname;
        }

        /**
         * Sets the value of the produktname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProduktname(String value) {
            this.produktname = value;
        }

        /**
         * Gets the value of the preisInEuro property.
         * 
         */
        public float getPreisInEuro() {
            return preisInEuro;
        }

        /**
         * Sets the value of the preisInEuro property.
         * 
         */
        public void setPreisInEuro(float value) {
            this.preisInEuro = value;
        }

        /**
         * Gets the value of the beschreibung property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBeschreibung() {
            return beschreibung;
        }

        /**
         * Sets the value of the beschreibung property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBeschreibung(String value) {
            this.beschreibung = value;
        }

        /**
         * Gets the value of the menge property.
         * 
         */
        public int getMenge() {
            return menge;
        }

        /**
         * Sets the value of the menge property.
         * 
         */
        public void setMenge(int value) {
            this.menge = value;
        }

    }

}
