package StudentManagement;

public abstract class Student {

    protected String studentID;
    protected String name;
    protected String email;
    protected String department;

    public abstract double calculateTuition();

    public abstract String getStudentType();

    public void displayStudentDetails(){
        System.out.println("Student Type: " + getStudentType());
        System.out.println("ID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Department: " + department);
    }
}
