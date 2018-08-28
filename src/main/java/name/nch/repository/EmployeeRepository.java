package name.nch.repository;

import name.nch.model.Employee;

import java.util.Collection;
import java.util.Map;

public class EmployeeRepository {

    private Map<String, Employee> employeeMap;

    public EmployeeRepository(Map<String, Employee> employeeMap) {

        this.employeeMap = employeeMap;
    }

    public Collection<Employee> getAllEmployees() {

        return employeeMap.values();
    }
}
