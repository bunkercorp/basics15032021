import org.testng.Assert;
import org.testng.annotations.*;

public class Smthg {


    @Test
    public static void first() {
        System.out.println("Smthg test1");
    }

    @Test
    public static void first2() {
        System.out.println("Smthg test2");
    }

    @Test
    public static void first3() {
        System.out.println("Smthg test3");
    }

    @Test
    public static void first4() {
        System.out.println("Smthg test4");
    }

    @BeforeMethod
    public static void beforeSmth() {
        System.out.println("Smthg before");
    }

    @AfterMethod
    public static void afterSmth() {
        System.out.println("Smthg after");
    }

    @BeforeClass
    public static void beforeSmthgC() {
        System.out.println("Smthg before class");
    }

    @AfterClass
    public static void afterSmthgC() {
        System.out.println("Smthg after class");
    }
}