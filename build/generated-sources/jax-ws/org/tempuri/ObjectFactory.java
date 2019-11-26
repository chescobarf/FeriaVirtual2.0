
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ValidarLoginLoginJson_QNAME = new QName("http://tempuri.org/", "loginJson");
    private final static QName _ValidarLoginResponseValidarLoginResult_QNAME = new QName("http://tempuri.org/", "ValidarLoginResult");
    private final static QName _CreateUserUserJson_QNAME = new QName("http://tempuri.org/", "userJson");
    private final static QName _DeleteUserEstado_QNAME = new QName("http://tempuri.org/", "Estado");
    private final static QName _GetAllPerfilResponseGetAllPerfilResult_QNAME = new QName("http://tempuri.org/", "GetAllPerfilResult");
    private final static QName _CreateFruitFruitJson_QNAME = new QName("http://tempuri.org/", "fruitJson");
    private final static QName _GetAllFrutaResponseGetAllFrutaResult_QNAME = new QName("http://tempuri.org/", "GetAllFrutaResult");
    private final static QName _GetContratoUserResponseGetContratoUserResult_QNAME = new QName("http://tempuri.org/", "GetContratoUserResult");
    private final static QName _CreateContratoContratoJson_QNAME = new QName("http://tempuri.org/", "contratoJson");
    private final static QName _CreateProVentaProVentaJson_QNAME = new QName("http://tempuri.org/", "proVentaJson");
    private final static QName _CreateProVentaProductosJson_QNAME = new QName("http://tempuri.org/", "productosJson");
    private final static QName _GetAllProVentaResponseGetAllProVentaResult_QNAME = new QName("http://tempuri.org/", "GetAllProVentaResult");
    private final static QName _GetAllProductPVResponseGetAllProductPVResult_QNAME = new QName("http://tempuri.org/", "GetAllProductPVResult");
    private final static QName _CreateOfertaPrVtaJsonProcesoVTA_QNAME = new QName("http://tempuri.org/", "JsonProcesoVTA");
    private final static QName _CreatePdtoOfertaPrVtaJsonListProducto_QNAME = new QName("http://tempuri.org/", "JsonListProducto");
    private final static QName _GetAllPersonResponseGetAllPersonResult_QNAME = new QName("http://tempuri.org/", "GetAllPersonResult");
    private final static QName _CreateSubTransporteSubastaJson_QNAME = new QName("http://tempuri.org/", "subastaJson");
    private final static QName _GetAllSubTransporteResponseGetAllSubTransporteResult_QNAME = new QName("http://tempuri.org/", "GetAllSubTransporteResult");
    private final static QName _GetAllSolicitudVentaActResponseGetAllSolicitudVentaActResult_QNAME = new QName("http://tempuri.org/", "GetAllSolicitudVentaActResult");
<<<<<<< HEAD
    private final static QName _CreateSolicitudVentaJsonSolicitudVenta_QNAME = new QName("http://tempuri.org/", "JsonSolicitudVenta");
