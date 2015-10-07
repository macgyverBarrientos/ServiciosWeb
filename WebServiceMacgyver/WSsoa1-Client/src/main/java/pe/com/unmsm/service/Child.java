
package pe.com.unmsm.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para child complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="child">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="holdChild" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idChild" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nameChild" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "child", propOrder = {
    "holdChild",
    "idChild",
    "nameChild"
})
public class Child {

    protected int holdChild;
    protected int idChild;
    protected String nameChild;

    /**
     * Obtiene el valor de la propiedad holdChild.
     * 
     */
    public int getHoldChild() {
        return holdChild;
    }

    /**
     * Define el valor de la propiedad holdChild.
     * 
     */
    public void setHoldChild(int value) {
        this.holdChild = value;
    }

    /**
     * Obtiene el valor de la propiedad idChild.
     * 
     */
    public int getIdChild() {
        return idChild;
    }

    /**
     * Define el valor de la propiedad idChild.
     * 
     */
    public void setIdChild(int value) {
        this.idChild = value;
    }

    /**
     * Obtiene el valor de la propiedad nameChild.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameChild() {
        return nameChild;
    }

    /**
     * Define el valor de la propiedad nameChild.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameChild(String value) {
        this.nameChild = value;
    }

}
