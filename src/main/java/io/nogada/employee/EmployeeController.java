package io.nogada.employee;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller
 */
@RestController
@RequestMapping(value = "/api")
public class EmployeeController {

    private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    EmployeeService service;

    @GetMapping(value = "")
    public String index() {
        logger.info("this is index of api service");
        return "This is an application of employee management ";
    }

    @GetMapping(value = "employee")
    public @ResponseBody List<Employee> getEmployees(@RequestParam(defaultValue = "0") int offset,
            @RequestParam(defaultValue = "100") int size) {
        logger.info("this is api for employee information");
        return this.service.getEmployee(offset, size);
    }

    @GetMapping(value = "department")
    public String getDepartment(@RequestParam String param) {
        logger.info("this is api for department information");
        return "department";
    }

}