package com.javareact.javareact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by gnargnor on 7/14/17.
 */
@Component
public class DatabaseLoader implements CommandLineRunner {

    private final EmployeeRepository repository;

    @Autowired


    /** public constructor injects EmployeeRepository with autowired */
    public DatabaseLoader(EmployeeRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.repository.save(new Employee("Frodo", "Baggins", "ring bearer"));
    }
}
