/*
 * An XML document type.
 * Localname: getProduitsWebServicesXML
 * Namespace: urn:WebServicesProduits
 * Java type: webservicesproduits.GetProduitsWebServicesXMLDocument
 *
 * Automatically generated - do not modify.
 */
package webservicesproduits.impl;
/**
 * A document containing one getProduitsWebServicesXML(@urn:WebServicesProduits) element.
 *
 * This is a complex type.
 */
public class GetProduitsWebServicesXMLDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements webservicesproduits.GetProduitsWebServicesXMLDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetProduitsWebServicesXMLDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETPRODUITSWEBSERVICESXML$0 = 
        new javax.xml.namespace.QName("urn:WebServicesProduits", "getProduitsWebServicesXML");
    
    
    /**
     * Gets the "getProduitsWebServicesXML" element
     */
    public webservicesproduits.GetProduitsWebServicesXMLDocument.GetProduitsWebServicesXML getGetProduitsWebServicesXML()
    {
        synchronized (monitor())
        {
            check_orphaned();
            webservicesproduits.GetProduitsWebServicesXMLDocument.GetProduitsWebServicesXML target = null;
            target = (webservicesproduits.GetProduitsWebServicesXMLDocument.GetProduitsWebServicesXML)get_store().find_element_user(GETPRODUITSWEBSERVICESXML$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getProduitsWebServicesXML" element
     */
    public void setGetProduitsWebServicesXML(webservicesproduits.GetProduitsWebServicesXMLDocument.GetProduitsWebServicesXML getProduitsWebServicesXML)
    {
        generatedSetterHelperImpl(getProduitsWebServicesXML, GETPRODUITSWEBSERVICESXML$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getProduitsWebServicesXML" element
     */
    public webservicesproduits.GetProduitsWebServicesXMLDocument.GetProduitsWebServicesXML addNewGetProduitsWebServicesXML()
    {
        synchronized (monitor())
        {
            check_orphaned();
            webservicesproduits.GetProduitsWebServicesXMLDocument.GetProduitsWebServicesXML target = null;
            target = (webservicesproduits.GetProduitsWebServicesXMLDocument.GetProduitsWebServicesXML)get_store().add_element_user(GETPRODUITSWEBSERVICESXML$0);
            return target;
        }
    }
    /**
     * An XML getProduitsWebServicesXML(@urn:WebServicesProduits).
     *
     * This is a complex type.
     */
    public static class GetProduitsWebServicesXMLImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements webservicesproduits.GetProduitsWebServicesXMLDocument.GetProduitsWebServicesXML
    {
        private static final long serialVersionUID = 1L;
        
        public GetProduitsWebServicesXMLImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ARG0$0 = 
            new javax.xml.namespace.QName("", "arg0");
        
        
        /**
         * Gets the "arg0" element
         */
        public java.lang.String getArg0()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARG0$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "arg0" element
         */
        public org.apache.xmlbeans.XmlString xgetArg0()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARG0$0, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "arg0" element
         */
        public boolean isNilArg0()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARG0$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "arg0" element
         */
        public void setArg0(java.lang.String arg0)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARG0$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ARG0$0);
                }
                target.setStringValue(arg0);
            }
        }
        
        /**
         * Sets (as xml) the "arg0" element
         */
        public void xsetArg0(org.apache.xmlbeans.XmlString arg0)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARG0$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ARG0$0);
                }
                target.set(arg0);
            }
        }
        
        /**
         * Nils the "arg0" element
         */
        public void setNilArg0()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARG0$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ARG0$0);
                }
                target.setNil();
            }
        }
    }
}
