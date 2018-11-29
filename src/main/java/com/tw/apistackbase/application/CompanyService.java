package com.tw.apistackbase.application;

import com.tw.apistackbase.core.Company;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@Service
public class CompanyService {

    private static List<Company> companies = new LinkedList<>(Arrays.asList());
    public List<Company> list() {
        return companies;
    }

    public void add(Company company) {

        companies.add(company);
    }
}
