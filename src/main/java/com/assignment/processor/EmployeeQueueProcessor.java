package com.assignment.processor;

import com.assignment.pojo.Employee;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import java.util.UUID;

public class EmployeeQueueProcessor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        Employee employee = exchange.getIn().getBody(Employee.class);
        employee.setId(UUID.randomUUID());
        exchange.getIn().setBody(employee);
    }
}
