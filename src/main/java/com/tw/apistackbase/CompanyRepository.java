package com.tw.apistackbase;

import com.tw.apistackbase.core.Company;
import com.tw.apistackbase.core.Employee;
import org.springframework.data.repository.CrudRepository;



public interface CompanyRepository extends CrudRepository<Company, Long> {

//    List<Employee> getName(String name);
}