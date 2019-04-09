package learnerLab;

public class Student extends Person implements ILearner{

    private double totalStudyTime;
    //constructor
    public Student(String name, final long id, double totalStudyTime){
        super(name, id);
        this.totalStudyTime = totalStudyTime;
    }

    //methods
    public void learn(double numberOfHours){
        double study = numberOfHours + totalStudyTime;
        System.out.println(study);
    }
    public double getTotalStudyTime() {
        return totalStudyTime;
    }
    //getters and setters
    public void setTotalStudyTime(double totalStudyTime) {
        this.totalStudyTime = totalStudyTime;
    }
}
