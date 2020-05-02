# sam-employee-api

## api

1. getEmployee: [GET]/api/employee?offset=[000]&size=[000]
   field: empNo,firstName,lastName,gender,hireDate, deptNo,deptName, managerNo, managerName
2. getDepartment: [GET]/api/department
   field: deptNo,deptName, managerNo, managerName, numberOfEmployees
3. getEmployeeByDepartment: [GET]/api/department/employee?offset=[000]&size=[000]
   field: empNo,firstName,lastName,gender,hireDate
4. getEmployeeDetail: [GET]/api/employee/{id}
5. getEmployeeDetail: [GET]/api/employee/{id}/salary


ALTER USER 'root'@'localhost' IDENTIFIED WITH mysql_native_password BY '0312';


## Ref

- sql source : https://github.com/datacharmer/test_db
- 