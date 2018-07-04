package dj;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class suiteConfig {

    @BeforeSuite
    public void loginConfig(){
        System.out.println("suite前配置");
    }

    @AfterSuite
    public void payConfig(){
        System.out.println("suite后配置");
    }

    @BeforeTest
    public void testt(){
        System.out.println("test前配置");
    }

    @AfterTest
    public void testtt(){
        System.out.println("test 后配置");
    }
}
