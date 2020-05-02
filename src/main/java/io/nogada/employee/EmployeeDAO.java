package io.nogada.employee;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

/**
 * EmployeeDao
 */
@Mapper
public interface EmployeeDAO {
    public List<Employee> getEmployee(int offset, int size);
}