package lockerpuzzlegame.school;

import lockerpuzzlegame.locker.Locker;
import lockerpuzzlegame.student.Student;

public class School {
    private Locker[] locker;
    private Student[] student;


    public School(){
      locker = new Locker[0];
      student = new Student[]{new Student()};
    }

    public void setLocker(Locker[] locker) {
        this.locker = locker;
    }

    public Locker[] getLocker() {
        return locker;
    }
}
