package learnerLab;

public class Main {
    public static void main(String[] args) {

        Person personOne = new Person("Chatyra", 1234567L);
        personOne.setName("tyra");

        Student studentOne = new Student("Taylor", 56789L, 10.0);
        studentOne.learn(5.0);
        System.out.println(studentOne.getTotalStudyTime());
        Student student = new Student("Chatyra", 47329448L, 20.0);
        Student studentTwo = new Student("Taylor", 33764291L, 4.0);
        Student studentThree = new Student("Tshay", 36184791L, 10.0);
        ILearner[] stud = {student, studentTwo, studentThree};











    }
}
