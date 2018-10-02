import java.util.List;

public class Company {

  private String nombre;
  private String descripcion;
  private List<Employee> employees;

  public Company(String nombre, String descripcion) {
    this.nombre = nombre;
    this.descripcion = descripcion;
  }

  public void addEmployee(Employee e){
    this.employees.add(e);
  }

  public List<Employee> getEmployees(){
    return this.employees;
  }

}
