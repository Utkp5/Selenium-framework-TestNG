package Day2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependent_method {   //means one method is dependent on other if one method is not executed then the other method will also not going to be execute if it is depent on not executed method

	@Test(priority=1)
	void openapp()
	{
		Assert.assertTrue(true);
	}
	
	@Test(priority=2, dependsOnMethods= {"openapp"})
	void login()
	{
		Assert.assertTrue(true);
	}
	
	@Test(priority=3, dependsOnMethods= {"login"})
	void search()
	{
		Assert.assertTrue(false);
	}
	
	@Test(priority=4, dependsOnMethods= {"login","search"})
	void advsearch()
	{
		Assert.assertTrue(true);
	}
	
	@Test(priority=5, dependsOnMethods= {"login"})
	void logout()
	{
		Assert.assertTrue(true);
	}
	
}
