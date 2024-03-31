package Day4;

import org.testng.annotations.Test;

public class InvocationCount {

	@Test(invocationCount = 10)  //here invocation means how any times it will run
	void test() {
		System.out.println("testing...");
	}

}
