
package org.tempuri;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "OpenServices", targetNamespace = "http://tempuri.org/", wsdlLocation = "http://3.225.20.205/CoreServicios/OpenServices.svc?wsdl")
public class OpenServices
    extends Service
{

    private final static URL OPENSERVICES_WSDL_LOCATION;
    private final static WebServiceException OPENSERVICES_EXCEPTION;
    private final static QName OPENSERVICES_QNAME = new QName("http://tempuri.org/", "OpenServices");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://3.225.20.205/CoreServicios/OpenServices.svc?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        OPENSERVICES_WSDL_LOCATION = url;
        OPENSERVICES_EXCEPTION = e;
    }

    public OpenServices() {
        super(__getWsdlLocation(), OPENSERVICES_QNAME);
    }

    public OpenServices(WebServiceFeature... features) {
        super(__getWsdlLocation(), OPENSERVICES_QNAME, features);
    }

    public OpenServices(URL wsdlLocation) {
        super(wsdlLocation, OPENSERVICES_QNAME);
    }

    public OpenServices(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, OPENSERVICES_QNAME, features);
    }

    public OpenServices(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public OpenServices(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IOpenServices
     */
    @WebEndpoint(name = "BasicHttpBinding_IOpenServices")
    public IOpenServices getBasicHttpBindingIOpenServices() {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_IOpenServices"), IOpenServices.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IOpenServices
     */
    @WebEndpoint(name = "BasicHttpBinding_IOpenServices")
    public IOpenServices getBasicHttpBindingIOpenServices(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_IOpenServices"), IOpenServices.class, features);
    }

    private static URL __getWsdlLocation() {
        if (OPENSERVICES_EXCEPTION!= null) {
            throw OPENSERVICES_EXCEPTION;
        }
        return OPENSERVICES_WSDL_LOCATION;
    }

}
