import learnerLab.Person;
import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    @Test
    public void constructorTest(){
        //given
        Person person = new Person("Chatyra", 1234567L);
        String expected = "Chatyra" + " " + 1234567L;
        //when
        String actual = person.getName() + " " + person.getId();
        //then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void setterTest(){
        //given
        Person person = new Person("chatyra", 7654321L);
        String expected = "tyra";
        //when
        person.setName("tyra");
        String actual = person.getName();
        //then
        Assert.assertEquals(expected, actual);

    }

}
