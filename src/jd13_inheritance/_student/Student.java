package jd13_inheritance._student;

public class Student {
    private String name;
    private int age;
    private String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty() || name.isBlank() || name == null){
            System.err.println("name can't be empty, null or blank");
            System.exit(1);
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<0){
            System.err.println("age can't be neggative");
            System.exit(1);
        }
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (gender.isEmpty() || gender.isBlank() || gender == null) {
            System.err.println("gender can't be empty, null or blank");
            System.exit(1);
        }
        this.gender = gender;
    }

    public Student(String name, int age, String gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'';
    }
}
/*
Create a class named "Student" with the following specifications:
   Attributes:
       - name: String
       - age: int
       - gender: String

   Encapsulation:
       - Same as previous tasks.

   Constructor:
       - Same as previous tasks.

   Actions:
       - toString(): Prints the information of the Student object
 */
