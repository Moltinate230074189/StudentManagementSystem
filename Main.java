package StudentManagement;

public class Main {

    public static void main(String[] args) {

        UndergraduateStudent undergrad = new UndergraduateStudent.Builder("2300", "Molly Smith")
                .email("molly@gmail.com")
                .department("Information Technology")
                .creditHours(14)
                .scholarshipAmount(10000)
                .build();

        GraduateStudent grad = new GraduateStudent.Builder("2400", "Reign More")
                .email("reign@gmail.com")
                .department("Computer Science")
                .researchAssistant(true)
                .stipend(8500)
                .build();

        undergrad.displayStudentDetails();
        grad.displayStudentDetails();
    }
}
