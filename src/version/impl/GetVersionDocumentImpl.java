/*
 * An XML document type.
 * Localname: getVersion
 * Namespace: urn:Version
 * Java type: version.GetVersionDocument
 *
 * Automatically generated - do not modify.
 */
package version.impl;
/**
 * A document containing one getVersion(@urn:Version) element.
 *
 * This is a complex type.
 */
public class GetVersionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements version.GetVersionDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetVersionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETVERSION$0 = 
        new javax.xml.namespace.QName("urn:Version", "getVersion");
    
    
    /**
     * Gets the "getVersion" element
     */
    public version.GetVersionDocument.GetVersion getGetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            version.GetVersionDocument.GetVersion target = null;
            target = (version.GetVersionDocument.GetVersion)get_store().find_element_user(GETVERSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getVersion" element
     */
    public void setGetVersion(version.GetVersionDocument.GetVersion getVersion)
    {
        generatedSetterHelperImpl(getVersion, GETVERSION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getVersion" element
     */
    public version.GetVersionDocument.GetVersion addNewGetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            version.GetVersionDocument.GetVersion target = null;
            target = (version.GetVersionDocument.GetVersion)get_store().add_element_user(GETVERSION$0);
            return target;
        }
    }
    /**
     * An XML getVersion(@urn:Version).
     *
     * This is a complex type.
     */
    public static class GetVersionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements version.GetVersionDocument.GetVersion
    {
        private static final long serialVersionUID = 1L;
        
        public GetVersionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
