
package com.employee_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.tibco.com/schemas/employee_web_service/Schemas/Schema.xsd2}EmployeeAge"/>
 *         &lt;element ref="{http://www.tibco.com/schemas/employee_web_service/Schemas/Schema.xsd2}EmployeeDesignation"/>
 *         &lt;element ref="{http://www.tibco.com/schemas/employee_web_service/Schemas/Schema.xsd2}EmployeeName"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "employeeAge",
    "employeeDesignation",
    "employeeName"
})
@XmlRootElement(name = "EmployeeDetails", namespace = "http://www.tibco.com/schemas/employee_web_service/Schemas/Schema.xsd2")
public class EmployeeDetails {

    @XmlElement(name = "EmployeeAge", namespace = "http://www.tibco.com/schemas/employee_web_service/Schemas/Schema.xsd2", required = true)
    protected String employeeAge;
    @XmlElement(name = "EmployeeDesignation", namespace = "http://www.tibco.com/schemas/employee_web_service/Schemas/Schema.xsd2", required = true)
    protected String employeeDesignation;
    @XmlElement(name = "EmployeeName", namespace = "http://www.tibco.com/schemas/employee_web_service/Schemas/Schema.xsd2", required = true)
    protected String employeeName;

    /**
     * Gets the value of the employeeAge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeAge() {
        return employeeAge;
    }

    /**
     * Sets the value of the employeeAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeAge(String value) {
        this.employeeAge = value;
    }

    /**
     * Gets the value of the employeeDesignation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeDesignation() {
        return employeeDesignation;
    }

    /**
     * Sets the value of the employeeDesignation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeDesignation(String value) {
        this.employeeDesignation = value;
    }

    /**
     * Gets the value of the employeeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeName() {
        return employeeName;
    }

    /**
     * Sets the value of the employeeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeName(String value) {
        this.employeeName = value;
    }

}
