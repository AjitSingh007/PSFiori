package testing;


import org.testng.Reporter;
import org.testng.annotations.Test;

public class A 
{
	@Test
	public void test1()
	{
	Reporter.log("Hi",true);
	System.out.println("Hellow");
	}

}
