package Assignment8.sis;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Students {
    private Student[] students = new Student[10];
    int count=0;

    public  void add(Student student){
        students[count] = student;
        count++;
    }
    public Student search(String ID){
        for(int i=0;i<students.length;i++){
            Student s=students[i];
            if(s==null) continue;;
            if(s.getID().equals(ID)) return s;
        }
        return null;

    }
    public int getStudentCount(){
        return count;
    }
    public List<Student> getStudents(){
        return Arrays.asList(students);
    }
}
