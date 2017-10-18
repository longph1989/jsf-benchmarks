package basic;

import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class MyClass_myMethod21 extends TestJPF {

	@Test
	public void test_myMethod24() throws Exception {
		MyClass obj = new MyClass();
		int i = 0;
		int j = 0;
		obj.myMethod2(i,j);
	}

	@Test
	public void test_myMethod25() throws Exception {
		MyClass obj = new MyClass();
		int i = 0;
		int j = 2;
		obj.myMethod2(i,j);
	}

	@Test
	public void test_myMethod26() throws Exception {
		MyClass obj = new MyClass();
		int i = 0;
		int j = 0;
		obj.myMethod2(i,j);
	}

	@Test
	public void test_myMethod27() throws Exception {
		MyClass obj = new MyClass();
		Node_old x = new Node_old();
		Node_old y = x;
		Node_old next_1 = null;
		int i = 0;
		int j = 0;
		x.next = next_1;
		obj.myMethod2(i,j);
	}

	@Test
	public void test_myMethod28() throws Exception {
		MyClass obj = new MyClass();
		Node_old x = new Node_old();
		Node_old next_1 = new Node_old();
		Node_old y = x;
		Node_old next_2 = null;
		int i = 0;
		int j = 0;
		x.next = next_1;
		next_1.next = next_2;
		obj.myMethod2(i,j);
	}

	@Test
	public void test_myMethod29() throws Exception {
		MyClass obj = new MyClass();
		int i = 0;
		int j = 1;
		obj.myMethod2(i,j);
	}

}

