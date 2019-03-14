package models.users;

import models.department.Department;
import models.project.Project;
import models.users.User;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;




@Table(name = "Employee")
// This is a Employee of type 'emp'
@DiscriminatorValue("employee")

// Customer inherits from the User class
@Entity
public class Employee extends User {


    @Constraints.Required
    private Long empId;

    @Constraints.Required
    private String jobRole;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="address_id")
    private Address address;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Project> projects = new ArrayList<>();

    //Many Employees can be in one department
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "dept")
    private Department dept;

    public Employee(){

    }
    
    
    public Employee(Long empId, String jobRole, Address address, Department dept, String email, String name, String role, String password, Date dateOfBirth){
        // Projects not included in constructor - as we want to be able to create employees without needing them to be assigned to a project right away
	    super(email, name, role, password, dateOfBirth);
        // role here (in context means role within system eg; admin, manager, normal employee) coming from User might cause confusion with jobRole
        // jobRole will be important if we want to look at some specific billing rates etc. for different job types eg - designers / developers / QA etc
        this.empId = empId;
        this.jobRole = jobRole;
        this.dept = dept;
    }

    // Bound to checkboxes to assign which projects an employee is on
    private List<Employee> projSelect = new ArrayList<Employee>();

    // public List<Project> getProjSelect() {
    //     return projSelect;
    // }
    // public void setProjSelect(List<Project> projectSelect) {
    //     this.projectSelect = projectSelect;
    // }

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }
    
    public String getJobRole() {
        return jobRole;
    }

    public void setjobRole(String jobRole) {
        this.jobRole = jobRole;
    }

    public Address getAddress(){
        return address;
    }
    public void setAddress(Address a){
        this.address = a;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public Department getDepartment() {
        return dept;
    }

    public void setDepartment(Department dept) {
        this.dept = dept;
    }


    


    public static final Finder<Long, Employee> find = new Finder<>(Employee.class);
			    
    public static final List<Employee> findAll() {
       return Employee.find.all();
    }


}