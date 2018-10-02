import java.util.Date;

public class Employee {
  private String nombre;
  private String apellido;
  private Date cumple;
  private double salario;
  private String companyName;

  public Employee(String nombre, String apellido, Date cumple, double salario, String companyName) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.cumple = cumple;
    this.salario = salario;
    this.companyName = companyName;
  }

  public String getNombre() {
    return nombre;
  }

  public double getSalario() {
    return salario;
  }

}
