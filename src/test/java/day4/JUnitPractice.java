package day4;

import org.junit.jupiter.api.*;

public class JUnitPractice {
        @BeforeAll
        public static void setUp(){
            System.out.println("@BeforeAll is running");
        }
        @BeforeEach
        public void beforeEachMethod(){
            System.out.println("@BeforeEach is running");
        }
        @AfterAll
        public static void afterAllMethod(){
            System.out.println("@AfterAll is running");
        }
    @AfterEach
    public  void afterEachMethod(){
        System.out.println("@AfterEach is running");
    }

        @Test
    public void test1(){
            Assertions.assertEquals(9,3+6);

        }
        @Test
    public void test2(){

        }



}
