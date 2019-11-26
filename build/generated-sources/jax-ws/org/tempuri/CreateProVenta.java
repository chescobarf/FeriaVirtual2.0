
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
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
 *         &lt;element name="proVentaJson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="productosJson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
<<<<<<< HEAD
 *         &lt;element name="Solicitud" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
=======
>>>>>>> d1def7e2df3f8c85901e0d12f992b8d6756143d7
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
    "proVentaJson",
    "productosJson",
    "solicitud"
})
@XmlRootElement(name = "CreateProVenta")
public class CreateProVenta {

    @XmlElementRef(name = "proVentaJson", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> proVentaJson;
    @XmlElementRef(name = "productosJson", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> productosJson;
    @XmlElement(name = "Solicitud")
    protected Integer solicitud;

    /**
     * Obtiene el valor de la propiedad proVentaJson.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProVentaJson() {
        return proVentaJson;
    }

    /**
     * Define el valor de la propiedad proVentaJson.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProVentaJson(JAXBElement<String> value) {
        this.proVentaJson = value;
    }

    /**
     * Obtiene el valor de la propiedad productosJson.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProductosJson() {
        return productosJson;
    }

    /**
     * Define el valor de la propiedad productosJson.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProductosJson(JAXBElement<String> value) {
        this.productosJson = value;
    }

    /**
     * Obtiene el valor de la propiedad solicitud.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSolicitud() {
        return solicitud;
    }

    /**
     * Define el valor de la propiedad solicitud.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSolicitud(Integer value) {
        this.solicitud = value;
    }

}
