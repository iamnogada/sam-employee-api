package io.nogada.employee;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * EmployeeDAOTest
 */
@ExtendWith(SpringExtension.class)
@MybatisTest
@ActiveProfiles("test")
public class EmployeeDAOTest {

    // @Autowired
    // private EmployeeDAO employeeDAO;

    @Test
    public void getEmployee() {
        // this.employeeDAO.getEmployee();
    }
}