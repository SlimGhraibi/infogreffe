/*
 * An XML document type.
 * Localname: getProduitsWebServices
 * Namespace: urn:WebServicesProduits
 * Java type: webservicesproduits.GetProduitsWebServicesDocument
 *
 * Automatically generated - do not modify.
 */
package webservicesproduits.impl;
/**
 * A document containing one getProduitsWebServices(@urn:WebServicesProduits) element.
 *
 * This is a complex type.
 */
public class GetProduitsWebServicesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements webservicesproduits.GetProduitsWebServicesDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetProduitsWebServicesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETPRODUITSWEBSERVICES$0 = 
        new javax.xml.namespace.QName("urn:WebServicesProduits", "getProduitsWebServices");
    
    
    /**
     * Gets the "getProduitsWebServices" element
     */
    public webservicesproduits.GetProduitsWebServicesDocument.GetProduitsWebServices getGetProduitsWebServices()
    {
        synchronized (monitor())
        {
            check_orphaned();
            webservicesproduits.GetProduitsWebServicesDocument.GetProduitsWebServices target = null;
            target = (webservicesproduits.GetProduitsWebServicesDocument.GetProduitsWebServices)get_store().find_element_user(GETPRODUITSWEBSERVICES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getProduitsWebServices" element
     */
    public void setGetProduitsWebServices(webservicesproduits.GetProduitsWebServicesDocument.GetProduitsWebServices getProduitsWebServices)
    {
        generatedSetterHelperImpl(getProduitsWebServices, GETPRODUITSWEBSERVICES$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getProduitsWebServices" element
     */
    public webservicesproduits.GetProduitsWebServicesDocument.GetProduitsWebServices addNewGetProduitsWebServices()
    {
        synchronized (monitor())
        {
            check_orphaned();
            webservicesproduits.GetProduitsWebServicesDocument.GetProduitsWebServices target = null;
            target = (webservicesproduits.GetProduitsWebServicesDocument.GetProduitsWebServices)get_store().add_element_user(GETPRODUITSWEBSERVICES$0);
            return target;
        }
    }
    /**
     * An XML getProduitsWebServices(@urn:WebServicesProduits).
     *
     * This is a complex type.
     */
    public static class GetProduitsWebServicesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements webservicesproduits.GetProduitsWebServicesDocument.GetProduitsWebServices
    {
        private static final long serialVersionUID = 1L;
        
        public GetProduitsWebServicesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ARG0$0 = 
            new javax.xml.namespace.QName("", "arg0");
        private static final javax.xml.namespace.QName ARG1$2 = 
            new javax.xml.namespace.QName("", "arg1");
        private static final javax.xml.namespace.QName ARG2$4 = 
            new javax.xml.namespace.QName("", "arg2");
        private static final javax.xml.namespace.QName ARG3$6 = 
            new javax.xml.namespace.QName("", "arg3");
        private static final javax.xml.namespace.QName ARG4$8 = 
            new javax.xml.namespace.QName("", "arg4");
        private static final javax.xml.namespace.QName ARG5$10 = 
            new javax.xml.namespace.QName("", "arg5");
        private static final javax.xml.namespace.QName ARG6$12 = 
            new javax.xml.namespace.QName("", "arg6");
        private static final javax.xml.namespace.QName ARG7$14 = 
            new javax.xml.namespace.QName("", "arg7");
        private static final javax.xml.namespace.QName ARG8$16 = 
            new javax.xml.namespace.QName("", "arg8");
        private static final javax.xml.namespace.QName ARG9$18 = 
            new javax.xml.namespace.QName("", "arg9");
        private static final javax.xml.namespace.QName ARG10$20 = 
            new javax.xml.namespace.QName("", "arg10");
        
        
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
        
        /**
         * Gets the "arg1" element
         */
        public java.lang.String getArg1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARG1$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "arg1" element
         */
        public org.apache.xmlbeans.XmlString xgetArg1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARG1$2, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "arg1" element
         */
        public boolean isNilArg1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARG1$2, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "arg1" element
         */
        public void setArg1(java.lang.String arg1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARG1$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ARG1$2);
                }
                target.setStringValue(arg1);
            }
        }
        
        /**
         * Sets (as xml) the "arg1" element
         */
        public void xsetArg1(org.apache.xmlbeans.XmlString arg1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARG1$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ARG1$2);
                }
                target.set(arg1);
            }
        }
        
        /**
         * Nils the "arg1" element
         */
        public void setNilArg1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARG1$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ARG1$2);
                }
                target.setNil();
            }
        }
        
        /**
         * Gets the "arg2" element
         */
        public java.lang.String getArg2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARG2$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "arg2" element
         */
        public org.apache.xmlbeans.XmlString xgetArg2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARG2$4, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "arg2" element
         */
        public boolean isNilArg2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARG2$4, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "arg2" element
         */
        public void setArg2(java.lang.String arg2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARG2$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ARG2$4);
                }
                target.setStringValue(arg2);
            }
        }
        
        /**
         * Sets (as xml) the "arg2" element
         */
        public void xsetArg2(org.apache.xmlbeans.XmlString arg2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARG2$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ARG2$4);
                }
                target.set(arg2);
            }
        }
        
        /**
         * Nils the "arg2" element
         */
        public void setNilArg2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARG2$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ARG2$4);
                }
                target.setNil();
            }
        }
        
        /**
         * Gets the "arg3" element
         */
        public java.lang.String getArg3()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARG3$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "arg3" element
         */
        public org.apache.xmlbeans.XmlString xgetArg3()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARG3$6, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "arg3" element
         */
        public boolean isNilArg3()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARG3$6, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "arg3" element
         */
        public void setArg3(java.lang.String arg3)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARG3$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ARG3$6);
                }
                target.setStringValue(arg3);
            }
        }
        
        /**
         * Sets (as xml) the "arg3" element
         */
        public void xsetArg3(org.apache.xmlbeans.XmlString arg3)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARG3$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ARG3$6);
                }
                target.set(arg3);
            }
        }
        
        /**
         * Nils the "arg3" element
         */
        public void setNilArg3()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARG3$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ARG3$6);
                }
                target.setNil();
            }
        }
        
        /**
         * Gets the "arg4" element
         */
        public java.lang.String getArg4()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARG4$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "arg4" element
         */
        public org.apache.xmlbeans.XmlString xgetArg4()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARG4$8, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "arg4" element
         */
        public boolean isNilArg4()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARG4$8, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "arg4" element
         */
        public void setArg4(java.lang.String arg4)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARG4$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ARG4$8);
                }
                target.setStringValue(arg4);
            }
        }
        
        /**
         * Sets (as xml) the "arg4" element
         */
        public void xsetArg4(org.apache.xmlbeans.XmlString arg4)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARG4$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ARG4$8);
                }
                target.set(arg4);
            }
        }
        
        /**
         * Nils the "arg4" element
         */
        public void setNilArg4()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARG4$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ARG4$8);
                }
                target.setNil();
            }
        }
        
        /**
         * Gets the "arg5" element
         */
        public java.lang.String getArg5()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARG5$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "arg5" element
         */
        public org.apache.xmlbeans.XmlString xgetArg5()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARG5$10, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "arg5" element
         */
        public boolean isNilArg5()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARG5$10, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "arg5" element
         */
        public void setArg5(java.lang.String arg5)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARG5$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ARG5$10);
                }
                target.setStringValue(arg5);
            }
        }
        
        /**
         * Sets (as xml) the "arg5" element
         */
        public void xsetArg5(org.apache.xmlbeans.XmlString arg5)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARG5$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ARG5$10);
                }
                target.set(arg5);
            }
        }
        
        /**
         * Nils the "arg5" element
         */
        public void setNilArg5()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARG5$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ARG5$10);
                }
                target.setNil();
            }
        }
        
        /**
         * Gets the "arg6" element
         */
        public java.lang.String getArg6()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARG6$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "arg6" element
         */
        public org.apache.xmlbeans.XmlString xgetArg6()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARG6$12, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "arg6" element
         */
        public boolean isNilArg6()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARG6$12, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "arg6" element
         */
        public void setArg6(java.lang.String arg6)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARG6$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ARG6$12);
                }
                target.setStringValue(arg6);
            }
        }
        
        /**
         * Sets (as xml) the "arg6" element
         */
        public void xsetArg6(org.apache.xmlbeans.XmlString arg6)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARG6$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ARG6$12);
                }
                target.set(arg6);
            }
        }
        
        /**
         * Nils the "arg6" element
         */
        public void setNilArg6()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARG6$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ARG6$12);
                }
                target.setNil();
            }
        }
        
        /**
         * Gets the "arg7" element
         */
        public java.lang.String getArg7()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARG7$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "arg7" element
         */
        public org.apache.xmlbeans.XmlString xgetArg7()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARG7$14, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "arg7" element
         */
        public boolean isNilArg7()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARG7$14, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "arg7" element
         */
        public void setArg7(java.lang.String arg7)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARG7$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ARG7$14);
                }
                target.setStringValue(arg7);
            }
        }
        
        /**
         * Sets (as xml) the "arg7" element
         */
        public void xsetArg7(org.apache.xmlbeans.XmlString arg7)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARG7$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ARG7$14);
                }
                target.set(arg7);
            }
        }
        
        /**
         * Nils the "arg7" element
         */
        public void setNilArg7()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARG7$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ARG7$14);
                }
                target.setNil();
            }
        }
        
        /**
         * Gets the "arg8" element
         */
        public java.lang.String getArg8()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARG8$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "arg8" element
         */
        public org.apache.xmlbeans.XmlString xgetArg8()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARG8$16, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "arg8" element
         */
        public boolean isNilArg8()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARG8$16, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "arg8" element
         */
        public void setArg8(java.lang.String arg8)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARG8$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ARG8$16);
                }
                target.setStringValue(arg8);
            }
        }
        
        /**
         * Sets (as xml) the "arg8" element
         */
        public void xsetArg8(org.apache.xmlbeans.XmlString arg8)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARG8$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ARG8$16);
                }
                target.set(arg8);
            }
        }
        
        /**
         * Nils the "arg8" element
         */
        public void setNilArg8()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARG8$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ARG8$16);
                }
                target.setNil();
            }
        }
        
        /**
         * Gets the "arg9" element
         */
        public java.lang.String getArg9()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARG9$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "arg9" element
         */
        public org.apache.xmlbeans.XmlString xgetArg9()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARG9$18, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "arg9" element
         */
        public boolean isNilArg9()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARG9$18, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "arg9" element
         */
        public void setArg9(java.lang.String arg9)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARG9$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ARG9$18);
                }
                target.setStringValue(arg9);
            }
        }
        
        /**
         * Sets (as xml) the "arg9" element
         */
        public void xsetArg9(org.apache.xmlbeans.XmlString arg9)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARG9$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ARG9$18);
                }
                target.set(arg9);
            }
        }
        
        /**
         * Nils the "arg9" element
         */
        public void setNilArg9()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARG9$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ARG9$18);
                }
                target.setNil();
            }
        }
        
        /**
         * Gets the "arg10" element
         */
        public java.lang.String getArg10()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARG10$20, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "arg10" element
         */
        public org.apache.xmlbeans.XmlString xgetArg10()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARG10$20, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "arg10" element
         */
        public boolean isNilArg10()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARG10$20, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "arg10" element
         */
        public void setArg10(java.lang.String arg10)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARG10$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ARG10$20);
                }
                target.setStringValue(arg10);
            }
        }
        
        /**
         * Sets (as xml) the "arg10" element
         */
        public void xsetArg10(org.apache.xmlbeans.XmlString arg10)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARG10$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ARG10$20);
                }
                target.set(arg10);
            }
        }
        
        /**
         * Nils the "arg10" element
         */
        public void setNilArg10()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ARG10$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ARG10$20);
                }
                target.setNil();
            }
        }
    }
}
