package Humans;

public class Employee extends Person
{
    private int employeeID;
    private String position;
    public Employee(String firstName, String lastName, String adress, int age, int phoneNumber, int employeeID, String position)
    {
        super(firstName,lastName,adress,age,phoneNumber);
        this.employeeID = employeeID;
        this.position = position;
    }
    public String getFullInfo()
    {
        return super.getAllInfo() + "\nPosition: " + getPosition() + "\nEmployeeID: " + getEmployeeID();
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getPosition() {
        return position;
    }
}
