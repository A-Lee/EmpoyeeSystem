import Humans.Employee;

import java.util.ArrayList;

public class EmployeeList
{
    private ArrayList<Employee> employees = new ArrayList<>();

    public EmployeeList()
    {

    }
    public void addEmployee(Employee employee)
    {
        if(employee == null)
        {
            System.out.println("Invalid employee object. Object is null");
        }
        else if(exist(employee))
        {
            System.out.println("Employee already exist in the list!");
        }
        else
        {
            employees.add(employee);
        }
    }
    public boolean exist(Employee employee)
    {
        boolean exist = false;
        for(Employee e : employees)
        {
            if(e.getFirstName().equalsIgnoreCase(employee.getFirstName()) && e.getLastName().equalsIgnoreCase(employee.getLastName()))
            {
                exist = true;
                break;
            }
        }
        return exist;
    }
    public boolean exist(String firstName, String lastName)
    {
        if(firstName.isEmpty() || lastName.isEmpty() || firstName == null || lastName == null)
        {
            System.out.println("Invalid first/last name");
            return false;
        }
        else
        {
            boolean exist = false;
            for(Employee e : employees)
            {
                if(e.getFirstName().equalsIgnoreCase(firstName) && e.getLastName().equalsIgnoreCase(lastName))
                {
                    exist = true;
                    break;
                }
            }
            return exist;
        }
    }
    public Employee getEmployee(int index)
    {
        if(!validIndex(index))
        {
            return null;
        }
        else
        {
            return employees.get(index);
        }
    }
    public Employee getEmployee(String firstName, String lastName)
    {
        if(firstName.isEmpty() || lastName.isEmpty() || firstName == null || lastName == null)
        {
            System.out.println("Invalid first/last name");
            return null;
        }
        else
        {
            Employee returnEmployee = null;
            for(Employee e : employees)
            {
                if(e.getFirstName().equalsIgnoreCase(firstName) && e.getLastName().equalsIgnoreCase(lastName))
                {
                    returnEmployee = e;
                    return returnEmployee;
                }
            }
        }
        System.out.println("There is no employee in the list with that name");
        return null;
    }
    public void deleteEmployee(int index)
    {
        if(validIndex(index))
        {
            employees.remove(index);
            System.out.println("Employee has been removed from the list");
        }
    }
    public void deleteEmployee(String firstName, String lastName)
    {
        if(firstName.isEmpty() || lastName.isEmpty() || firstName == null || lastName == null)
        {
            System.out.println("Invalid first/last name");
        }
        else
        {
            boolean removed = false;
            for(int i = 0; i < getSize(); i++)
            {
                if(employees.get(i).getFirstName().equalsIgnoreCase(firstName) && employees.get(i).getLastName().equalsIgnoreCase(lastName))
                {
                    employees.remove(i);
                    removed = true;
                    break;
                }
            }
            if(removed)
            {
                System.out.println("Employee has been removed from the list");
            }
            else
            {
                System.out.println("There is no employee in the list with that name");
            }
        }
    }
    public boolean validIndex(int index)
    {
        if(index < 0 || index > getSize())
        {
            System.out.println("Invalid index given");
            return false;
        }
        return true;
    }
    public void changeEmployeeName(String firstName, String lastName, String newFirstName, String newLastName)
    {
        if(firstName.isEmpty() || lastName.isEmpty() || newFirstName.isEmpty() || newLastName.isEmpty() ||
                firstName == null || lastName == null || newFirstName == null || newLastName == null)
        {
            System.out.println("Invalid names/new names given.");
        }
        else
        {
            if(exist(newFirstName,newLastName))
            {
                System.out.println("Employee with that name already exists in the list!");
            }
            else
            {
                getEmployee(firstName,lastName).ChangeNameOfEmployee(newFirstName,newLastName);
                System.out.println("The name has been changed!");
            }
        }
    }
    public int getSize()
    {
        return employees.size();
    }
}
