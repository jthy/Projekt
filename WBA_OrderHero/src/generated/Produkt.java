//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.05.12 um 03:09:57 PM CEST 
//


package generated;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Produkt_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="Produktangaben">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Produktname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Preis_in_Euro" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                   &lt;element name="Beschreibung" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "produktID",
    "produktangaben"
})
@XmlRootElement(name = "Produkt")
public class Produkt {

    @XmlElement(name = "Produkt_ID", required = true)
    protected BigInteger produktID;
    @XmlElement(name = "Produktangaben", required = true)
    protected Produkt.Produktangaben produktangaben;

    /**
     * Ruft den Wert der produktID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProduktID() {
        return produktID;
    }

    /**
     * Legt den Wert der produktID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProduktID(BigInteger value) {
        this.produktID = value;
    }

    /**
     * Ruft den Wert der produktangaben-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Produkt.Produktangaben }
     *     
     */
    public Produkt.Produktangaben getProduktangaben() {
        return produktangaben;
    }

    /**
     * Legt den Wert der produktangaben-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Produkt.Produktangaben }
     *     
     */
    public void setProduktangaben(Produkt.Produktangaben value) {
        this.produktangaben = value;
    }


    /**
     * <p>Java-Klasse f�r anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Produktname" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Preis_in_Euro" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *         &lt;element name="Beschreibung" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "produktname",
        "preisInEuro",
        "beschreibung"
    })
    public static class Produktangaben {

        @XmlElement(name = "Produktname", required = true)
        protected String produktname;
        @XmlElement(name = "Preis_in_Euro")
        protected float preisInEuro;
        @XmlElement(name = "Beschreibung", required = true)
        protected String beschreibung;

        /**
         * Ruft den Wert der produktname-Eigenschaft ab.
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
         * Legt den Wert der produktname-Eigenschaft fest.
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
         * Ruft den Wert der preisInEuro-Eigenschaft ab.
         * 
         */
        public float getPreisInEuro() {
            return preisInEuro;
        }

        /**
         * Legt den Wert der preisInEuro-Eigenschaft fest.
         * 
         */
        public void setPreisInEuro(float value) {
            this.preisInEuro = value;
        }

        /**
         * Ruft den Wert der beschreibung-Eigenschaft ab.
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
         * Legt den Wert der beschreibung-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBeschreibung(String value) {
            this.beschreibung = value;
        }

    }

}
