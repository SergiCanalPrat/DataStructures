import java.util.*;

public class Main implements  CompanyManager{

  HashMap<Company, List<Employee>> companies;
  HashMap<String, Company> companies2; //???
  List<Employee> allEmployees;

  @Override
  public void addCompany(String companyName, String description) {
    Company company = new Company(companyName, description);
    companies2.put(companyName, company);
  }

  @Override
  public void addEmployee(String name, String surname, Date birthday, double salary, String companyName) throws MyException {
    Employee employee = new Employee(name, surname, birthday, salary, companyName);

    allEmployees.add(employee);
    companies2.get(companyName).addEmployee(employee);
    throw new MyException();
  }

  @Override
  public List<Employee> findAllEmployeesOrderedByName() {
    Collections.sort(allEmployees, new Comparator<Employee>() {
      @Override
      public int compare(Employee o1, Employee o2) {
        return new String(o1.getNombre().compareTo(new String(o2.getNombre()));
      }
    });
    //allEmployees.sort(Comparator.naturalOrder());

    return allEmployees;
  }

  @Override
  public List<Employee> findAllEmployeesOrderedBySalary() {
    Collections.sort(allEmployees, new Comparator<Employee>() {
      @Override
      public int compare(Employee o1, Employee o2) {
        return new Double(o1.getSalario().compareTo(new Double(o2.getSalario()));
      }
    });
  }

  @Override
  public List<Employee> employees(String company) {
    return null;
  }

  @Override
  public List<Company> findAllCompanies() {
    ArrayList<Company> allCompanies = new ArrayList<Company>(companies2.values());

    return allCompanies;
  }
}
