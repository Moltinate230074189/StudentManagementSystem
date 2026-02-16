package StudentManagement;

public class GraduateStudent extends Student{

    private final boolean researchAssistant;
    private final double stipend;

    private GraduateStudent(Builder builder) {
        this.studentID = builder.studentID;
        this.name = builder.name;
        this.email = builder.email;
        this.department = builder.department;
        this.researchAssistant = builder.researchAssistant;
        this.stipend = builder.stipend;
    }

    @Override
    public double calculateTuition() {
        double baseFee = 50000;

        if(researchAssistant) {
            return baseFee - stipend;
        }
        return baseFee;
    }

    @Override
    public String getStudentType() {
        return "Graduate Student";
    }

    @Override
    public void displayStudentDetails() {
        super.displayStudentDetails();
        System.out.println("Research Assistant: " + researchAssistant);
        System.out.println("Stipend: R" + stipend);
        System.out.println("Total Tuition: R" + calculateTuition());
        System.out.println("-------------------------------------");
    }

    public static class Builder {

        private final String studentID;
        private final String name;
        private String email;
        private String department;
        private boolean researchAssistant;
        private double stipend;

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

        public Builder researchAssistant(boolean researchAssistant) {
            this.researchAssistant = researchAssistant;
            return this;
        }

        public Builder stipend(double stipend) {
            this.stipend = stipend;
            return this;
        }

        public GraduateStudent build() {
            return new GraduateStudent(this);
        }
    }
}


