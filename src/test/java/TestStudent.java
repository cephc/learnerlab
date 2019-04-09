import learnerLab.ILearner;
import learnerLab.Person;
import learnerLab.Student;
import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplementation(){
        //given
        Student student = new Student("chaychay", 90875L,20);
        String response = "";
        //when
        if(student instanceof ILearner){
            response = response + "true";
            System.out.println(response);
        }else{
            response = response + "false";
            System.out.println(response);
        }
    }
    @Test
    public void testInheritance(){
        //given
        Student student = new Student("chatyra", 54321L, 15);
        String response = "";
        //when
        if(student instanceof Person){
            response = response + "true";
            System.out.println(response);
        }else{
            response = response + "false";
            System.out.println(response);
        }
    }
    @Test
    public void testLearner(){
        //given
        Student student = new Student("Taylor", 456789L, 10.0);
        Double expected = 10.0;
        //when
        student.learn(10.0);
        Double actual = student.getTotalStudyTime();

        //then
        Assert.assertEquals(expected, actual, 0.01);
    }
}
