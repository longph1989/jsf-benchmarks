package spin15;

import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class Node_swapNode1 extends TestJPF {

	@Test
	public void test_swapNode1() throws Exception {
		Node obj = new Node();
		obj.next = null;
		obj.elem = 0;
		obj.swapNode();
	}

	@Test
	public void test_swapNode2() throws Exception {
		Node obj = new Node();
		obj.next = new Node();
		Node next1_2 = null;
		obj.elem = 1;
		int elem1_1 = 0;
		obj.next.elem = elem1_1;
		obj.next.next = next1_2;
		obj.swapNode();
	}

	@Test
	public void test_swapNode3() throws Exception {
		Node obj = new Node();
		obj.next = new Node();
		Node next1_2 = new Node();
		Node next1_4 = null;
		obj.elem = 0;
		int elem1_1 = -1;
		int elem1_3 = 0;
		obj.next.elem = elem1_1;
		obj.next.next = next1_2;
		next1_2.elem = elem1_3;
		next1_2.next = next1_4;
		obj.swapNode();
	}

	@Test
	public void test_swapNode4() throws Exception {
		Node obj = new Node();
		obj.next = new Node();
		Node next1_2 = null;
		obj.elem = 0;
		int elem1_1 = 0;
		obj.next.elem = elem1_1;
		obj.next.next = next1_2;
		obj.swapNode();
	}

}

