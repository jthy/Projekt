//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.16 at 01:50:28 PM MESZ 
//


package generated;

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
 *         &lt;element ref="{}Bestellung"/>
 *         &lt;element name="Beginn" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="Ende" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Regelmae告gkeit">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="monatlich"/>
 *               &lt;enumeration value="woechentlich"/>
 *               &lt;enumeration value="taeglich"/>
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
    "bestellung",
    "beginn",
    "ende",
    "regelmae\u00dfigkeit"
})
@XmlRootElement(name = "Dauerauftrag")
public class Dauerauftrag {

    @XmlElement(name = "Bestellung", required = true)
    protected Bestellung bestellung;
    @XmlElement(name = "Beginn", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar beginn;
    @XmlElement(name = "Ende")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ende;
    @XmlElement(name = "Regelmae\u00dfigkeit", required = true)
    protected String regelmae告gkeit;

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

    /**
     * Gets the value of the beginn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBeginn() {
        return beginn;
    }

    /**
     * Sets the value of the beginn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBeginn(XMLGregorianCalendar value) {
        this.beginn = value;
    }

    /**
     * Gets the value of the ende property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEnde() {
        return ende;
    }

    /**
     * Sets the value of the ende property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEnde(XMLGregorianCalendar value) {
        this.ende = value;
    }

    /**
     * Gets the value of the regelmae告gkeit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegelmae告gkeit() {
        return regelmae告gkeit;
    }

    /**
     * Sets the value of the regelmae告gkeit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegelmae告gkeit(String value) {
        this.regelmae告gkeit = value;
    }

}
