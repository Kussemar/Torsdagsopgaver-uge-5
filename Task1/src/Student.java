import java.util.ArrayList;

public class Student {
    private String name;
   private ArrayList<Course> skoleFag = new ArrayList<>();

    //Constructor
    public Student(String name){
        this.name = name;
    }

    //Metode using addCourse and take a Course object as a parameter and add it to the student arraylist.
   public void addCourse(Course fag){
    skoleFag.add(fag); //Her tilføjer vi det til ArrayListen.
   }
@Override
public String toString(){
    return "Student " + name + " Fag " + skoleFag;
    }
}
