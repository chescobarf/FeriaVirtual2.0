
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
 *         &lt;element name="ProbabilidadVentaResult" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
    "probabilidadVentaResult"
})
@XmlRootElement(name = "ProbabilidadVentaResponse")
public class ProbabilidadVentaResponse {

    @XmlElement(name = "ProbabilidadVentaResult")
    protected Integer probabilidadVentaResult;

    /**
     * Obtiene el valor de la propiedad probabilidadVentaResult.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProbabilidadVentaResult() {
        return probabilidadVentaResult;
    }

    /**
     * Define el valor de la propiedad probabilidadVentaResult.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProbabilidadVentaResult(Integer value) {
        this.probabilidadVentaResult = value;
    }

}
