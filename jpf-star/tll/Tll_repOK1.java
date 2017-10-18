package tll;

import common.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class Tll_repOK1 extends TestJPF {

	@Test
	public void test_repOK1() throws Exception {
		Tll obj = new Tll();
		obj.root = new Node();
		Node right_4 = obj.root;
		Node left_3 = null;
		Node next_5 = null;
		Node parent_2 = null;
		int val_1 = 0;
		obj.root.val = val_1;
		obj.root.parent = parent_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.next = next_5;
		obj.repOK();
	}

	@Test
	public void test_repOK2() throws Exception {
		Tll obj = new Tll();
		obj.root = null;
		obj.repOK();
	}

	@Test
	public void test_repOK3() throws Exception {
		Tll obj = new Tll();
		obj.root = new Node();
		Node right_4 = null;
		Node left_3 = null;
		Node next_5 = null;
		Node parent_2 = null;
		int val_1 = 0;
		obj.root.val = val_1;
		obj.root.parent = parent_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.next = next_5;
		obj.repOK();
	}

	@Test
	public void test_repOK4() throws Exception {
		Tll obj = new Tll();
		obj.root = new Node();
		Node right_4 = new Node();
		Node left_3 = null;
		Node right_24 = null;
		Node parent_22 = null;
		Node left_23 = null;
		Node next_5 = null;
		Node parent_2 = null;
		Node next_25 = null;
		int val_21 = 0;
		int val_1 = 0;
		obj.root.val = val_1;
		obj.root.parent = parent_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.next = next_5;
		right_4.val = val_21;
		right_4.parent = parent_22;
		right_4.left = left_23;
		right_4.right = right_24;
		right_4.next = next_25;
		obj.repOK();
	}

}

