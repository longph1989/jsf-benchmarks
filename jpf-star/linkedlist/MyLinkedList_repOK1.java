package linkedlist;

import common.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class MyLinkedList_repOK1 extends TestJPF {

	@Test
	public void test_repOK1() throws Exception {
		MyLinkedList obj = new MyLinkedList();
		obj._header = new MyListNode();
		MyListNode _next_2 = obj._header;
		Object _element_1 = null;
		obj._maxsize = 0;
		obj._header._element = _element_1;
		obj._header._next = _next_2;
		obj.repOK();
	}

	@Test
	public void test_repOK2() throws Exception {
		MyLinkedList obj = new MyLinkedList();
		obj._header = new MyListNode();
		MyListNode _next_2 = null;
		Object _element_1 = null;
		obj._maxsize = 0;
		obj._header._element = _element_1;
		obj._header._next = _next_2;
		obj.repOK();
	}

	@Test
	public void test_repOK3() throws Exception {
		MyLinkedList obj = new MyLinkedList();
		obj._header = null;
		obj._maxsize = 0;
		obj.repOK();
	}

}

