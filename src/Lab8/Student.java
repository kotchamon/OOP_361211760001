package Lab8;

public class Student extends Person {

    private String stdID;
    private String program;

    public Student(String id, String name,
                    String stdID,String program){
        super(id, name);
        this.stdID = stdID;
        this.program = program;
    }
    //getter and setter

    public String getStdID() {
        return stdID;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }
    //toString

    @Override
    public String toString() {
        return "Student{" +
                "stdID='" + stdID + '\'' +
                ", program='" + program + '\'' +
                '}';
    }
}
