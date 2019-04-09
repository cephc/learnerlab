import learnerLab.*;
import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {
    @Test
    public void testInheritance() {
        //given
        Instructor instructor = new Instructor("chaychay", 90875L);
        String response = "";
        //when
        if (instructor instanceof Person) {
            response = response + "true";
            System.out.println(response);
        } else {
            response = response + "false";
            System.out.println(response);
        }
    }

    @Test
    public void testImplementation() {
        //given
        Instructor instructor = new Instructor("Taylor", 813574L);
        String response = "";
        //when
        if (instructor instanceof ITeacher) {
            response = response + "true";
            System.out.println(response);
        } else {
            response = response + "false";
            System.out.println(response);
        }
    }
    @Test
    public void testTeach() {
        //given
        Instructor instructor = new Instructor("malachi", 45678743L);
        Instructor instructorTwo = new Instructor("tay", 74826342L);
        Instructor[] students = {instructor, instructorTwo};
        Double expected = 8.0;

        //when
        instructor.teach(students[], 20.0);
        Double actual = instructor.;

        //then
        Assert.assertEquals(expected, actual);
   }
    @Test
    public void testLecture(){
        //given
        Student student = new Student("holly", 123456L, 8.0);
        Student[] students = {student};
        student.setTotalStudyTime(9.0);

    }
}


