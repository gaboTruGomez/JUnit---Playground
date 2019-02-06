package main_package;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Main {

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(TestSuite.class);
		//System.out.println("Results failures: " + result.getFailureCount());
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
	}

}
