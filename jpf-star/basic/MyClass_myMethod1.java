package basic;

import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class MyClass_myMethod1 extends TestJPF {

	@Test
	public void test_myMethod10() throws Exception {
		Node_old x = null;
		Node_old y = x;
		MyClass.myMethod(x);
	}

	@Test
	public void test_myMethod11() throws Exception {
		Node_old x = new Node_old();
		Node_old y = x;
		Node_old next_1 = null;
		x.next = next_1;
		MyClass.myMethod(x);
	}

	@Test
	public void test_myMethod12() throws Exception {
		Node_old x = new Node_old();
		Node_old next_1 = new Node_old();
		Node_old y = x;
		Node_old next_2 = null;
		x.next = next_1;
		next_1.next = next_2;
		MyClass.myMethod(x);
	}

	@Test
	public void test_myMethod13() throws Exception {
		Node_old x = null;
		MyClass.myMethod(x);
	}

	@Test
	public void test_myMethod14() throws Exception {
		Node_old x = null;
		MyClass.myMethod(x);
	}

	@Test
	public void test_myMethod15() throws Exception {
		Node_old x = null;
		MyClass.myMethod(x);
	}

	@Test
	public void test_myMethod16() throws Exception {
		Node_old x = null;
		MyClass.myMethod(x);
	}

	@Test
	public void test_myMethod17() throws Exception {
		Node_old x = new Node_old();
		Node_old next_3 = null;
		x.next = next_3;
		MyClass.myMethod(x);
	}

	@Test
	public void test_myMethod18() throws Exception {
		Node_old x = new Node_old();
		Node_old next_3 = new Node_old();
		Node_old next_4 = null;
		x.next = next_3;
		next_3.next = next_4;
		MyClass.myMethod(x);
	}

	@Test
	public void test_myMethod19() throws Exception {
		Node_old x = new Node_old();
		Node_old next_3 = new Node_old();
		Node_old next_4 = new Node_old();
		Node_old next_5 = null;
		x.next = next_3;
		next_3.next = next_4;
		next_4.next = next_5;
		MyClass.myMethod(x);
	}

}

