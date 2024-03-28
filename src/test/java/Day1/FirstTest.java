package Day1;

import org.testng.annotations.Test;

public class FirstTest {

	@Test(priority = 1)   //here if we don't write @test then it won't run this method and priority means as u know run according to given priority 
	void openapp()
	{
		System.out.println("app has open!");
	}
	
	@Test(priority = 2)
	void login()
	{
		System.out.println("login successfully!");
	}
	
	@Test(priority = 3)
	void closeapp()
	{
		System.out.println("app has closed!");
	}
}
