/*
 * An XML document type.
 * Localname: getProduitsWebServicesXMLResponse
 * Namespace: urn:WebServicesProduits
 * Java type: webservicesproduits.GetProduitsWebServicesXMLResponseDocument
 *
 * Automatically generated - do not modify.
 */
package webservicesproduits.impl;
/**
 * A document containing one getProduitsWebServicesXMLResponse(@urn:WebServicesProduits) element.
 *
 * This is a complex type.
 */
public class GetProduitsWebServicesXMLResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements webservicesproduits.GetProduitsWebServicesXMLResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetProduitsWebServicesXMLResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETPRODUITSWEBSERVICESXMLRESPONSE$0 = 
        new javax.xml.namespace.QName("urn:WebServicesProduits", "getProduitsWebServicesXMLResponse");
    
    
    /**
     * Gets the "getProduitsWebServicesXMLResponse" element
     */
    public webservicesproduits.GetProduitsWebServicesXMLResponseDocument.GetProduitsWebServicesXMLResponse getGetProduitsWebServicesXMLResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            webservicesproduits.GetProduitsWebServicesXMLResponseDocument.GetProduitsWebServicesXMLResponse target = null;
            target = (webservicesproduits.GetProduitsWebServicesXMLResponseDocument.GetProduitsWebServicesXMLResponse)get_store().find_element_user(GETPRODUITSWEBSERVICESXMLRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getProduitsWebServicesXMLResponse" element
     */
    public void setGetProduitsWebServicesXMLResponse(webservicesproduits.GetProduitsWebServicesXMLResponseDocument.GetProduitsWebServicesXMLResponse getProduitsWebServicesXMLResponse)
    {
        generatedSetterHelperImpl(getProduitsWebServicesXMLResponse, GETPRODUITSWEBSERVICESXMLRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getProduitsWebServicesXMLResponse" element
     */
    public webservicesproduits.GetProduitsWebServicesXMLResponseDocument.GetProduitsWebServicesXMLResponse addNewGetProduitsWebServicesXMLResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            webservicesproduits.GetProduitsWebServicesXMLResponseDocument.GetProduitsWebServicesXMLResponse target = null;
            target = (webservicesproduits.GetProduitsWebServicesXMLResponseDocument.GetProduitsWebServicesXMLResponse)get_store().add_element_user(GETPRODUITSWEBSERVICESXMLRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getProduitsWebServicesXMLResponse(@urn:WebServicesProduits).
     *
     * This is a complex type.
     */
    public static class GetProduitsWebServicesXMLResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements webservicesproduits.GetProduitsWebServicesXMLResponseDocument.GetProduitsWebServicesXMLResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetProduitsWebServicesXMLResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RETURN$0 = 
            new javax.xml.namespace.QName("", "return");
        
        
        /**
         * Gets the "return" element
         */
        public java.lang.String getReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "return" element
         */
        public org.apache.xmlbeans.XmlString xgetReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RETURN$0, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "return" element
         */
        public boolean isNilReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RETURN$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "return" element
         */
        public void setReturn(java.lang.String xreturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RETURN$0);
                }
                target.setStringValue(xreturn);
            }
        }
        
        /**
         * Sets (as xml) the "return" element
         */
        public void xsetReturn(org.apache.xmlbeans.XmlString xreturn)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RETURN$0);
                }
                target.set(xreturn);
            }
        }
        
        /**
         * Nils the "return" element
         */
        public void setNilReturn()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RETURN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RETURN$0);
                }
                target.setNil();
            }
        }
    }
}
