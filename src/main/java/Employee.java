public class Employee {

  private String name;
  private int age;
  private int ID;
  private double payRate;

  public Employee(String name, int age, int ID, double payRate) {
    name = name;
    age = age;
    ID = ID;
    payRate = payRate;
  }
  
  public String getName() {
    return name;
  }
  public int getAge() {
    return age;
  }
  public int getID() {
    return ID;
  }
  public double getPayRate() {
    return payRate;
  }

  
  
}