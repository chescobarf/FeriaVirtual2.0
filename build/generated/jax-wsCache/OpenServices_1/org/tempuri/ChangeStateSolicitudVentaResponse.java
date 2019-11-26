
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="ChangeStateSolicitudVentaResult" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
    "changeStateSolicitudVentaResult"
})
@XmlRootElement(name = "ChangeStateSolicitudVentaResponse")
public class ChangeStateSolicitudVentaResponse {

    @XmlElement(name = "ChangeStateSolicitudVentaResult")
    protected Integer changeStateSolicitudVentaResult;

    /**
     * Obtiene el valor de la propiedad changeStateSolicitudVentaResult.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getChangeStateSolicitudVentaResult() {
        return changeStateSolicitudVentaResult;
    }

    /**
     * Define el valor de la propiedad changeStateSolicitudVentaResult.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setChangeStateSolicitudVentaResult(Integer value) {
        this.changeStateSolicitudVentaResult = value;
    }

}
