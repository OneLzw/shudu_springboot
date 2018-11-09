package com.easy.dever;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShuduSpringbootApplicationTests {

    @Before
    public void beforeTest () {
        System.out.println("beforeTest is success");
    }

    @Test
    public void contextLoads() {
        System.out.println("ShuduSpringbootApplicationTests is success");
    }

}
