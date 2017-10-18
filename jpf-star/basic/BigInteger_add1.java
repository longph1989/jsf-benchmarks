package basic;

import basic.BigInteger;
import common.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class BigInteger_add1 extends TestJPF {

	@Test
	public void test_add1() throws Exception {
		BigInteger obj = new BigInteger();
		Node x = new Node();
		Node y = new Node();
		Node next1_2 = new Node();
		Node next2_3 = new Node();
		Node next1_5 = null;
		Node next2_6 = null;
		x.next = next1_2;
		y.next = next2_3;
		next1_2.next = next1_5;
		next2_3.next = next2_6;
		obj.add(x,y);
	}

	@Test
	public void test_add2() throws Exception {
		BigInteger obj = new BigInteger();
		Node x = new Node();
		Node y = new Node();
		Node next1_2 = null;
		Node next2_3 = null;
		x.next = next1_2;
		y.next = next2_3;
		obj.add(x,y);
	}

	@Test
	public void test_add3() throws Exception {
		BigInteger obj = new BigInteger();
		Node x = new Node();
		Node y = new Node();
		Node next1_2 = new Node();
		Node next2_3 = new Node();
		Node next1_5 = new Node();
		Node next2_6 = new Node();
		Node next1_8 = null;
		Node next2_9 = null;
		x.next = next1_2;
		y.next = next2_3;
		next1_2.next = next1_5;
		next2_3.next = next2_6;
		next1_5.next = next1_8;
		next2_6.next = next2_9;
		obj.add(x,y);
	}

	@Test
	public void test_add4() throws Exception {
		BigInteger obj = new BigInteger();
		Node x = null;
		Node y = null;
		obj.add(x,y);
	}

}

