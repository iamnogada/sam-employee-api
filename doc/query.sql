-- getEmployee
select
    b1.dept_no,
    b2.dept_name,
    b2.manager_no,
    b2.manager_name,
    b1.emp_no,
    concat(b3.first_name, " ", b3.last_name) as emp_name,
    b3.gender,
    b3.birth_date,
    b4.title
from
    dept_emp as b1
    left join (
        select
            a1.dept_no,
            a3.dept_name,
            a1.emp_no as manager_no,
            concat(a2.first_name, " ", a2.last_name) as manager_name
        from
            dept_manager as a1
            left join employees as a2 on a1.emp_no = a2.emp_no
            left join departments as a3 on a1.dept_no = a3.dept_no
        where
            a1.to_date = '9999-01-01'
    ) as b2 on b1.dept_no = b2.dept_no
    left join employees as b3 on b1.emp_no = b3.emp_no
    left join titles as b4 on b1.emp_no = b4.emp_no
where
    b1.to_date = "9999-01-01"
    and b4.to_date = "9999-01-01"
order by
    b1.emp_no asc
limit
    0, 100;