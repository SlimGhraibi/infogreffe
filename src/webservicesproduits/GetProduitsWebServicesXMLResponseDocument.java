/*
 * An XML document type.
 * Localname: getProduitsWebServicesXMLResponse
 * Namespace: urn:WebServicesProduits
 * Java type: webservicesproduits.GetProduitsWebServicesXMLResponseDocument
 *
 * Automatically generated - do not modify.
 */
package webservicesproduits;


/**
 * A document containing one getProduitsWebServicesXMLResponse(@urn:WebServicesProduits) element.
 *
 * This is a complex type.
 */
public interface GetProduitsWebServicesXMLResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetProduitsWebServicesXMLResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1CB8C4AA54D562F4F6D651E5A78E09AB").resolveHandle("getproduitswebservicesxmlresponseb960doctype");
    
    /**
     * Gets the "getProduitsWebServicesXMLResponse" element
     */
    webservicesproduits.GetProduitsWebServicesXMLResponseDocument.GetProduitsWebServicesXMLResponse getGetProduitsWebServicesXMLResponse();
    
    /**
     * Sets the "getProduitsWebServicesXMLResponse" element
     */
    void setGetProduitsWebServicesXMLResponse(webservicesproduits.GetProduitsWebServicesXMLResponseDocument.GetProduitsWebServicesXMLResponse getProduitsWebServicesXMLResponse);
    
    /**
     * Appends and returns a new empty "getProduitsWebServicesXMLResponse" element
     */
    webservicesproduits.GetProduitsWebServicesXMLResponseDocument.GetProduitsWebServicesXMLResponse addNewGetProduitsWebServicesXMLResponse();
    
    /**
     * An XML getProduitsWebServicesXMLResponse(@urn:WebServicesProduits).
     *
     * This is a complex type.
     */
    public interface GetProduitsWebServicesXMLResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetProduitsWebServicesXMLResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1CB8C4AA54D562F4F6D651E5A78E09AB").resolveHandle("getproduitswebservicesxmlresponse0892elemtype");
        
        /**
         * Gets the "return" element
         */
        java.lang.String getReturn();
        
        /**
         * Gets (as xml) the "return" element
         */
        org.apache.xmlbeans.XmlString xgetReturn();
        
        /**
         * Tests for nil "return" element
         */
        boolean isNilReturn();
        
        /**
         * Sets the "return" element
         */
        void setReturn(java.lang.String xreturn);
        
        /**
         * Sets (as xml) the "return" element
         */
        void xsetReturn(org.apache.xmlbeans.XmlString xreturn);
        
        /**
         * Nils the "return" element
         */
        void setNilReturn();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static webservicesproduits.GetProduitsWebServicesXMLResponseDocument.GetProduitsWebServicesXMLResponse newInstance() {
              return (webservicesproduits.GetProduitsWebServicesXMLResponseDocument.GetProduitsWebServicesXMLResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static webservicesproduits.GetProduitsWebServicesXMLResponseDocument.GetProduitsWebServicesXMLResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (webservicesproduits.GetProduitsWebServicesXMLResponseDocument.GetProduitsWebServicesXMLResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static webservicesproduits.GetProduitsWebServicesXMLResponseDocument newInstance() {
          return (webservicesproduits.GetProduitsWebServicesXMLResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static webservicesproduits.GetProduitsWebServicesXMLResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (webservicesproduits.GetProduitsWebServicesXMLResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static webservicesproduits.GetProduitsWebServicesXMLResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (webservicesproduits.GetProduitsWebServicesXMLResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static webservicesproduits.GetProduitsWebServicesXMLResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (webservicesproduits.GetProduitsWebServicesXMLResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static webservicesproduits.GetProduitsWebServicesXMLResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (webservicesproduits.GetProduitsWebServicesXMLResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static webservicesproduits.GetProduitsWebServicesXMLResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (webservicesproduits.GetProduitsWebServicesXMLResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static webservicesproduits.GetProduitsWebServicesXMLResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (webservicesproduits.GetProduitsWebServicesXMLResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static webservicesproduits.GetProduitsWebServicesXMLResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (webservicesproduits.GetProduitsWebServicesXMLResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static webservicesproduits.GetProduitsWebServicesXMLResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (webservicesproduits.GetProduitsWebServicesXMLResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static webservicesproduits.GetProduitsWebServicesXMLResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (webservicesproduits.GetProduitsWebServicesXMLResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static webservicesproduits.GetProduitsWebServicesXMLResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (webservicesproduits.GetProduitsWebServicesXMLResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static webservicesproduits.GetProduitsWebServicesXMLResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (webservicesproduits.GetProduitsWebServicesXMLResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static webservicesproduits.GetProduitsWebServicesXMLResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (webservicesproduits.GetProduitsWebServicesXMLResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static webservicesproduits.GetProduitsWebServicesXMLResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (webservicesproduits.GetProduitsWebServicesXMLResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static webservicesproduits.GetProduitsWebServicesXMLResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (webservicesproduits.GetProduitsWebServicesXMLResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static webservicesproduits.GetProduitsWebServicesXMLResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (webservicesproduits.GetProduitsWebServicesXMLResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static webservicesproduits.GetProduitsWebServicesXMLResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (webservicesproduits.GetProduitsWebServicesXMLResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static webservicesproduits.GetProduitsWebServicesXMLResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (webservicesproduits.GetProduitsWebServicesXMLResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
