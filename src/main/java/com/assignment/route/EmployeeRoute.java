package com.assignment.route;

import com.assignment.pojo.Employee;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.stereotype.Component;

@Component
public class EmployeeRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        restConfiguration().component("servlet")
                .port(8081)
                .host("localhost")
                .bindingMode(RestBindingMode.json);

        rest("/api/")
                .id("restful-route")
                .consumes("application/json")
                .produces("application/json")
                .post("/employees")
//                .bindingMode(RestBindingMode.json)
                .type(Employee.class)
                .to("direct:remoteService");
    }
}
