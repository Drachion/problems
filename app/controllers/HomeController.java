package controllers;

import play.mvc.*;

import views.html.*;

import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import models.*;
import models.users.*;
import models.project.*;
import models.department.*;

import play.mvc.Http.*;
import play.mvc.Http.MultipartFormData.FilePart;
import java.io.File;

import java.io.IOException;
import java.awt.image.*;
import javax.imageio.*;
import org.imgscalr.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    private FormFactory formFactory;
    private Environment e;

    @Inject
    public HomeController(FormFactory f,Environment env) {
        this.formFactory = f;
        this.e = env;
}
    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    
    //  public Result onsale(Long cat) {
    //     List<ItemOnSale> itemList = null;
    //     List<Category> categoryList = Category.findAll();

    //     if(cat ==0){
    //         itemList = ItemOnSale.findAll();
    //     }else {
    //         itemList = Category.find.ref(cat).getItems();
    //     }
    //     return ok(onsale.render(itemList, categoryList,User.getUserById(session().get("email")),e));

    //  }

     
     //Project LISTING PAGE handler (based off ItemOnSale logic) to display a list of projects and employees on them
     public Result projects(Long proj) {
        List<Employee> empList = null;
        List<Project> projectList = Project.findAll();

        if(proj == 0){
            empList = Employee.findAll();
        }else {
            empList = Project.find.ref(proj).getEmployees();
        }
        return ok(projects.render(empList, projectList,User.getUserById(session().get("email")),e));
        //WHAT IS THE 'e' at the end here .... ?

     }


     //Method to render Employees page
     public Result employees(){
        
        List<Employee> empList = null;
        empList = Employee.findAll();
        
        return ok(employees.render(empList, User.getUserById(session().get("email"))));
     }


    public Result index() {
        return ok(index.render(User.getUserById(session().get("email"))));
    }

    public Result about() {
        return ok(about.render(User.getUserById(session().get("email"))));
    }


//     @Security.Authenticated(Secured.class)
//     public Result addItem() {
//         Form<ItemOnSale> itemForm = formFactory.form(ItemOnSale.class);
//         return ok(addItem.render(itemForm,User.getUserById(session().get("email"))));
// }


    @Security.Authenticated(Secured.class)
    public Result addEmployee() {
        Form<Employee> empForm = formFactory.form(Employee.class);
        Form<Address> addressForm = formFactory.form(Address.class);
        return ok(addEmployee.render(empForm, addressForm, User.getUserById(session().get("email"))));
    }



    public Result addEmployeeSubmit() {
        Form<Employee> newEmpForm = formFactory.form(Employee.class).bindFromRequest();
        Form<Address> newAddressForm = formFactory.form(Address.class).bindFromRequest();
            if (newEmpForm.hasErrors()) {
        
                return badRequest(addEmployee.render(newEmpForm,newAddressForm,User.getUserById(session().get("email"))));
            } else {
        
                Employee newEmp = newEmpForm.get();
                Address address = newAddressForm.get();
                newEmp.setAddress(address);
        
            if(User.getUserById(newEmp.getEmail())==null){
                newEmp.save();
            }else{
                newEmp.update();
            }
        flash("success", "Employee " + newEmp.getName() + " was added/updated.");
        return redirect(controllers.routes.HomeController.usersEmployees()); 
        }
    }


    @Security.Authenticated(Secured.class)
    @Transactional
    @With(AuthAdmin.class)
    public Result deleteEmployee(String email) {

    // The following line of code finds the item object by id, then calls the delete() method
    // on it to have it removed from the database.

        Employee e = (Employee) User.getUserById(email);
        e.delete();

        // Now write to the flash scope, as we did for the successful item creation.
        flash("success", "Employee has been deleted.");
        // And redirect to the onsale page
    return redirect(controllers.routes.HomeController.usersEmployees());
}




    @Security.Authenticated(Secured.class)
        public Result updateEmployee(String email) {
        Employee e = null;
        Address a = null;
        Form<Employee> empForm;
        Form<Address> addressForm;

    try {
        // Find the item by email
        e = (Employee) e.getUserById(email);
        e.update();

        a = e.getAddress();

        // Populate the form object with data from the user found in the database
        empForm = formFactory.form(Employee.class).fill(e);
        addressForm  = formFactory.form(Address.class).fill(a);
    } catch (Exception ex) {
        return badRequest("error" + ex.getMessage());
    }

    // Display the "add employee" page, to allow the user to update the item
    return ok(addEmployee.render(empForm,addressForm,User.getUserById(session().get("email"))));
}




    public Result usersManagers() {
        List<Manager> managerList = null;

        managerList = Manager.findAll();

        return ok(manager.render(managerList,User.getUserById(session().get("email"))));

    }





    // Referenced in the creation of Add CUSTOMER / Add EMPLOYEE in our case
    public Result usersEmployees() {
        List<Employee> empList = null;
        // List<Project> projList = null;

        empList = Employee.findAll();
        // projList = Project.findAll();

    //Return ok (customers. .... - so there was a page to display customers
    //in base project. Should we include a page to display employees - Aside
    //from listing them according to Projects...? Probably !!)
    return ok(employees.render(empList,User.getUserById(session().get("email"))));

 }



