
package com.employee_service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "EmployeeMgr", targetNamespace = "http://xmlns.example.com/1577780923363")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface EmployeeMgr {


    /**
     * 
     * @param request
     * @return
     *     returns com.employee_service.EmployeeDetails
     */
    @WebMethod(operationName = "EmployeeDetails", action = "/Services/EmployeeWSDL-service0.serviceagent/EmployeeMgrEndpoint0/EmployeeDetails")
    @WebResult(name = "EmployeeDetails", targetNamespace = "http://www.tibco.com/schemas/employee_web_service/Schemas/Schema.xsd2", partName = "Response")
    public EmployeeDetails employeeDetails(
        @WebParam(name = "Employee", targetNamespace = "http://www.tibco.com/schemas/employee_web_service/Schemas/Schema.xsd", partName = "Request")
        Employee request);

}
