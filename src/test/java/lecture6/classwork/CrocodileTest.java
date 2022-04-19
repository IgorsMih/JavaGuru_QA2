package lecture6.classwork;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CrocodileTest {

//    Crocodile crocodile = new Crocodile();
    AnotherLombokCrocodile crocodile = new AnotherLombokCrocodile();

    public void printAll() {
//        Get all information from movies
        System.out.println("Crocodile Color = " + crocodile.getColor());
        System.out.println("Crocodile Name = " + crocodile.getName());
        System.out.println("Crocodile Length = " + crocodile.getLength());
        System.out.println("Crocodile Size = " + crocodile.getSize());
        System.out.println("Crocodile Hungry = " + crocodile.isHungry());
    }

    @Before
    public void setUp() {
        printAll();
        crocodile.setColor("Green");
        crocodile.setName("Gena");
        crocodile.setLength(200);
        crocodile.setSize(2500);
        crocodile.setHungry(true);
    }

    @After
    public void tearDown() {
        crocodile = null;
    }

    @Test
    public void firstTest() {
        printAll();
        assertThat(crocodile.getColor()).isEqualTo("Green");
        assertThat(crocodile.getName()).isEqualTo("Gena");
        assertThat(crocodile.getLength()).isEqualTo(200);
        assertThat(crocodile.getSize()).isEqualTo(2500);
        assertThat(crocodile.isHungry()).isEqualTo(true);
        assertThat(crocodile.isHungry()).isTrue();
    }

}