public String saveFileOld(Long id, FilePart<File> uploaded) {
    // Make sure that the file exists.
    if (uploaded != null) {
        // Make sure that the content is actually an image.
        String mimeType = uploaded.getContentType();
        if (mimeType.startsWith("image/")) {
            // Get the file name.
            String fileName = uploaded.getFilename();
            // Extract the extension from the file name.
            String extension = "";
            int i = fileName.lastIndexOf('.');
            if (i >= 0) {
                extension = fileName.substring(i + 1);
            }
            // Now we save the file (not that if the file is saved without
            // a path specified, it is saved to a default location,
            // usually the temp or tmp directory).
            // 1) Create a file object from the uploaded file part.
            File file = uploaded.getFile();
            // 2) Make sure that our destination directory exists and if 
            //    not create it.
            File dir = new File("public/images/productImages");
            if (!dir.exists()) {
                dir.mkdirs();
            }
            File newFile = new File("public/images/productImages/", id + "." + extension);
            if (file.renameTo(newFile)) {
                return "/ file uploaded.";
            } else {
                return "/ file upload failed.";
            }

        }
    }
    return "/ no image file.";
}

public String saveFile(Long id, FilePart<File> uploaded) {
    // Make sure that the file exists.
    if (uploaded != null) {
        // Make sure that the content is actually an image.
        String mimeType = uploaded.getContentType();
        if (mimeType.startsWith("image/")) {
            // Get the file name.
            String fileName = uploaded.getFilename();
            // Extract the extension from the file name.
            String extension = "";
            int i = fileName.lastIndexOf('.');
            if (i >= 0) {
                extension = fileName.substring(i + 1);
            }
            // Now we save the file (not that if the file is saved without
            // a path specified, it is saved to a default location,
            // usually the temp or tmp directory).
            // 1) Create a file object from the uploaded file part.
            File file = uploaded.getFile();
            // 2) Make sure that our destination directory exists and if 
            //    not create it.
            File dir = new File("public/images/productImages");
            if (!dir.exists()) {
                dir.mkdirs();
            }
            // 3) Actually save the file.
            File newFile = new File("public/images/productImages/", id + "." + extension);
            if (file.renameTo(newFile)) {
                try {
                    BufferedImage img = ImageIO.read(newFile); 
                    BufferedImage scaledImg = Scalr.resize(img, 90);
                    
                    if (ImageIO.write(scaledImg, extension, new File("public/images/productImages/", id + "thumb.jpg"))) {
                        return "/ file uploaded and thumbnail created.";
                    } else {
                        return "/ file uploaded but thumbnail creation failed.";
                    }
                } catch (IOException e) {
                    return "/ file uploaded but thumbnail creation failed.";
                }
            } else {
                return "/ file upload failed.";
            }

        }
    }
    return "/ no image file.";
}

