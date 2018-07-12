package Humans;

public class Person
{
    private String firstName, lastName, adress;
    private int age, phoneNumber;

    public Person(String firstName, String lastName, String adress, int age, int phoneNumber)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.adress = adress;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAdress() {
        return adress;
    }

    public int getAge() {
        return age;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }
    public String getAllInfo()
    {
        return "First name: " + getFirstName() + "\nLast name: " + getLastName() + "\nAge: " + getAge() + "\nAdress: " + getAdress() +
            "\nPhone number: " + getPhoneNumber();
    }
}
