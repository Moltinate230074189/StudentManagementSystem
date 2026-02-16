package StudentManagement;

public class UndergraduateStudent extends Student {
    private final int creditHours;
    private final double scholarshipAmount;

    private UndergraduateStudent(Builder builder) {
        this.studentID = builder.studentID;
        this.name = builder.name;
        this.email = builder.email;
        this.department = builder.department;
        this.creditHours = builder.creditHours;
        this.scholarshipAmount = builder.scholarshipAmount;
    }
    @Override
    public double calculateTuition() {
        double costPerCredit = 1500;
        return (creditHours * costPerCredit) - scholarshipAmount;
}

@Override
public String getStudentType() {
    return "Undergraduate Student";
}
@Override
public void displayStudentDetails() {
    super.displayStudentDetails();
    System.out.println("Credit Hours: " + creditHours);
    System.out.println("Scholarship Amount: R" + scholarshipAmount);
    System.out.println("Total Tuition: R" + calculateTuition());
    System.out.println("-------------------------------------");
    }

    public static class Builder {

       private final String studentID;
       private final String name;
       private String email;
       private String department;

       private int creditHours;
       private double scholarshipAmount;
       public Builder(String studentID, String name) {
           this.studentID = studentID;
           this.name = name;
       }

       public Builder email(String email) {
           this.email = email;
           return this;
       }

       public Builder department(String department) {
           this.department = department;
           return this;
       }

       public Builder creditHours(int creditHours) {
           this.creditHours = creditHours;
           return this;
       }

       public Builder scholarshipAmount(double scholarshipAmount) {
           this.scholarshipAmount = scholarshipAmount;
           return this;
       }

       public UndergraduateStudent build() {
           return new UndergraduateStudent(this);
       }
    }
}