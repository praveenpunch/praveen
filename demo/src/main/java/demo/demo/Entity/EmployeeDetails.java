package demo.demo.Entity;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
@Table(name = "employee_details")
public class EmployeeDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;
    @Column(name = "employeeID")
    public String employeeId;
    @Column(name = "emp_name")
    public String employeeName;
    @Column(name = "emp_city")
    public String employeeCity;
    @Column(name = "emp_role")
    public String employeeRole;

    public EmployeeDetails() {
        super();
    }

    public EmployeeDetails(Integer id,String employeeId, String employeeName, String employeeCity, String employeeRole) {
        super();
        this.id = id;
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeCity = employeeCity;
        this.employeeRole = employeeRole;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getemployeeId() {
        return employeeId;
    }

    public void setemployeeId(String employeeId) {
        this.employeeId = employeeId;
    }


    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeCity() {
        return employeeCity;
    }

    public void setEmployeeCity(String employeeCity) {
        this.employeeCity = employeeCity;
    }
    public String getEmployeeRole() {
        return employeeRole;
    }

    public void setEmployeeRole(String employeeRole) {
        this.employeeRole = employeeRole;
    }

	@Override
	public String toString() {
		return "EmployeeDetails [employeeId=" + employeeId + ",employeeName=" + employeeName + ", employeeCity=" + employeeCity + ", employeeRole =" + employeeRole +"]";
	}

    

}
