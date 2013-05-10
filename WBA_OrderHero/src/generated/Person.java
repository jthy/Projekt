//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.10 at 10:58:07 AM MESZ 
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
 *         &lt;element name="Typ">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Gastronom"/>
 *               &lt;enumeration value="Lieferant"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Vorname" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="Nachname" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="Alter">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
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
    "typ",
    "vorname",
    "nachname",
    "alter",
    "betrieb"
})
@XmlRootElement(name = "Person")
public class Person {

    @XmlElement(name = "Typ", required = true)
    protected String typ;
    @XmlElement(name = "Vorname", required = true)
    protected Object vorname;
    @XmlElement(name = "Nachname", required = true)
    protected Object nachname;
    @XmlElement(name = "Alter")
    protected int alter;
    @XmlElement(name = "Betrieb", required = true)
    protected Betrieb betrieb;

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
     *     {@link Object }
     *     
     */
    public Object getVorname() {
        return vorname;
    }

    /**
     * Sets the value of the vorname property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setVorname(Object value) {
        this.vorname = value;
    }

    /**
     * Gets the value of the nachname property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getNachname() {
        return nachname;
    }

    /**
     * Sets the value of the nachname property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setNachname(Object value) {
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