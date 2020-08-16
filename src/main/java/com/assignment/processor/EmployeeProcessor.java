package com.assignment.processor;

import com.assignment.domain.Employee;
import com.assignment.model.EmployeeModel;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.context.annotation.Configuration;

import java.util.UUID;

@Configuration
public class EmployeeProcessor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        EmployeeModel employeeModel = exchange.getIn().getBody(EmployeeModel.class);
        exchange.getIn().setBody(toEmployee(employeeModel));
    }

    private Employee toEmployee(EmployeeModel employeeModel) {
        return new Employee(UUID.randomUUID(), employeeModel.getName(), employeeModel.getAge());
    }
}
