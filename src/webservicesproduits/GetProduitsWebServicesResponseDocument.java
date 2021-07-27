/*
 * An XML document type.
 * Localname: getProduitsWebServicesResponse
 * Namespace: urn:WebServicesProduits
 * Java type: webservicesproduits.GetProduitsWebServicesResponseDocument
 *
 * Automatically generated - do not modify.
 */
package webservicesproduits;


/**
 * A document containing one getProduitsWebServicesResponse(@urn:WebServicesProduits) element.
 *
 * This is a complex type.
 */
public interface GetProduitsWebServicesResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetProduitsWebServicesResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1CB8C4AA54D562F4F6D651E5A78E09AB").resolveHandle("getproduitswebservicesresponsefd5fdoctype");
    
    /**
     * Gets the "getProduitsWebServicesResponse" element
     */
    webservicesproduits.GetProduitsWebServicesResponseDocument.GetProduitsWebServicesResponse getGetProduitsWebServicesResponse();
    
    /**
     * Sets the "getProduitsWebServicesResponse" element
     */
    void setGetProduitsWebServicesResponse(webservicesproduits.GetProduitsWebServicesResponseDocument.GetProduitsWebServicesResponse getProduitsWebServicesResponse);
    
    /**
     * Appends and returns a new empty "getProduitsWebServicesResponse" element
     */
    webservicesproduits.GetProduitsWebServicesResponseDocument.GetProduitsWebServicesResponse addNewGetProduitsWebServicesResponse();
    
    /**
     * An XML getProduitsWebServicesResponse(@urn:WebServicesProduits).
     *
     * This is a complex type.
     */
    public interface GetProduitsWebServicesResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetProduitsWebServicesResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1CB8C4AA54D562F4F6D651E5A78E09AB").resolveHandle("getproduitswebservicesresponsef8f0elemtype");
        
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
            public static webservicesproduits.GetProduitsWebServicesResponseDocument.GetProduitsWebServicesResponse newInstance() {
              return (webservicesproduits.GetProduitsWebServicesResponseDocument.GetProduitsWebServicesResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static webservicesproduits.GetProduitsWebServicesResponseDocument.GetProduitsWebServicesResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (webservicesproduits.GetProduitsWebServicesResponseDocument.GetProduitsWebServicesResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static webservicesproduits.GetProduitsWebServicesResponseDocument newInstance() {
          return (webservicesproduits.GetProduitsWebServicesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static webservicesproduits.GetProduitsWebServicesResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (webservicesproduits.GetProduitsWebServicesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static webservicesproduits.GetProduitsWebServicesResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (webservicesproduits.GetProduitsWebServicesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static webservicesproduits.GetProduitsWebServicesResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (webservicesproduits.GetProduitsWebServicesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static webservicesproduits.GetProduitsWebServicesResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (webservicesproduits.GetProduitsWebServicesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static webservicesproduits.GetProduitsWebServicesResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (webservicesproduits.GetProduitsWebServicesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static webservicesproduits.GetProduitsWebServicesResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (webservicesproduits.GetProduitsWebServicesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static webservicesproduits.GetProduitsWebServicesResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (webservicesproduits.GetProduitsWebServicesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static webservicesproduits.GetProduitsWebServicesResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (webservicesproduits.GetProduitsWebServicesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static webservicesproduits.GetProduitsWebServicesResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (webservicesproduits.GetProduitsWebServicesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static webservicesproduits.GetProduitsWebServicesResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (webservicesproduits.GetProduitsWebServicesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static webservicesproduits.GetProduitsWebServicesResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (webservicesproduits.GetProduitsWebServicesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static webservicesproduits.GetProduitsWebServicesResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (webservicesproduits.GetProduitsWebServicesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static webservicesproduits.GetProduitsWebServicesResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (webservicesproduits.GetProduitsWebServicesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static webservicesproduits.GetProduitsWebServicesResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (webservicesproduits.GetProduitsWebServicesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static webservicesproduits.GetProduitsWebServicesResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (webservicesproduits.GetProduitsWebServicesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static webservicesproduits.GetProduitsWebServicesResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (webservicesproduits.GetProduitsWebServicesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static webservicesproduits.GetProduitsWebServicesResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (webservicesproduits.GetProduitsWebServicesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