=======
>>>>>>> d1def7e2df3f8c85901e0d12f992b8d6756143d7

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ValidarLogin }
     * 
     */
    public ValidarLogin createValidarLogin() {
        return new ValidarLogin();
    }

    /**
     * Create an instance of {@link ValidarLoginResponse }
     * 
     */
    public ValidarLoginResponse createValidarLoginResponse() {
        return new ValidarLoginResponse();
    }

    /**
     * Create an instance of {@link CreateUser }
     * 
     */
    public CreateUser createCreateUser() {
        return new CreateUser();
    }

    /**
     * Create an instance of {@link CreateUserResponse }
     * 
     */
    public CreateUserResponse createCreateUserResponse() {
        return new CreateUserResponse();
    }

    /**
     * Create an instance of {@link UpdateUser }
     * 
     */
    public UpdateUser createUpdateUser() {
        return new UpdateUser();
    }

    /**
     * Create an instance of {@link UpdateUserResponse }
     * 
     */
    public UpdateUserResponse createUpdateUserResponse() {
        return new UpdateUserResponse();
    }

    /**
     * Create an instance of {@link DeleteUser }
     * 
     */
    public DeleteUser createDeleteUser() {
        return new DeleteUser();
    }

    /**
     * Create an instance of {@link DeleteUserResponse }
     * 
     */
    public DeleteUserResponse createDeleteUserResponse() {
        return new DeleteUserResponse();
    }

    /**
     * Create an instance of {@link GetAllPerfil }
     * 
     */
    public GetAllPerfil createGetAllPerfil() {
        return new GetAllPerfil();
    }

    /**
     * Create an instance of {@link GetAllPerfilResponse }
     * 
     */
    public GetAllPerfilResponse createGetAllPerfilResponse() {
        return new GetAllPerfilResponse();
    }

    /**
     * Create an instance of {@link CreateFruit }
     * 
     */
    public CreateFruit createCreateFruit() {
        return new CreateFruit();
    }

    /**
     * Create an instance of {@link CreateFruitResponse }
     * 
     */
    public CreateFruitResponse createCreateFruitResponse() {
        return new CreateFruitResponse();
    }

    /**
     * Create an instance of {@link GetAllFruta }
     * 
     */
    public GetAllFruta createGetAllFruta() {
        return new GetAllFruta();
    }

    /**
     * Create an instance of {@link GetAllFrutaResponse }
     * 
     */
    public GetAllFrutaResponse createGetAllFrutaResponse() {
        return new GetAllFrutaResponse();
    }

    /**
     * Create an instance of {@link GetContratoUser }
     * 
     */
    public GetContratoUser createGetContratoUser() {
        return new GetContratoUser();
    }

    /**
     * Create an instance of {@link GetContratoUserResponse }
     * 
     */
    public GetContratoUserResponse createGetContratoUserResponse() {
        return new GetContratoUserResponse();
    }

    /**
     * Create an instance of {@link CreateContrato }
     * 
     */
    public CreateContrato createCreateContrato() {
        return new CreateContrato();
    }

    /**
     * Create an instance of {@link CreateContratoResponse }
     * 
     */
    public CreateContratoResponse createCreateContratoResponse() {
        return new CreateContratoResponse();
    }

    /**
     * Create an instance of {@link CreateProVenta }
     * 
     */
    public CreateProVenta createCreateProVenta() {
        return new CreateProVenta();
    }

    /**
     * Create an instance of {@link CreateProVentaResponse }
     * 
     */
    public CreateProVentaResponse createCreateProVentaResponse() {
        return new CreateProVentaResponse();
    }

    /**
     * Create an instance of {@link GetAllProVenta }
     * 
     */
    public GetAllProVenta createGetAllProVenta() {
        return new GetAllProVenta();
    }

    /**
     * Create an instance of {@link GetAllProVentaResponse }
     * 
     */
    public GetAllProVentaResponse createGetAllProVentaResponse() {
        return new GetAllProVentaResponse();
    }

    /**
     * Create an instance of {@link GetAllProductPV }
     * 
     */
    public GetAllProductPV createGetAllProductPV() {
        return new GetAllProductPV();
    }

    /**
     * Create an instance of {@link GetAllProductPVResponse }
     * 
     */
    public GetAllProductPVResponse createGetAllProductPVResponse() {
        return new GetAllProductPVResponse();
    }

    /**
     * Create an instance of {@link CreateOfertaPrVta }
     * 
     */
    public CreateOfertaPrVta createCreateOfertaPrVta() {
        return new CreateOfertaPrVta();
    }

    /**
     * Create an instance of {@link CreateOfertaPrVtaResponse }
     * 
     */
    public CreateOfertaPrVtaResponse createCreateOfertaPrVtaResponse() {
        return new CreateOfertaPrVtaResponse();
    }

    /**
     * Create an instance of {@link CreatePdtoOfertaPrVta }
     * 
     */
    public CreatePdtoOfertaPrVta createCreatePdtoOfertaPrVta() {
        return new CreatePdtoOfertaPrVta();
    }

    /**
     * Create an instance of {@link CreatePdtoOfertaPrVtaResponse }
     * 
     */
    public CreatePdtoOfertaPrVtaResponse createCreatePdtoOfertaPrVtaResponse() {
        return new CreatePdtoOfertaPrVtaResponse();
    }

    /**
     * Create an instance of {@link GetAllPerson }
     * 
     */
    public GetAllPerson createGetAllPerson() {
        return new GetAllPerson();
    }

    /**
     * Create an instance of {@link GetAllPersonResponse }
     * 
     */
    public GetAllPersonResponse createGetAllPersonResponse() {
        return new GetAllPersonResponse();
    }

    /**
     * Create an instance of {@link CreateSubTransporte }
     * 
     */
    public CreateSubTransporte createCreateSubTransporte() {
        return new CreateSubTransporte();
    }

    /**
     * Create an instance of {@link CreateSubTransporteResponse }
     * 
     */
    public CreateSubTransporteResponse createCreateSubTransporteResponse() {
        return new CreateSubTransporteResponse();
    }

    /**
     * Create an instance of {@link GetAllSubTransporte }
     * 
     */
    public GetAllSubTransporte createGetAllSubTransporte() {
        return new GetAllSubTransporte();
    }

    /**
     * Create an instance of {@link GetAllSubTransporteResponse }
     * 
     */
    public GetAllSubTransporteResponse createGetAllSubTransporteResponse() {
        return new GetAllSubTransporteResponse();
    }

    /**
     * Create an instance of {@link GetNroSolicitudVentaAct }
     * 
     */
    public GetNroSolicitudVentaAct createGetNroSolicitudVentaAct() {
        return new GetNroSolicitudVentaAct();
    }

    /**
     * Create an instance of {@link GetNroSolicitudVentaActResponse }
     * 
     */
    public GetNroSolicitudVentaActResponse createGetNroSolicitudVentaActResponse() {
        return new GetNroSolicitudVentaActResponse();
    }

    /**
     * Create an instance of {@link GetAllSolicitudVentaAct }
     * 
     */
    public GetAllSolicitudVentaAct createGetAllSolicitudVentaAct() {
        return new GetAllSolicitudVentaAct();
    }

    /**
     * Create an instance of {@link GetAllSolicitudVentaActResponse }
     * 
     */
    public GetAllSolicitudVentaActResponse createGetAllSolicitudVentaActResponse() {
        return new GetAllSolicitudVentaActResponse();
    }

    /**
     * Create an instance of {@link ChangeStateSolicitudVenta }
     * 
     */
    public ChangeStateSolicitudVenta createChangeStateSolicitudVenta() {
        return new ChangeStateSolicitudVenta();
    }

    /**
     * Create an instance of {@link ChangeStateSolicitudVentaResponse }
     * 
     */
    public ChangeStateSolicitudVentaResponse createChangeStateSolicitudVentaResponse() {
        return new ChangeStateSolicitudVentaResponse();
<<<<<<< HEAD
    }

    /**
     * Create an instance of {@link CreateSolicitudVenta }
     * 
     */
    public CreateSolicitudVenta createCreateSolicitudVenta() {
        return new CreateSolicitudVenta();
    }

    /**
     * Create an instance of {@link CreateSolicitudVentaResponse }
     * 
     */
    public CreateSolicitudVentaResponse createCreateSolicitudVentaResponse() {
        return new CreateSolicitudVentaResponse();
    }

    /**
     * Create an instance of {@link ProbabilidadVenta }
     * 
     */
    public ProbabilidadVenta createProbabilidadVenta() {
        return new ProbabilidadVenta();
    }

    /**
     * Create an instance of {@link ProbabilidadVentaResponse }
     * 
     */
    public ProbabilidadVentaResponse createProbabilidadVentaResponse() {
        return new ProbabilidadVentaResponse();
=======
>>>>>>> d1def7e2df3f8c85901e0d12f992b8d6756143d7
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "loginJson", scope = ValidarLogin.class)
    public JAXBElement<String> createValidarLoginLoginJson(String value) {
        return new JAXBElement<String>(_ValidarLoginLoginJson_QNAME, String.class, ValidarLogin.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ValidarLoginResult", scope = ValidarLoginResponse.class)
    public JAXBElement<String> createValidarLoginResponseValidarLoginResult(String value) {
        return new JAXBElement<String>(_ValidarLoginResponseValidarLoginResult_QNAME, String.class, ValidarLoginResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "userJson", scope = CreateUser.class)
    public JAXBElement<String> createCreateUserUserJson(String value) {
        return new JAXBElement<String>(_CreateUserUserJson_QNAME, String.class, CreateUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "userJson", scope = UpdateUser.class)
    public JAXBElement<String> createUpdateUserUserJson(String value) {
        return new JAXBElement<String>(_CreateUserUserJson_QNAME, String.class, UpdateUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Estado", scope = DeleteUser.class)
    public JAXBElement<String> createDeleteUserEstado(String value) {
        return new JAXBElement<String>(_DeleteUserEstado_QNAME, String.class, DeleteUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetAllPerfilResult", scope = GetAllPerfilResponse.class)
    public JAXBElement<String> createGetAllPerfilResponseGetAllPerfilResult(String value) {
        return new JAXBElement<String>(_GetAllPerfilResponseGetAllPerfilResult_QNAME, String.class, GetAllPerfilResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "fruitJson", scope = CreateFruit.class)
    public JAXBElement<String> createCreateFruitFruitJson(String value) {
        return new JAXBElement<String>(_CreateFruitFruitJson_QNAME, String.class, CreateFruit.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetAllFrutaResult", scope = GetAllFrutaResponse.class)
    public JAXBElement<String> createGetAllFrutaResponseGetAllFrutaResult(String value) {
        return new JAXBElement<String>(_GetAllFrutaResponseGetAllFrutaResult_QNAME, String.class, GetAllFrutaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetContratoUserResult", scope = GetContratoUserResponse.class)
    public JAXBElement<String> createGetContratoUserResponseGetContratoUserResult(String value) {
        return new JAXBElement<String>(_GetContratoUserResponseGetContratoUserResult_QNAME, String.class, GetContratoUserResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "contratoJson", scope = CreateContrato.class)
    public JAXBElement<String> createCreateContratoContratoJson(String value) {
        return new JAXBElement<String>(_CreateContratoContratoJson_QNAME, String.class, CreateContrato.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "proVentaJson", scope = CreateProVenta.class)
    public JAXBElement<String> createCreateProVentaProVentaJson(String value) {
        return new JAXBElement<String>(_CreateProVentaProVentaJson_QNAME, String.class, CreateProVenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "productosJson", scope = CreateProVenta.class)
    public JAXBElement<String> createCreateProVentaProductosJson(String value) {
        return new JAXBElement<String>(_CreateProVentaProductosJson_QNAME, String.class, CreateProVenta.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetAllProVentaResult", scope = GetAllProVentaResponse.class)
    public JAXBElement<String> createGetAllProVentaResponseGetAllProVentaResult(String value) {
        return new JAXBElement<String>(_GetAllProVentaResponseGetAllProVentaResult_QNAME, String.class, GetAllProVentaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetAllProductPVResult", scope = GetAllProductPVResponse.class)
    public JAXBElement<String> createGetAllProductPVResponseGetAllProductPVResult(String value) {
        return new JAXBElement<String>(_GetAllProductPVResponseGetAllProductPVResult_QNAME, String.class, GetAllProductPVResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "JsonProcesoVTA", scope = CreateOfertaPrVta.class)
    public JAXBElement<String> createCreateOfertaPrVtaJsonProcesoVTA(String value) {
        return new JAXBElement<String>(_CreateOfertaPrVtaJsonProcesoVTA_QNAME, String.class, CreateOfertaPrVta.class, value);
<<<<<<< HEAD
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "JsonListProducto", scope = CreatePdtoOfertaPrVta.class)
    public JAXBElement<String> createCreatePdtoOfertaPrVtaJsonListProducto(String value) {
        return new JAXBElement<String>(_CreatePdtoOfertaPrVtaJsonListProducto_QNAME, String.class, CreatePdtoOfertaPrVta.class, value);
=======
>>>>>>> d1def7e2df3f8c85901e0d12f992b8d6756143d7
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
<<<<<<< HEAD
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetAllPersonResult", scope = GetAllPersonResponse.class)
    public JAXBElement<String> createGetAllPersonResponseGetAllPersonResult(String value) {
        return new JAXBElement<String>(_GetAllPersonResponseGetAllPersonResult_QNAME, String.class, GetAllPersonResponse.class, value);
=======
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "JsonListProducto", scope = CreatePdtoOfertaPrVta.class)
    public JAXBElement<String> createCreatePdtoOfertaPrVtaJsonListProducto(String value) {
        return new JAXBElement<String>(_CreatePdtoOfertaPrVtaJsonListProducto_QNAME, String.class, CreatePdtoOfertaPrVta.class, value);
>>>>>>> d1def7e2df3f8c85901e0d12f992b8d6756143d7
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
<<<<<<< HEAD
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "subastaJson", scope = CreateSubTransporte.class)
    public JAXBElement<String> createCreateSubTransporteSubastaJson(String value) {
        return new JAXBElement<String>(_CreateSubTransporteSubastaJson_QNAME, String.class, CreateSubTransporte.class, value);
=======
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetAllPersonResult", scope = GetAllPersonResponse.class)
    public JAXBElement<String> createGetAllPersonResponseGetAllPersonResult(String value) {
        return new JAXBElement<String>(_GetAllPersonResponseGetAllPersonResult_QNAME, String.class, GetAllPersonResponse.class, value);
>>>>>>> d1def7e2df3f8c85901e0d12f992b8d6756143d7
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
<<<<<<< HEAD
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetAllSubTransporteResult", scope = GetAllSubTransporteResponse.class)
    public JAXBElement<String> createGetAllSubTransporteResponseGetAllSubTransporteResult(String value) {
        return new JAXBElement<String>(_GetAllSubTransporteResponseGetAllSubTransporteResult_QNAME, String.class, GetAllSubTransporteResponse.class, value);
=======
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "subastaJson", scope = CreateSubTransporte.class)
    public JAXBElement<String> createCreateSubTransporteSubastaJson(String value) {
        return new JAXBElement<String>(_CreateSubTransporteSubastaJson_QNAME, String.class, CreateSubTransporte.class, value);
>>>>>>> d1def7e2df3f8c85901e0d12f992b8d6756143d7
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
<<<<<<< HEAD
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetAllSolicitudVentaActResult", scope = GetAllSolicitudVentaActResponse.class)
    public JAXBElement<String> createGetAllSolicitudVentaActResponseGetAllSolicitudVentaActResult(String value) {
        return new JAXBElement<String>(_GetAllSolicitudVentaActResponseGetAllSolicitudVentaActResult_QNAME, String.class, GetAllSolicitudVentaActResponse.class, value);
=======
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetAllSubTransporteResult", scope = GetAllSubTransporteResponse.class)
    public JAXBElement<String> createGetAllSubTransporteResponseGetAllSubTransporteResult(String value) {
        return new JAXBElement<String>(_GetAllSubTransporteResponseGetAllSubTransporteResult_QNAME, String.class, GetAllSubTransporteResponse.class, value);
>>>>>>> d1def7e2df3f8c85901e0d12f992b8d6756143d7
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
<<<<<<< HEAD
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "JsonSolicitudVenta", scope = CreateSolicitudVenta.class)
    public JAXBElement<String> createCreateSolicitudVentaJsonSolicitudVenta(String value) {
        return new JAXBElement<String>(_CreateSolicitudVentaJsonSolicitudVenta_QNAME, String.class, CreateSolicitudVenta.class, value);
=======
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetAllSolicitudVentaActResult", scope = GetAllSolicitudVentaActResponse.class)
    public JAXBElement<String> createGetAllSolicitudVentaActResponseGetAllSolicitudVentaActResult(String value) {
        return new JAXBElement<String>(_GetAllSolicitudVentaActResponseGetAllSolicitudVentaActResult_QNAME, String.class, GetAllSolicitudVentaActResponse.class, value);
>>>>>>> d1def7e2df3f8c85901e0d12f992b8d6756143d7
    }

}
