package com.tw.apistackbase.core;

import javax.persistence.*;
import java.util.List;

@Entity
public class Company {
    private String name;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;


    @OneToMany(cascade = CascadeType.ALL,mappedBy = "company")
    private List <Employee> employees;

    public Company() {}

    public Company(String name, List<Employee> employees) {
        this.name = name;
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }


}
