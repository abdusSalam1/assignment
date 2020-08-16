package com.assignment.processor;

import com.assignment.pojo.Employee;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeDelegateProcessor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        Employee employee = exchange.getIn().getBody(Employee.class);
    }
}
