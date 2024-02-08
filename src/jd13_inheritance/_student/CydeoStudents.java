package jd13_inheritance._student;

public class CydeoStudents extends Student1 {
    private int batchNumber, groupNumber;
    private String programingLanguage;

    public CydeoStudents(String name, int age, String gender, String studentId, String fieldOfStudy, char grade, String schoolName,
                         int batchNumber, int groupNumber, String programingLanguage) {
        super(name, age, gender, studentId, fieldOfStudy, grade, schoolName);
        setBatchNumber(batchNumber);
        setGroupNumber(groupNumber);
        setProgramingLanguage(programingLanguage);
    }

    public int getBatchNumber() {
        return batchNumber;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public String getProgramingLanguage() {
        return programingLanguage;
    }

    public void setBatchNumber(int batchNumber) {
        if (batchNumber < 1) {
            System.err.println("Batch number can't be negative or 0");
            System.exit(1);
        }
        this.batchNumber = batchNumber;
    }

    public void setGroupNumber(int groupNumber) {
        if (groupNumber < 1) {
            System.err.println("Group number can't be negative or 0");
            System.exit(1);
        }
        this.groupNumber = groupNumber;
    }

    public void setProgramingLanguage(String programingLanguage) {
        if (programingLanguage.isBlank() || programingLanguage.isEmpty() || programingLanguage == null) {
            System.err.println("Programing language can't be null, blank or empty");
            System.exit(1);
        }
        this.programingLanguage = programingLanguage;
    }
    public void study() {
        System.out.println(super.getName() + " from batch " + batchNumber + " group " +
             groupNumber + " graduated at " + super.getSchoolName());
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", programingLanguage='" + programingLanguage + '\'' +
                '}';
    }
}
/*
CydeoStudent:
       - Additional Attributes:
           - batchNumber: int
           - groupNumber: int
           - programmingLanguage: String
       - Encapsulation:
           - Same as previous tasks.
       - Constructor:
           - Same as previous tasks.
       - Actions:
           - Override the study method.
           - Override the toString method.
 */
