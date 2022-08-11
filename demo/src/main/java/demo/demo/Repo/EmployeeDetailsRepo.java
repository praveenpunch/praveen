package demo.demo.Repo;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import demo.demo.Entity.EmployeeDetails;

@Repository
public interface EmployeeDetailsRepo extends CrudRepository<EmployeeDetails,Integer> {

    EmployeeDetails findByEmployeeName (String employeeName); 
    List<EmployeeDetails> findByEmployeeId(String employeeId);
}
