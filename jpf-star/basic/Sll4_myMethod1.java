package basic;

import common.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class Sll4_myMethod1 extends TestJPF {

	@Test
	public void test_myMethod1() throws Exception {
		Sll4.x = new Node_old();
		Node_old next_1 = null;
		Sll4.x.next = next_1;
		Sll4.myMethod();
	}

	@Test
	public void test_myMethod2() throws Exception {
		Sll4.x = null;
		Sll4.myMethod();
	}

	@Test
	public void test_myMethod3() throws Exception {
		Sll4.x = new Node_old();
		Node_old next_1 = new Node_old();
		Node_old next_2 = new Node_old();
		Node_old next_3 = null;
		Sll4.x.next = next_1;
		next_1.next = next_2;
		next_2.next = next_3;
		Sll4.myMethod();
	}

	@Test
	public void test_myMethod4() throws Exception {
		Sll4.x = new Node_old();
		Node_old next_1 = new Node_old();
		Node_old next_2 = null;
		Sll4.x.next = next_1;
		next_1.next = next_2;
		Sll4.myMethod();
	}

}

