/*
 * An XML document type.
 * Localname: getProduitsWebServicesResponse
 * Namespace: urn:WebServicesProduits
 * Java type: webservicesproduits.GetProduitsWebServicesResponseDocument
 *
 * Automatically generated - do not modify.
 */
package webservicesproduits.impl;
/**
 * A document containing one getProduitsWebServicesResponse(@urn:WebServicesProduits) element.
 *
 * This is a complex type.
 */
public class GetProduitsWebServicesResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements webservicesproduits.GetProduitsWebServicesResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetProduitsWebServicesResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETPRODUITSWEBSERVICESRESPONSE$0 = 
        new javax.xml.namespace.QName("urn:WebServicesProduits", "getProduitsWebServicesResponse");
    
    
    /**
     * Gets the "getProduitsWebServicesResponse" element
     */
    public webservicesproduits.GetProduitsWebServicesResponseDocument.GetProduitsWebServicesResponse getGetProduitsWebServicesResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            webservicesproduits.GetProduitsWebServicesResponseDocument.GetProduitsWebServicesResponse target = null;
            target = (webservicesproduits.GetProduitsWebServicesResponseDocument.GetProduitsWebServicesResponse)get_store().find_element_user(GETPRODUITSWEBSERVICESRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getProduitsWebServicesResponse" element
     */
    public void setGetProduitsWebServicesResponse(webservicesproduits.GetProduitsWebServicesResponseDocument.GetProduitsWebServicesResponse getProduitsWebServicesResponse)
    {
        generatedSetterHelperImpl(getProduitsWebServicesResponse, GETPRODUITSWEBSERVICESRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getProduitsWebServicesResponse" element
     */
    public webservicesproduits.GetProduitsWebServicesResponseDocument.GetProduitsWebServicesResponse addNewGetProduitsWebServicesResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            webservicesproduits.GetProduitsWebServicesResponseDocument.GetProduitsWebServicesResponse target = null;
            target = (webservicesproduits.GetProduitsWebServicesResponseDocument.GetProduitsWebServicesResponse)get_store().add_element_user(GETPRODUITSWEBSERVICESRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getProduitsWebServicesResponse(@urn:WebServicesProduits).
     *
     * This is a complex type.
     */
    public static class GetProduitsWebServicesResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements webservicesproduits.GetProduitsWebServicesResponseDocument.GetProduitsWebServicesResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetProduitsWebServicesResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
