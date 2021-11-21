package aop;
public class Student {
    private String nameSureName;
    private int course;
    private double avgGrade;
    public Student(String nameSureName, int course, double avgGrade) {
        this.nameSureName = nameSureName;
        this.course = course;
        this.avgGrade = avgGrade;
    }
    public String getNameSureName() {
        return nameSureName;
    }
    public void setNameSureName(String nameSureName) {
        this.nameSureName = nameSureName;
    }
    public int getCourse() {
        return course;
    }
    public void setCourse(int course) {
        this.course = course;
    }
    public double getAvgGrade() {
        return avgGrade;
    }
    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }
    @Override
    public String toString() {
        return "[" + nameSureName + " " + course + " " + avgGrade + "]";
    }
}
