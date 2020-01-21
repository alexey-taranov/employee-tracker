package ru.taranov.springboot.cruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.taranov.springboot.cruddemo.entity.Employee;

import java.util.List;

//@RepositoryRestResource(path = "members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    // no need to write code

    // add a method to sort by last name
    public List<Employee> findAllByOrderByLastNameAsc();
}
