package aatree;

import aatree.AATree.AANode;
import common.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class AATree_findMin1 extends TestJPF {

	@Test
	public void test_findMin1() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode right_7 = new AANode();
		AANode right_19 = new AANode();
		AANode b_2 = obj.nullNode;
		AANode c_3 = obj.nullNode;
		AANode left_18 = obj.nullNode;
		AANode this_nullNode_321 = obj.nullNode;
		AANode left_388 = obj.nullNode;
		AANode right_387 = obj.nullNode;
		AANode left_392 = this_nullNode_321;
		AANode right_391 = this_nullNode_321;
		int level_8 = 2;
		int level1_320 = 1;
		int level1_317 = 1;
		int a_1 = 0;
		int element_5 = 0;
		int element_390 = -1;
		int d_4 = 0;
		int element_17 = -2;
		int level1_10 = 1;
		int element_318 = -2;
		int element_316 = 0;
		int element_319 = 0;
		int element_386 = 1;
		obj.lastNode = null;
		obj.deletedNode = null;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_17;
		left_6.left = left_18;
		left_6.right = right_19;
		left_6.level = level1_317;
		right_7.element = element_386;
		right_7.left = left_388;
		right_7.right = right_387;
		right_7.level = level1_10;
		right_19.element = element_390;
		right_19.left = left_392;
		right_19.right = right_391;
		right_19.level = level1_320;
		obj.findMin();
	}

	@Test
	public void test_findMin2() throws Exception {
		AATree obj = new AATree();
		obj.root = obj.nullNode;
		AANode b_2 = obj.nullNode;
		AANode c_3 = obj.nullNode;
		int d_4 = 0;
		int a_1 = 0;
		obj.lastNode = null;
		obj.deletedNode = null;
		obj.findMin();
	}

	@Test
	public void test_findMin3() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode b_2 = obj.nullNode;
		AANode c_3 = obj.nullNode;
		AANode left_6 = obj.nullNode;
		AANode right_7 = obj.nullNode;
		int level_8 = 1;
		int d_4 = 0;
		int element_5 = 5;
		int element_316 = 5;
		int a_1 = 0;
		obj.lastNode = null;
		obj.deletedNode = null;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		obj.findMin();
	}

	@Test
	public void test_findMin4() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode right_7 = new AANode();
		AANode b_2 = obj.nullNode;
		AANode c_3 = obj.nullNode;
		AANode left_18 = obj.nullNode;
		AANode this_nullNode_320 = obj.nullNode;
		AANode right_19 = this_nullNode_320;
		AANode left_385 = obj.nullNode;
		AANode right_384 = obj.nullNode;
		int level_8 = 2;
		int d_4 = 0;
		int level1_317 = 1;
		int a_1 = 0;
		int element_17 = -2;
		int level1_10 = 1;
		int element_5 = -1;
		int element_318 = -2;
		int element_316 = -1;
		int element_319 = -1;
		int element_383 = 0;
		obj.lastNode = null;
		obj.deletedNode = null;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_17;
		left_6.left = left_18;
		left_6.right = right_19;
		left_6.level = level1_317;
		right_7.element = element_383;
		right_7.left = left_385;
		right_7.right = right_384;
		right_7.level = level1_10;
		obj.findMin();
	}

	@Test
	public void test_findMin5() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_7 = new AANode();
		AANode b_2 = obj.nullNode;
		AANode c_3 = obj.nullNode;
		AANode left_6 = obj.nullNode;
		AANode left_356 = obj.nullNode;
		AANode right_355 = obj.nullNode;
		int level_8 = 1;
		int d_4 = 0;
		int level_317 = 1;
		int element_5 = -1;
		int a_1 = 0;
		int element_354 = 0;
		int element_316 = -1;
		obj.lastNode = null;
		obj.deletedNode = null;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		right_7.element = element_354;
		right_7.left = left_356;
		right_7.right = right_355;
		right_7.level = level_317;
		obj.findMin();
	}

}

