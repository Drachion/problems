package models.project;

import models.users.Employee;
import models.users.Manager;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

// Product entity managed by Ebean
@Entity
public class Project extends Model {

   // Fields
   // Annotate id as primary key
   @Id
   private Long id;

   @Constraints.Required
   private String name;


    @Constraints.Required
    @Temporal(TemporalType.DATE)
    private Date startDate;

    @Constraints.Required
    @Temporal(TemporalType.DATE)
    private Date endDate;

    // Many projects can have the same manager
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Manager manager;



   // Project contains many employees
   @ManyToMany(cascade=CascadeType.ALL, mappedBy="projects")
   @JoinTable(name="employee_project")
   private List<Employee> empList;

   // Default constructor
   public  Project() {
   }
			    
   public  Project(Long id, String name, List<Employee> empList, Date startDate, Date endDate, Manager manager) {
      this.id = id;
      this.name = name;
      this.empList = empList;
      this.startDate = startDate;
      this.endDate = endDate;
      this.manager = manager;
   }

   public Long getId() {
    return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Date getStartDate(){
        return startDate;
    }

    public void setStartDate(Date startDate){
        this.startDate = startDate;
    }

    public Date getEndDate(){
        return endDate;
    }

    public void setEndDate(Date endDate){
        this.endDate = endDate;
    }

    public Manager getManager(){
        return manager;
    }

    public void setManager(Manager manager){
        this.manager = manager;
    }

    

   //Generic query helper for entity Computer with id Long
public static Finder<Long,Project> find = new Finder<Long,Project>(Project.class);

//Find all Products in the database
public static List<Project> findAll() {
   return Project.find.query().where().orderBy("name asc").findList();
}

public static Map<String,String> options() {
    LinkedHashMap<String,String> options = new LinkedHashMap();
 
    // Get all the categories from the database and add them to the options hash map
    for (Project proj: Project.findAll()) {
       options.put(proj.getId().toString(), proj.getName());
    }
    return options;
 }

 
 public static boolean inProject(Long project, Long employee) {
    return find.query().where().eq("empList.id", employee)
                       .eq("id", project)
                       .findList().size() > 0;
}
}