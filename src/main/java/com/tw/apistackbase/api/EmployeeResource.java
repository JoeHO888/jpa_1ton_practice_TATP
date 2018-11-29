package com.tw.apistackbase.api;

import com.tw.apistackbase.EmployeeRepository;
import com.tw.apistackbase.application.CompanyService;
import com.tw.apistackbase.core.Company;
import com.tw.apistackbase.core.Employee;
import com.tw.apistackbase.application.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/employees")
public class EmployeeResource {
    private final Logger log = Logger.getLogger(this.getClass().getName());

    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private EmployeeRepository repository;

    @GetMapping(produces = {"application/json"})
    public List<Employee> list() {
        return (List<Employee>) repository.findAll();
    }

    @PostMapping(produces = {"application/json"})
    public void add(@RequestBody Employee employee) {
//        employeeService.add(employee);
        repository.save(employee);
    }
}
