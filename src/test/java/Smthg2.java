import org.testng.annotations.*;

public class Smthg2 {

    @Test
    public static void first() {
        System.out.println("Smthg2 test1");
    }

    @Test
    public static void first2() {
        System.out.println("Smthg2 test2");
    }

    @Test
    public static void first3() {
        System.out.println("Smthg2 test3");
    }

    @Test
    public static void first4() {
        System.out.println("Smthg2 test4");
    }

    @BeforeMethod
    public static void beforeSmth() {
        System.out.println("Smthg2 before");
    }

    @AfterMethod
    public static void afterSmth() {
        System.out.println("Smthg2 after");
    }

    @BeforeClass
    public static void beforeSmthgC() {
        System.out.println("Smthg2 before class");
    }

    @AfterClass
    public static void afterSmthgC() {
        System.out.println("Smthg2 after class");
    }
}