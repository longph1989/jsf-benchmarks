package linkedlist;

import common.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class MyLinkedList_remove1 extends TestJPF {

	@Test
	public void test_remove1() throws Exception {
		MyLinkedList obj = new MyLinkedList();
		obj._header = new MyListNode();
		MyListNode next = null;
		Object x = null;
		obj._maxsize = 0;
		Object element = null;
		obj._header._element = element;
		obj._header._next = next;
		obj.remove(x);
	}

	@Test
	public void test_remove2() throws Exception {
		MyLinkedList obj = new MyLinkedList();
		obj._header = new MyListNode();
		MyListNode next = new MyListNode();
		Object element_1 = new Object();
		MyListNode next_2 = new MyListNode();
		Object element_5 = new Object();
		Object x = element_1;
		MyListNode next_6 = null;
		obj._maxsize = 0;
		Object element = null;
		obj._header._element = element;
		obj._header._next = next;
		next._element = element_1;
		next._next = next_2;
		next_2._element = element_5;
		next_2._next = next_6;
		obj.remove(x);
	}

	@Test
	public void test_remove3() throws Exception {
		MyLinkedList obj = new MyLinkedList();
		obj._header = new MyListNode();
		MyListNode next = new MyListNode();
		Object element_1 = new Object();
		MyListNode next_2 = null;
		Object x = new Object();
		obj._maxsize = 0;
		Object element = null;
		obj._header._element = element;
		obj._header._next = next;
		next._element = element_1;
		next._next = next_2;
		obj.remove(x);
	}

	@Test
	public void test_remove4() throws Exception {
		MyLinkedList obj = new MyLinkedList();
		obj._header = new MyListNode();
		MyListNode next = new MyListNode();
		Object element_1 = new Object();
		Object x = element_1;
		MyListNode next_2 = null;
		obj._maxsize = 0;
		Object element = null;
		obj._header._element = element;
		obj._header._next = next;
		next._element = element_1;
		next._next = next_2;
		obj.remove(x);
	}

}

