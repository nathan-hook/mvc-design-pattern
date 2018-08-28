package name.nch;

import name.nch.configuration.EmployeeConfiguration;
import name.nch.model.Employee;
import name.nch.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Map;
import java.util.stream.Collectors;

/**
 * Based on Uncle Bob's Pay Roll Application use case from his book:  Agile Software Development - Principles, Patterns, and Practices
 * https://www.amazon.com/Software-Development-Principles-Patterns-Practices/dp/0135974445
 *
 * Based on the example application:
 * https://github.com/FreekPaans/PPPPayrollCaseStudy
 */

@SpringBootApplication
public class Application {

    @Autowired
    private EmployeeConfiguration employeeConfiguration;

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public EmployeeRepository createEmployeeRepository() {

        Map<String, Employee> employeeMap = employeeConfiguration.getEmployees().stream().collect(Collectors.toMap(Employee::getId, employee -> employee));

        return new EmployeeRepository(employeeMap);
    }
}
