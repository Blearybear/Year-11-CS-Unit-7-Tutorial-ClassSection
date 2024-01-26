import java.util.ArrayList;
public class ClassSection {
    private String subject;
    private int capacity;
    private int yearLevel;
    private ArrayList<Student> students;
    public ClassSection(String subject, int capacity, int yearLevel){
        this.subject = subject;
        this.capacity = capacity;
        this.yearLevel = yearLevel;
        this.students = new ArrayList<>();
    }
    public String getSubject(){
        return subject;
    }
    public void setSubject(String subject){
        this.subject = subject;
    }
    public int getCapacity(){
        return capacity;
    }
    public void setCapacity(int capacity){
        this.capacity = capacity;
    }
    public int getYearLevel(){
        return yearLevel;
    }
    public void setYearLevel(int yearLevel){
        this.yearLevel = yearLevel;
    }
    public ArrayList<Student> getStudents(){
        return this.students;
    }
    public void addStudent(Student student){
        if (!this.isStudentEnrolled(student) && student.getYearLevel() == this.yearLevel){
            this.students.add(student);
        }
    }
    public void removeStudent(Student student){
        this.students.remove(student);
    }
    public boolean isStudentEnrolled(Student student){
        for (int i = 0;i < this.students.size();i++){
            if (student.equals(this.students.get(i))){
                return true;
            }
        }
        return false;
    }
    public String toString(){
        return "ClassSection{subject=\'" + subject + "\', capacity=" + capacity + ", yearLevel=" + yearLevel + ", students=" + students + "}";
    }
}
