package com.tw.apistackbase.api;

import com.tw.apistackbase.CompanyRepository;
import com.tw.apistackbase.EmployeeRepository;
import com.tw.apistackbase.application.CompanyService;
import com.tw.apistackbase.application.EmployeeService;
import com.tw.apistackbase.core.Company;
import com.tw.apistackbase.core.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/companies")
public class CompanyResource {
    private final Logger log = Logger.getLogger(this.getClass().getName());

    @Autowired
    private CompanyService companyService;
    @Autowired
    private CompanyRepository repository;

    @Autowired
    private EmployeeResource employeeResource;

    @GetMapping(produces = {"application/json"})
    public List<Company> list() {
        return (List<Company>) repository.findAll();
    }

    @PostMapping(produces = {"application/json"})
    public void add(@RequestBody Company company) {
//        employeeService.add(employee);
        company.getEmployees().forEach(e->e.setCompany(company));
        repository.save(company);
    }
}