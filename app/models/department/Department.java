package models.department;

import models.users.Employee;
import models.users.Manager;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

// Product entity managed by Ebean
@Entity
public class Department extends Model {

   // Fields
   // Annotate id as primary key
   @Id
   private Long depId;

   @Constraints.Required
   private String name;

   // One Department contains many employees
   @OneToMany
   private List<Employee> empList = new ArrayList<>();

   @OneToOne(cascade = CascadeType.PERSIST)
   private Manager manager;

   // Default constructor
   public  Department() {
   }
			    
   public  Department(Long depId, String name, List<Employee> empList, Manager manager) {
      this.depId = depId;
      this.name = name;
      this.empList = empList;
      this.manager = manager;
   }

   public Long getId() {
    return depId;
}

public void setId(Long depId) {
    this.depId = depId;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public List<Employee> getEmployees() {
    return empList;
}

public void setEmployees (List<Employee> empList) {
    this.empList = empList;
}

public Manager getManager(){
    return this.manager;
}

public void setManager(Manager manager){
    this.manager = manager;
}


   //Generic query helper for entity Computer with id Long
public static Finder<Long,Department> find = new Finder<Long,Department>(Department.class);

//Find all Departments in the database
public static List<Department> findAll() {
   return Department.find.query().where().orderBy("name asc").findList();
}

public static Map<String,String> options() {
    LinkedHashMap<String,String> options = new LinkedHashMap();
 
    // Get all the categories from the database and add them to the options hash map
    for (Department d: Department.findAll()) {
       options.put(d.getId().toString(), d.getName());
    }
    return options;
 }


//This method checks whether an employee is in a specific Department
 public static boolean inDepartment(Long department, Long employee) {
    return find.query().where().eq("empList.id", employee)
                       .eq("depId", department)
                       .findList().size() > 0;
}
}