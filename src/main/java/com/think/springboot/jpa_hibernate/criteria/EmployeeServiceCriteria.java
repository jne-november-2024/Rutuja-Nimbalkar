package com.think.springboot.jpa_hibernate.criteria;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceCriteria {
    @PersistenceContext
    private EntityManager entityManager;

    // Fetch all employees
    public List<Employee> getAllEmployees() {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder(); // Get the builder
        CriteriaQuery<Employee> query = cb.createQuery(Employee.class); // Define the query structure
        Root<Employee> root = query.from(Employee.class); // Set the FROM entity

        query.select(root); // SELECT * FROM emp_tab
        return entityManager.createQuery(query).getResultList();
    }

    public List<Employee> getEmpBySalDept(String dept,long salary) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Employee> query = cb.createQuery(Employee.class);
        Root<Employee> root = query.from(Employee.class);

        // Create conditions
        Predicate deptCondition = cb.equal(root.get("dept"), dept); // dept = :dept
        Predicate salaryCondition = cb.gt(root.get("salary"), salary);

        // Combine conditions using AND
        query.select(root).where(cb.and(deptCondition, salaryCondition));

        // Execute the query
        return entityManager.createQuery(query).getResultList();
    }


}
