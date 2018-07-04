package parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameters {

    @Test
    @Parameters({"name","age","sure"})
    public void te(String name,int age,int sw){
        System.out.println("name is :"+name+" age is:"+age);
    }
}