//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.30 at 06:06:23 PM MESZ 
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
@XmlRootElement(name = "Produkte")
public class Produkte {

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
