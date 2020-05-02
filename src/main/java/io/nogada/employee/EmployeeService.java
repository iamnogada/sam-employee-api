package io.nogada.employee;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Service
 */
@Service
public class EmployeeService {

    private static final Logger logger = LoggerFactory.getLogger(EmployeeService.class);
    @Autowired
    EmployeeDAO employeeDAO;

    List<Employee> getEmployee(int offset, int size) {
        logger.info("called EmployeeService");
        List<Employee> list = this.employeeDAO.getEmployee(offset, size);
        return list;
    }

    List<Employee> getEmployee() {
        return this.getEmployee(0, 100);
    }
}