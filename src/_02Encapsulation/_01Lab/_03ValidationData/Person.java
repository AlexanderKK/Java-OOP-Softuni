package _02Encapsulation._01Lab._03ValidationData;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setSalary(salary);
    }

    public void setFirstName(String firstName) {
        validatePersonName(firstName, "First");

        this.firstName = firstName;
    }

    private static void validatePersonName(String firstName, String prefix) {
        if(firstName.length() < 3) {
            throw new IllegalStateException(prefix + " name cannot be less than 3 symbols");
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        validatePersonName(lastName, "Last");

        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAge(int age) {
        if(age <= 0) {
            throw new IllegalStateException("Age cannot be zero or negative integer");
        }

        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setSalary(double salary) {
        if(salary < 460) {
            throw new IllegalStateException("Salary cannot be less than 460 leva");
        }

        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void increaseSalary(double bonus) {
        double bonusReduced = age < 30 ? bonus / 2 : bonus;

        double factor = 1.00 + bonusReduced / 100;

        setSalary(salary * factor);
    }

    @Override
    public String toString() {
        return String.format("%s %s gets %.1f leva", firstName, lastName, salary);
    }
}
