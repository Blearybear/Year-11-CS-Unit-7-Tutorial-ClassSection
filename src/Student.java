public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private int yearLevel;
    private static int studentCount = 0;
    //class specific attribute instead of object specific
    public Student(String firstName, String lastName, int age, int yearLevel){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.yearLevel = yearLevel;
        studentCount++;
        this.id = studentCount;
    }
    public int getId(){
        return this.id;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getYearLevel(){
        return this.yearLevel;
    }
    public void setYearLevel(int yearLevel){
        this.yearLevel = yearLevel;
    }
    public int getStudentCount(){
        return studentCount;
    }
    public boolean equals(Student other){
        if (this.firstName.equals(other.getFirstName()) && this.lastName.equals(other.getLastName()) && this.age == other.getAge() && this.yearLevel == other.yearLevel){
            return true;
        }
        return false;
    }
    public String toString(){
        return "Student{id=" + this.id + ", firstName=\'" + this.firstName + "\', lastName=\'" + this.lastName + "\', age=" + this.age + ", yearLevel=" + this.yearLevel + "}";
    }
}
