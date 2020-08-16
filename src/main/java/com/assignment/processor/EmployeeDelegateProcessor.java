package com.assignment.processor;

import com.assignment.domain.Employee;
import com.assignment.service.EmployeeService;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeDelegateProcessor implements Processor {

    @Autowired
    private EmployeeService employeeService;

    @Override
    public void process(Exchange exchange) throws Exception {
        Employee employee = exchange.getIn().getBody(Employee.class);
        if( employee != null) {
            employee.setActive(true);
            employeeService.addEmployee(employee);
        }
    }
}
