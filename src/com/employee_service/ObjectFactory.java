
package com.employee_service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.employee_service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EmployeeName_QNAME = new QName("http://www.tibco.com/schemas/employee_web_service/Schemas/Schema.xsd2", "EmployeeName");
    private final static QName _EmployeeCode_QNAME = new QName("http://www.tibco.com/schemas/employee_web_service/Schemas/Schema.xsd", "EmployeeCode");
    private final static QName _EmployeeAge_QNAME = new QName("http://www.tibco.com/schemas/employee_web_service/Schemas/Schema.xsd2", "EmployeeAge");
    private final static QName _EmployeeDesignation_QNAME = new QName("http://www.tibco.com/schemas/employee_web_service/Schemas/Schema.xsd2", "EmployeeDesignation");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.employee_service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Employee }
     * 
     */
    public Employee createEmployee() {
        return new Employee();
    }

    /**
     * Create an instance of {@link EmployeeDetails }
     * 
     */
    public EmployeeDetails createEmployeeDetails() {
        return new EmployeeDetails();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tibco.com/schemas/employee_web_service/Schemas/Schema.xsd2", name = "EmployeeName")
    public JAXBElement<String> createEmployeeName(String value) {
        return new JAXBElement<String>(_EmployeeName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tibco.com/schemas/employee_web_service/Schemas/Schema.xsd", name = "EmployeeCode")
    public JAXBElement<String> createEmployeeCode(String value) {
        return new JAXBElement<String>(_EmployeeCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tibco.com/schemas/employee_web_service/Schemas/Schema.xsd2", name = "EmployeeAge")
    public JAXBElement<String> createEmployeeAge(String value) {
        return new JAXBElement<String>(_EmployeeAge_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.tibco.com/schemas/employee_web_service/Schemas/Schema.xsd2", name = "EmployeeDesignation")
    public JAXBElement<String> createEmployeeDesignation(String value) {
        return new JAXBElement<String>(_EmployeeDesignation_QNAME, String.class, null, value);
    }

}
