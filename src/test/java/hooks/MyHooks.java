package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import stepDefination.Base;

public class MyHooks extends Base {
	
	
	@Before
	public void setup(){
		System.out.println("Launch Application");
	}
	
	@After
	public void tearDown() {
		System.out.println("close the browser");
	}

}
