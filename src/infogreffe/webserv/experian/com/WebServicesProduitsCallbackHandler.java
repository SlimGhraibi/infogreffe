/**
 * WebServicesProduitsCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package infogreffe.webserv.experian.com;


/**
 *  WebServicesProduitsCallbackHandler Callback class, Users can extend this class and implement
 *  their own receiveResult and receiveError methods.
 */
public abstract class WebServicesProduitsCallbackHandler {
    protected Object clientData;

    /**
     * User can pass in any object that needs to be accessed once the NonBlocking
     * Web service call is finished and appropriate method of this CallBack is called.
     * @param clientData Object mechanism by which the user can pass in user data
     * that will be avilable at the time this callback is called.
     */
    public WebServicesProduitsCallbackHandler(Object clientData) {
        this.clientData = clientData;
    }

    /**
     * Please use this constructor if you don't want to set any clientData
     */
    public WebServicesProduitsCallbackHandler() {
        this.clientData = null;
    }

    /**
     * Get the client data
     */
    public Object getClientData() {
        return clientData;
    }

    /**
     * auto generated Axis2 call back method for getVersion method
     * override this method for handling normal response from getVersion operation
     */
    public void receiveResultgetVersion(
        version.GetVersionResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getVersion operation
     */
    public void receiveErrorgetVersion(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getProduitsWebServices method
     * override this method for handling normal response from getProduitsWebServices operation
     */
    public void receiveResultgetProduitsWebServices(
        webservicesproduits.GetProduitsWebServicesResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getProduitsWebServices operation
     */
    public void receiveErrorgetProduitsWebServices(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getProduitsWebServicesXML method
     * override this method for handling normal response from getProduitsWebServicesXML operation
     */
    public void receiveResultgetProduitsWebServicesXML(
        webservicesproduits.GetProduitsWebServicesXMLResponseDocument result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getProduitsWebServicesXML operation
     */
    public void receiveErrorgetProduitsWebServicesXML(java.lang.Exception e) {
    }
}
