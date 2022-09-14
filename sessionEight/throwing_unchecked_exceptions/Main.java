import models.Employee;
import models.Store;

public class Main {

  public static void main(String[] args) throws IllegalAccessException {
    Employee stocker = new Employee("   ", null);
    Employee assisManager = new Employee("Nicholas", "     ");
    Employee manager = new Employee(null, "      ");

    Store store = new Store();
    store.setEmployees(0, stocker);
    store.setEmployees(1, assisManager);
    store.setEmployees(2, manager);
    System.out.println(store);
    store.open();
  }
}
