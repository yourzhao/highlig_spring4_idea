import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JunitTest {

    @BeforeAll
     static void init(){
        System.out.println("测试即将开始！！");
    }

    @AfterAll
    static void fish(){
        System.out.println("测试完成咯！！");
    }

    @Test
    public void junitTest(){
        assertEquals(2, 1 + 1);

    }


    @Test
    public void testdemo(){
        String abc = "ABC";
        assertEquals("ABC", abc);
        assertEquals(5, 1+4);


    }
}
