package testing;


import org.testng.Reporter;
import org.testng.annotations.Test;

public class B
{
    @Test
	public void test12()
	{
		Reporter.log("Man", true);
		System.out.println("Ya its working");
		Reporter.log("Man QWWWWW", true);
	}
}
