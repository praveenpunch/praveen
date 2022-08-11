package demo.demo.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.demo.Entity.EmployeeDetails;
import demo.demo.Repo.EmployeeDetailsRepo;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping(path = "/employee_id")
@CrossOrigin(origins = "*")
public class EmployeeDetailsController {

    @Autowired
    EmployeeDetailsRepo employeeDetailsRepo;

    @GetMapping("/all")
    public Iterable<EmployeeDetails> getAll() {
        return employeeDetailsRepo.findAll();
    }

    @PostMapping(value="/fetchByEmpId")
    public List<EmployeeDetails> getMethodName(@RequestBody String employeeId) {
        return employeeDetailsRepo.findByEmployeeId(employeeId);
    }
    
}