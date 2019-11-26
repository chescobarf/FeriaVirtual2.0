
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
 *         &lt;element name="CreateOfertaPrVtaResult" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
    "createOfertaPrVtaResult"
})
@XmlRootElement(name = "CreateOfertaPrVtaResponse")
public class CreateOfertaPrVtaResponse {

    @XmlElement(name = "CreateOfertaPrVtaResult")
    protected Boolean createOfertaPrVtaResult;

    /**
     * Obtiene el valor de la propiedad createOfertaPrVtaResult.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCreateOfertaPrVtaResult() {
        return createOfertaPrVtaResult;
    }

    /**
     * Define el valor de la propiedad createOfertaPrVtaResult.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCreateOfertaPrVtaResult(Boolean value) {
        this.createOfertaPrVtaResult = value;
    }

}