// @Security.Authenticated(Secured.class)
// @Transactional
// @With(AuthAdmin.class)
// public Result deleteItem(Long id) {

//     // The following line of code finds the item object by id, then calls the delete() method
//     // on it to have it removed from the database.
//     ItemOnSale.find.ref(id).delete();

//     // Now write to the flash scope, as we did for the successful item creation.
//     flash("success", "Item has been deleted.");
//     // And redirect to the onsale page
//     return redirect(controllers.routes.HomeController.onsale(0));
// }




// @Security.Authenticated(Secured.class)
// public Result updateItem(Long id) {
//     ItemOnSale i;
//     Form<ItemOnSale> itemForm;

//     try {
//         // Find the item by id
//         i = ItemOnSale.find.byId(id);

//         // Populate the form object with data from the item found in the database
//         itemForm = formFactory.form(ItemOnSale.class).fill(i);
//     } catch (Exception ex) {
//         return badRequest("error");
//     }

//     // Display the "add item" page, to allow the user to update the item
//     return ok(addItem.render(itemForm,User.getUserById(session().get("email"))));
// }




    @Security.Authenticated(Secured.class)
    @Transactional
    @With(AuthAdmin.class)  
    public Result deleteManager(String email) {

    // The following line of code finds the item object by id, then calls the delete() method
    // on it to have it removed from the database.

    Manager m = (Manager) User.getUserById(email);
    m.delete();

    // Now write to the flash scope, as we did for the successful item creation.
    flash("success", "Manager has been deleted.");
    // And redirect to the onsale page
    return redirect(controllers.routes.HomeController.usersManagers());
    }




    @Security.Authenticated(Secured.class)
    public Result updateManager(String email) {
        Manager m = null;
        Address a = null;
        Form<Manager> managerForm;
        Form<Address> addressForm;

    try {
        // Find the item by email
        m = (Manager)User.getUserById(email);
        m.update();

        // Populate the form object with data from the user found in the database
        managerForm = formFactory.form(Manager.class).fill(m);
        addressForm = formFactory.form(Address.class).fill(a);
    } catch (Exception ex) {
        return badRequest("error " + ex.getMessage());
    }

    // Display the "add item" page, to allow the user to update the item
    return ok(addManager.render(managerForm, addressForm, User.getUserById(session().get("email"))));
    }



    @Security.Authenticated(Secured.class)
    public Result addManager() {
        Form<Manager> managerForm = formFactory.form(Manager.class);
        Form<Address> addressForm = formFactory.form(Address.class);
    return ok(addManager.render(managerForm, addressForm, User.getUserById(session().get("email"))));
    }



    @Security.Authenticated(Secured.class)
    @Transactional
    public Result addManagerSubmit() {
        Form<Manager> newManagerForm = formFactory.form(Manager.class).bindFromRequest();
        Form<Address> newAddressForm = formFactory.form(Address.class).bindFromRequest();    
        if (newManagerForm.hasErrors()) {
    
        return badRequest(addManager.render(newManagerForm, newAddressForm, User.getUserById(session().get("email"))));
            } else {
        Manager newManager = newManagerForm.get();
        System.out.println("Name: "+newManagerForm.field("name").getValue().get());
        System.out.println("Email: "+newManagerForm.field("email").getValue().get());
        System.out.println("Password: "+newManagerForm.field("password").getValue().get());
        System.out.println("Role: "+newManagerForm.field("role").getValue().get());


        if(Manager.getUserById(newManager.getEmail())==null){
            newManager.save();
        }else{
            newManager.update();
        }
        flash("success", "Manager " + newManager.getName() + " was added/updated.");
        return redirect(controllers.routes.HomeController.usersManagers()); 
    }
}



// @Security.Authenticated(Secured.class)
// public Result addCustomer() {
//     Form<Customer> cForm = formFactory.form(Customer.class);
//     Form<Address> aForm = formFactory.form(Address.class);
//     return ok(addCustomer.render(cForm,aForm,User.getUserById(session().get("email"))));
// }
// @Security.Authenticated(Secured.class)
// @Transactional








}
