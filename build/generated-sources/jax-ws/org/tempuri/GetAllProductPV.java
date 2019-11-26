
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nroPV" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "nroPV"
})
@XmlRootElement(name = "GetAllProductPV")
public class GetAllProductPV {

    protected Integer nroPV;

    /**
     * Obtiene el valor de la propiedad nroPV.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNroPV() {
        return nroPV;
    }

    /**
     * Define el valor de la propiedad nroPV.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNroPV(Integer value) {
        this.nroPV = value;
    }

}
