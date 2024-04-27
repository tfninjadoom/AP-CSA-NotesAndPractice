public class Employee {

  private String name;
  private int age;
  private int ID;
  private double payRate;

  public Employee(String name, int age, int ID, double payRate) {
    this.name = name;
    this.age = age;
    this.ID = ID;
    this.payRate = payRate;
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