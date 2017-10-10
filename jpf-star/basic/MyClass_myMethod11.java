package basic;

import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class MyClass_myMethod11 extends TestJPF {

	@Test
	public void test_myMethod11() throws Exception {
		MyClass obj = new MyClass();
		Node_old x = null;
		Node_old y = x;
		obj.myMethod1(x,y);
	}

	@Test
	public void test_myMethod12() throws Exception {
		MyClass obj = new MyClass();
		Node_old x = new Node_old();
		Node_old y = x;
		Node_old next_1 = null;
		x.next = next_1;
		obj.myMethod1(x,y);
	}

	@Test
	public void test_myMethod13() throws Exception {
		MyClass obj = new MyClass();
		Node_old x = new Node_old();
		Node_old next_1 = new Node_old();
		Node_old y = x;
		Node_old next_2 = null;
		x.next = next_1;
		next_1.next = next_2;
		obj.myMethod1(x,y);
	}

}

