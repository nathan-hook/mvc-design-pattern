package name.nch.web.controller;

import name.nch.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeesController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @RequestMapping(value = "/employee.html")
    public String viewEmployees(Model model) {

        model.addAttribute("employees", this.employeeRepository.getAllEmployees());

        return "employees";
    }
}
