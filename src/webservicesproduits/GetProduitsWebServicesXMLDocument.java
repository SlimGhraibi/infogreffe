/*
 * An XML document type.
 * Localname: getProduitsWebServicesXML
 * Namespace: urn:WebServicesProduits
 * Java type: webservicesproduits.GetProduitsWebServicesXMLDocument
 *
 * Automatically generated - do not modify.
 */
package webservicesproduits;


/**
 * A document containing one getProduitsWebServicesXML(@urn:WebServicesProduits) element.
 *
 * This is a complex type.
 */
public interface GetProduitsWebServicesXMLDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetProduitsWebServicesXMLDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1CB8C4AA54D562F4F6D651E5A78E09AB").resolveHandle("getproduitswebservicesxmldfffdoctype");
    
    /**
     * Gets the "getProduitsWebServicesXML" element
     */
    webservicesproduits.GetProduitsWebServicesXMLDocument.GetProduitsWebServicesXML getGetProduitsWebServicesXML();
    
    /**
     * Sets the "getProduitsWebServicesXML" element
     */
    void setGetProduitsWebServicesXML(webservicesproduits.GetProduitsWebServicesXMLDocument.GetProduitsWebServicesXML getProduitsWebServicesXML);
    
    /**
     * Appends and returns a new empty "getProduitsWebServicesXML" element
     */
    webservicesproduits.GetProduitsWebServicesXMLDocument.GetProduitsWebServicesXML addNewGetProduitsWebServicesXML();
    
    /**
     * An XML getProduitsWebServicesXML(@urn:WebServicesProduits).
     *
     * This is a complex type.
     */
    public interface GetProduitsWebServicesXML extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetProduitsWebServicesXML.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s1CB8C4AA54D562F4F6D651E5A78E09AB").resolveHandle("getproduitswebservicesxml6450elemtype");
        
        /**
         * Gets the "arg0" element
         */
        java.lang.String getArg0();
        
        /**
         * Gets (as xml) the "arg0" element
         */
        org.apache.xmlbeans.XmlString xgetArg0();
        
        /**
         * Tests for nil "arg0" element
         */
        boolean isNilArg0();
        
        /**
         * Sets the "arg0" element
         */
        void setArg0(java.lang.String arg0);
        
        /**
         * Sets (as xml) the "arg0" element
         */
        void xsetArg0(org.apache.xmlbeans.XmlString arg0);
        
        /**
         * Nils the "arg0" element
         */
        void setNilArg0();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static webservicesproduits.GetProduitsWebServicesXMLDocument.GetProduitsWebServicesXML newInstance() {
              return (webservicesproduits.GetProduitsWebServicesXMLDocument.GetProduitsWebServicesXML) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static webservicesproduits.GetProduitsWebServicesXMLDocument.GetProduitsWebServicesXML newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (webservicesproduits.GetProduitsWebServicesXMLDocument.GetProduitsWebServicesXML) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static webservicesproduits.GetProduitsWebServicesXMLDocument newInstance() {
          return (webservicesproduits.GetProduitsWebServicesXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static webservicesproduits.GetProduitsWebServicesXMLDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (webservicesproduits.GetProduitsWebServicesXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static webservicesproduits.GetProduitsWebServicesXMLDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (webservicesproduits.GetProduitsWebServicesXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static webservicesproduits.GetProduitsWebServicesXMLDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (webservicesproduits.GetProduitsWebServicesXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static webservicesproduits.GetProduitsWebServicesXMLDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (webservicesproduits.GetProduitsWebServicesXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static webservicesproduits.GetProduitsWebServicesXMLDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (webservicesproduits.GetProduitsWebServicesXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static webservicesproduits.GetProduitsWebServicesXMLDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (webservicesproduits.GetProduitsWebServicesXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static webservicesproduits.GetProduitsWebServicesXMLDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (webservicesproduits.GetProduitsWebServicesXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static webservicesproduits.GetProduitsWebServicesXMLDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (webservicesproduits.GetProduitsWebServicesXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static webservicesproduits.GetProduitsWebServicesXMLDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (webservicesproduits.GetProduitsWebServicesXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static webservicesproduits.GetProduitsWebServicesXMLDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (webservicesproduits.GetProduitsWebServicesXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static webservicesproduits.GetProduitsWebServicesXMLDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (webservicesproduits.GetProduitsWebServicesXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static webservicesproduits.GetProduitsWebServicesXMLDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (webservicesproduits.GetProduitsWebServicesXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static webservicesproduits.GetProduitsWebServicesXMLDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (webservicesproduits.GetProduitsWebServicesXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static webservicesproduits.GetProduitsWebServicesXMLDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (webservicesproduits.GetProduitsWebServicesXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static webservicesproduits.GetProduitsWebServicesXMLDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (webservicesproduits.GetProduitsWebServicesXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static webservicesproduits.GetProduitsWebServicesXMLDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (webservicesproduits.GetProduitsWebServicesXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static webservicesproduits.GetProduitsWebServicesXMLDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (webservicesproduits.GetProduitsWebServicesXMLDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
