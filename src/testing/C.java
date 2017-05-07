package testing;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class C 
{
    @Test
	public void T1()
	{
		Reporter.log("New 1", true);
	}
}
