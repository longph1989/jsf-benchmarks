package ganttproject;

import common.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class DependencyGraph_repOK1 extends TestJPF {

	@Test
	public void test_repOK1() throws Exception {
		DependencyGraph obj = new DependencyGraph();
		obj.myTxn = new Transaction();
		obj.myData = null;
		LinkedListNode myTouchedNodes_2 = null;
		boolean isRunning_1 = false;
		obj.myTxn.isRunning = isRunning_1;
		obj.myTxn.myTouchedNodes = myTouchedNodes_2;
		obj.repOK();
	}

	@Test
	public void test_repOK2() throws Exception {
		DependencyGraph obj = new DependencyGraph();
		obj.myTxn = null;
		obj.myData = null;
		obj.repOK();
	}

}

