/*
 * An XML document type.
 * Localname: getVersionResponse
 * Namespace: urn:Version
 * Java type: version.GetVersionResponseDocument
 *
 * Automatically generated - do not modify.
 */
package version.impl;
/**
 * A document containing one getVersionResponse(@urn:Version) element.
 *
 * This is a complex type.
 */
public class GetVersionResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements version.GetVersionResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetVersionResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETVERSIONRESPONSE$0 = 
        new javax.xml.namespace.QName("urn:Version", "getVersionResponse");
    
    
    /**
     * Gets the "getVersionResponse" element
     */
    public version.GetVersionResponseDocument.GetVersionResponse getGetVersionResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            version.GetVersionResponseDocument.GetVersionResponse target = null;
            target = (version.GetVersionResponseDocument.GetVersionResponse)get_store().find_element_user(GETVERSIONRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getVersionResponse" element
     */
    public void setGetVersionResponse(version.GetVersionResponseDocument.GetVersionResponse getVersionResponse)
    {
        generatedSetterHelperImpl(getVersionResponse, GETVERSIONRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getVersionResponse" element
     */
    public version.GetVersionResponseDocument.GetVersionResponse addNewGetVersionResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            version.GetVersionResponseDocument.GetVersionResponse target = null;
            target = (version.GetVersionResponseDocument.GetVersionResponse)get_store().add_element_user(GETVERSIONRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML getVersionResponse(@urn:Version).
     *
     * This is a complex type.
     */
    public static class GetVersionResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements version.GetVersionResponseDocument.GetVersionResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetVersionResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
