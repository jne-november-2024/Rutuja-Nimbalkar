package com.think.springboot.jpa_hibernate.criteria;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpController {

    private EmployeeServiceCriteria serviceCriteria;

    public EmpController(EmployeeServiceCriteria serviceCriteria) {
        this.serviceCriteria = serviceCriteria;
    }

    // Fetch all employees
    @GetMapping("get/all/Emp")
    public List<Employee> getAllEmployees() {
        return serviceCriteria.getAllEmployees();
    }

    @GetMapping("get/specific/emp/{dept}/{salary}")
    public List<Employee> getEmpBySalDept(@PathVariable String dept,@PathVariable long salary){

        return serviceCriteria.getEmpBySalDept(dept,salary);
    }
}
