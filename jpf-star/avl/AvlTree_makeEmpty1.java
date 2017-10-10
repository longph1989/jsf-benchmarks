package avl;

import common.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class AvlTree_makeEmpty1 extends TestJPF {

	@Test
	public void test_makeEmpty1() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = null;
		obj.makeEmpty();
	}

}

