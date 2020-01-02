import java.util.Scanner;

import com.employee_service.Employee;
import com.employee_service.EmployeeMgr;
import com.employee_service.EmployeeWSDLService0;

public class EmployeeDetails {
	
	public static void main(String [] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Employee Code: ");
		String employeeCode = scanner.nextLine();
		System.out.println("Employee Code: " + employeeCode);
		
		EmployeeWSDLService0 employeeWSDLService0 = new EmployeeWSDLService0();
		EmployeeMgr employeeMgr = employeeWSDLService0.getEmployeeMgrEndpoint0();
		
		Employee employee = new Employee();
		employee.setEmployeeCode(employeeCode);
		
		com.employee_service.EmployeeDetails employeeDetails = employeeMgr.employeeDetails(employee);
		
		System.out.println("Employee Name : " + employeeDetails.getEmployeeName());
		System.out.println("Employee Designation : " + employeeDetails.getEmployeeDesignation());
		System.out.println("Employee Age : " + employeeDetails.getEmployeeAge());
	}
}
