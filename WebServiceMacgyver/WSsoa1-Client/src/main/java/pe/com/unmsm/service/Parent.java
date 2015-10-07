
package pe.com.unmsm.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para parent complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="parent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idParent" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="lastNameParent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="listChild" type="{http://service.unmsm.com.pe/}child" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nameParent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parent", propOrder = {
    "idParent",
    "lastNameParent",
    "listChild",
    "nameParent"
})
public class Parent {

    protected int idParent;
    protected String lastNameParent;
    @XmlElement(nillable = true)
    protected List<Child> listChild;
    protected String nameParent;

    /**
     * Obtiene el valor de la propiedad idParent.
     * 
     */
    public int getIdParent() {
        return idParent;
    }

    /**
     * Define el valor de la propiedad idParent.
     * 
     */
    public void setIdParent(int value) {
        this.idParent = value;
    }

    /**
     * Obtiene el valor de la propiedad lastNameParent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastNameParent() {
        return lastNameParent;
    }

    /**
     * Define el valor de la propiedad lastNameParent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastNameParent(String value) {
        this.lastNameParent = value;
    }

    /**
     * Gets the value of the listChild property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listChild property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListChild().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Child }
     * 
     * 
     */
    public List<Child> getListChild() {
        if (listChild == null) {
            listChild = new ArrayList<Child>();
        }
        return this.listChild;
    }

    /**
     * Obtiene el valor de la propiedad nameParent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameParent() {
        return nameParent;
    }

    /**
     * Define el valor de la propiedad nameParent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameParent(String value) {
        this.nameParent = value;
    }

}
