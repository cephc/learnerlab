package learnerLab;

public class Instructor extends Person implements ITeacher{
    //constructor
    public Instructor(String name, long id){
        super(name, id);
    }
    //methods
    public void teach(ILearner learner, double numberOfHours){
        learner.learn(8.0);
    }
    public void lecture(ILearner[] learners, double numberOfHours){
        double numberOfHoursPerLearner = numberOfHours / learners.length;
        for(ILearner in : learners){
            in.learn(30);
        }
        System.out.println(numberOfHoursPerLearner);
    }
}
