package aatree;

import aatree.AATree.AANode;
import common.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class AATree_contains1 extends TestJPF {

	@Test
	public void test_contains1() throws Exception {
		AATree obj = new AATree();
		obj.root = obj.nullNode;
		AANode b_2 = obj.nullNode;
		AANode c_3 = obj.nullNode;
		int d_4 = 0;
		int x = 0;
		int a_1 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		obj.contains(x);
	}

	@Test
	public void test_contains2() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_7 = new AANode();
		AANode b_2 = obj.nullNode;
		AANode c_3 = obj.nullNode;
		AANode left_6 = obj.nullNode;
		AANode left_360 = obj.nullNode;
		AANode right_359 = obj.nullNode;
		int level_8 = 1;
		int d_4 = 0;
		int level_317 = 1;
		int element_5 = 1;
		int a_1 = 0;
		int element_316 = 1;
		int x = 0;
		int element_358 = 2;
		obj.deletedNode = null;
		obj.lastNode = null;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		right_7.element = element_358;
		right_7.left = left_360;
		right_7.right = right_359;
		right_7.level = level_317;
		obj.contains(x);
	}

	@Test
	public void test_contains3() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_7 = new AANode();
		AANode b_2 = obj.nullNode;
		AANode c_3 = obj.nullNode;
		AANode this_nullNode_320 = obj.nullNode;
		AANode this_nullNode_323 = obj.nullNode;
		AANode left_6 = obj.nullNode;
		AANode left_17 = this_nullNode_320;
		AANode right_18 = this_nullNode_323;
		int level_8 = 1;
		int d_4 = 0;
		int level_317 = 1;
		int a_1 = 0;
		int element_5 = -1;
		int element_321 = 0;
		int element_16 = 0;
		int element_318 = -1;
		int element_316 = -1;
		int x = 0;
		int element_319 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		right_7.element = element_16;
		right_7.left = left_17;
		right_7.right = right_18;
		right_7.level = level_317;
		obj.contains(x);
	}

	@Test
	public void test_contains4() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_7 = new AANode();
		AANode b_2 = obj.nullNode;
		AANode c_3 = obj.nullNode;
		AANode this_nullNode_319 = obj.nullNode;
		AANode left_6 = obj.nullNode;
		AANode left_375 = this_nullNode_319;
		AANode right_374 = this_nullNode_319;
		int level_8 = 1;
		int d_4 = 0;
		int element_373 = 1;
		int level_318 = 1;
		int element_317 = 0;
		int a_1 = 0;
		int element_5 = 0;
		int element_316 = 0;
		int x = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		right_7.element = element_373;
		right_7.left = left_375;
		right_7.right = right_374;
		right_7.level = level_318;
		obj.contains(x);
	}

	@Test
	public void test_contains5() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode b_2 = obj.nullNode;
		AANode c_3 = obj.nullNode;
		AANode left_6 = obj.nullNode;
		AANode right_7 = obj.nullNode;
		int element_5 = 1;
		int level_8 = 1;
		int d_4 = 0;
		int element_316 = 1;
		int x = 0;
		int a_1 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		obj.contains(x);
	}

	@Test
	public void test_contains6() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode right_7 = new AANode();
		AANode right_30 = new AANode();
		AANode b_2 = obj.nullNode;
		AANode c_3 = obj.nullNode;
		AANode this_nullNode_319 = obj.nullNode;
		AANode this_nullNode_323 = obj.nullNode;
		AANode left_29 = this_nullNode_319;
		AANode left_398 = obj.nullNode;
		AANode right_397 = obj.nullNode;
		AANode left_410 = this_nullNode_323;
		AANode right_409 = this_nullNode_323;
		int level_8 = 2;
		int level1_317 = 1;
		int element_28 = 0;
		int a_1 = 0;
		int element_5 = 2;
		int element_396 = 3;
		int level1_322 = 1;
		int element_320 = 0;
		int element_408 = 1;
		int d_4 = 0;
		int level1_10 = 1;
		int element_321 = 2;
		int element_318 = 0;
		int element_316 = 2;
		int x = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_28;
		left_6.left = left_29;
		left_6.right = right_30;
		left_6.level = level1_317;
		right_7.element = element_396;
		right_7.left = left_398;
		right_7.right = right_397;
		right_7.level = level1_10;
		right_30.element = element_408;
		right_30.left = left_410;
		right_30.right = right_409;
		right_30.level = level1_322;
		obj.contains(x);
	}

	@Test
	public void test_contains7() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode right_7 = new AANode();
		AANode b_2 = obj.nullNode;
		AANode c_3 = obj.nullNode;
		AANode this_nullNode_319 = obj.nullNode;
		AANode this_nullNode_323 = obj.nullNode;
		AANode left_29 = this_nullNode_319;
		AANode right_30 = this_nullNode_323;
		AANode left_398 = obj.nullNode;
		AANode right_397 = obj.nullNode;
		int level_8 = 2;
		int level1_317 = 1;
		int element_28 = 0;
		int a_1 = 0;
		int element_5 = 1;
		int element_396 = 2;
		int element_320 = 0;
		int d_4 = 0;
		int level1_10 = 1;
		int element_321 = 1;
		int element_318 = 0;
		int element_316 = 1;
		int x = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_28;
		left_6.left = left_29;
		left_6.right = right_30;
		left_6.level = level1_317;
		right_7.element = element_396;
		right_7.left = left_398;
		right_7.right = right_397;
		right_7.level = level1_10;
		obj.contains(x);
	}

	@Test
	public void test_contains8() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode b_2 = obj.nullNode;
		AANode c_3 = obj.nullNode;
		AANode right_7 = obj.nullNode;
		AANode left_6 = obj.nullNode;
		int element_5 = -1;
		int level_8 = 1;
		int d_4 = 0;
		int element_316 = -1;
		int x = 0;
		int a_1 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		obj.contains(x);
	}

	@Test
	public void test_contains9() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_7 = new AANode();
		AANode left_6 = new AANode();
		AANode right_50 = new AANode();
		AANode b_2 = obj.nullNode;
		AANode c_3 = obj.nullNode;
		AANode this_nullNode_320 = obj.nullNode;
		AANode this_nullNode_323 = obj.nullNode;
		AANode left_49 = this_nullNode_320;
		AANode left_399 = obj.nullNode;
		AANode right_398 = obj.nullNode;
		AANode left_411 = this_nullNode_323;
		AANode right_410 = this_nullNode_323;
		int level_8 = 2;
		int level1_317 = 1;
		int element_397 = -2;
		int element_409 = 1;
		int a_1 = 0;
		int element_5 = -1;
		int level1_322 = 1;
		int d_4 = 0;
		int level1_10 = 1;
		int element_321 = 0;
		int element_48 = 0;
		int element_318 = -1;
		int element_316 = -1;
		int x = 0;
		int element_319 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		right_7.element = element_48;
		right_7.left = left_49;
		right_7.right = right_50;
		right_7.level = level1_317;
		left_6.element = element_397;
		left_6.left = left_399;
		left_6.right = right_398;
		left_6.level = level1_10;
		right_50.element = element_409;
		right_50.left = left_411;
		right_50.right = right_410;
		right_50.level = level1_322;
		obj.contains(x);
	}

	@Test
	public void test_contains10() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_7 = new AANode();
		AANode left_6 = new AANode();
		AANode b_2 = obj.nullNode;
		AANode c_3 = obj.nullNode;
		AANode this_nullNode_320 = obj.nullNode;
		AANode this_nullNode_323 = obj.nullNode;
		AANode left_49 = this_nullNode_320;
		AANode right_50 = this_nullNode_323;
		AANode left_399 = obj.nullNode;
		AANode right_398 = obj.nullNode;
		int level_8 = 2;
		int level1_317 = 1;
		int element_397 = -2;
		int a_1 = 0;
		int element_5 = -1;
		int d_4 = 0;
		int level1_10 = 1;
		int element_321 = 0;
		int element_48 = 0;
		int element_318 = -1;
		int element_316 = -1;
		int x = 0;
		int element_319 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		right_7.element = element_48;
		right_7.left = left_49;
		right_7.right = right_50;
		right_7.level = level1_317;
		left_6.element = element_397;
		left_6.left = left_399;
		left_6.right = right_398;
		left_6.level = level1_10;
		obj.contains(x);
	}

	@Test
	public void test_contains11() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode b_2 = obj.nullNode;
		AANode c_3 = obj.nullNode;
		AANode this_nullNode_319 = obj.nullNode;
		AANode left_6 = obj.nullNode;
		AANode right_7 = this_nullNode_319;
		int level_8 = 1;
		int d_4 = 0;
		int element_317 = 0;
		int a_1 = 0;
		int element_5 = 0;
		int element_316 = 0;
		int x = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		obj.contains(x);
	}

}

