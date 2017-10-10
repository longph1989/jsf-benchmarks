package avl;

import common.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class AvlTree_insert1 extends TestJPF {

	@Test
	public void test_insert1() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = null;
		int x = 0;
		obj.insert(x);
	}

	@Test
	public void test_insert2() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = null;
		AvlNode right_3 = null;
		int height_4 = 0;
		int element_1 = 1;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		obj.insert(x);
	}

	@Test
	public void test_insert3() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_11 = null;
		AvlNode right_12 = null;
		AvlNode left_17 = null;
		AvlNode right_18 = null;
		int heightL_6 = 0;
		int element_1 = 0;
		int heightR_8 = 0;
		int element_223 = 0;
		int height_4 = 1;
		int element_10 = -1;
		int element_16 = 1;
		int element_224 = 1;
		int element_225 = 1;
		int x = -2;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_10;
		left_2.left = left_11;
		left_2.right = right_12;
		left_2.height = heightL_6;
		right_3.element = element_16;
		right_3.left = left_17;
		right_3.right = right_18;
		right_3.height = heightR_8;
		obj.insert(x);
	}

	@Test
	public void test_insert4() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode right_12 = null;
		AvlNode left_11 = null;
		AvlNode left_17 = null;
		AvlNode right_18 = null;
		int heightL_6 = 0;
		int element_1 = 0;
		int heightR_8 = 0;
		int element_223 = 0;
		int height_4 = 1;
		int element_10 = -2;
		int element_16 = 1;
		int element_224 = 1;
		int element_225 = 1;
		int x = -1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_10;
		left_2.left = left_11;
		left_2.right = right_12;
		left_2.height = heightL_6;
		right_3.element = element_16;
		right_3.left = left_17;
		right_3.right = right_18;
		right_3.height = heightR_8;
		obj.insert(x);
	}

	@Test
	public void test_insert5() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_11 = null;
		AvlNode right_12 = null;
		AvlNode left_17 = null;
		AvlNode right_18 = null;
		int heightL_6 = 0;
		int element_1 = 0;
		int heightR_8 = 0;
		int element_223 = 0;
		int height_4 = 1;
		int element_10 = -1;
		int element_16 = 1;
		int element_224 = 1;
		int element_225 = 1;
		int x = -1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_10;
		left_2.left = left_11;
		left_2.right = right_12;
		left_2.height = heightL_6;
		right_3.element = element_16;
		right_3.left = left_17;
		right_3.right = right_18;
		right_3.height = heightR_8;
		obj.insert(x);
	}

	@Test
	public void test_insert6() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = null;
		AvlNode left_2 = null;
		int height_4 = 0;
		int element_1 = -1;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		obj.insert(x);
	}

	@Test
	public void test_insert7() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_17 = null;
		AvlNode right_18 = null;
		AvlNode left_11 = null;
		AvlNode right_12 = null;
		int heightL_6 = 0;
		int element_1 = 0;
		int heightR_8 = 0;
		int element_223 = -1;
		int height_4 = 1;
		int element_10 = -1;
		int element_16 = 2;
		int element_224 = -1;
		int element_225 = 0;
		int x = 1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		right_3.element = element_16;
		right_3.left = left_17;
		right_3.right = right_18;
		right_3.height = heightR_8;
		left_2.element = element_10;
		left_2.left = left_11;
		left_2.right = right_12;
		left_2.height = heightL_6;
		obj.insert(x);
	}

	@Test
	public void test_insert8() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode right_18 = null;
		AvlNode left_17 = null;
		AvlNode left_11 = null;
		AvlNode right_12 = null;
		int heightL_6 = 0;
		int element_1 = 0;
		int heightR_8 = 0;
		int element_223 = -1;
		int height_4 = 1;
		int element_10 = -1;
		int element_16 = 1;
		int element_224 = -1;
		int element_225 = 0;
		int x = 2;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		right_3.element = element_16;
		right_3.left = left_17;
		right_3.right = right_18;
		right_3.height = heightR_8;
		left_2.element = element_10;
		left_2.left = left_11;
		left_2.right = right_12;
		left_2.height = heightL_6;
		obj.insert(x);
	}

	@Test
	public void test_insert9() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_17 = null;
		AvlNode right_18 = null;
		AvlNode left_11 = null;
		AvlNode right_12 = null;
		int heightL_6 = 0;
		int element_1 = 0;
		int heightR_8 = 0;
		int element_223 = -1;
		int height_4 = 1;
		int element_10 = -1;
		int element_16 = 1;
		int element_224 = -1;
		int element_225 = 0;
		int x = 1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		right_3.element = element_16;
		right_3.left = left_17;
		right_3.right = right_18;
		right_3.height = heightR_8;
		left_2.element = element_10;
		left_2.left = left_11;
		left_2.right = right_12;
		left_2.height = heightL_6;
		obj.insert(x);
	}

	@Test
	public void test_insert10() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = null;
		AvlNode right_3 = null;
		int height_4 = 0;
		int element_1 = 0;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		obj.insert(x);
	}

	@Test
	public void test_insert11() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_11 = null;
		AvlNode right_12 = null;
		AvlNode left_17 = null;
		AvlNode right_18 = null;
		int heightL_6 = 0;
		int element_1 = 0;
		int heightR_8 = 0;
		int element_223 = -1;
		int element_224 = -1;
		int height_4 = 1;
		int element_10 = -1;
		int element_16 = 1;
		int element_225 = 0;
		int element_227 = 1;
		int element_228 = 1;
		int element_226 = 0;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_10;
		left_2.left = left_11;
		left_2.right = right_12;
		left_2.height = heightL_6;
		right_3.element = element_16;
		right_3.left = left_17;
		right_3.right = right_18;
		right_3.height = heightR_8;
		obj.insert(x);
	}

	@Test
	public void test_insert12() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_47 = null;
		AvlNode right_48 = null;
		AvlNode right_3 = null;
		int height_4 = 1;
		int heightL_6 = 0;
		int element_46 = 1;
		int element_1 = 2;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_46;
		left_2.left = left_47;
		left_2.right = right_48;
		left_2.height = heightL_6;
		obj.insert(x);
	}

	@Test
	public void test_insert13() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode right_48 = null;
		AvlNode left_47 = null;
		AvlNode right_3 = null;
		int height_4 = 1;
		int heightL_6 = 0;
		int element_46 = -1;
		int element_1 = 1;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_46;
		left_2.left = left_47;
		left_2.right = right_48;
		left_2.height = heightL_6;
		obj.insert(x);
	}

	@Test
	public void test_insert14() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_47 = null;
		AvlNode right_48 = null;
		AvlNode right_3 = null;
		int height_4 = 1;
		int heightL_6 = 0;
		int element_46 = 0;
		int element_1 = 1;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_46;
		left_2.left = left_47;
		left_2.right = right_48;
		left_2.height = heightL_6;
		obj.insert(x);
	}

	@Test
	public void test_insert15() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_47 = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode right_48 = null;
		AvlNode left_93 = null;
		AvlNode right_94 = null;
		AvlNode left_63 = null;
		AvlNode right_64 = null;
		int element_92 = -1;
		int heightL_49 = 0;
		int heightR_8 = 0;
		int element_228 = 3;
		int element_226 = 2;
		int heightL_6 = 1;
		int element_1 = 2;
		int element_62 = 3;
		int element_223 = -1;
		int element_224 = -1;
		int height_4 = 2;
		int element_225 = 0;
		int element_227 = 3;
		int element_46 = 0;
		int x = 1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_46;
		left_2.left = left_47;
		left_2.right = right_48;
		left_2.height = heightL_6;
		left_47.element = element_92;
		left_47.left = left_93;
		left_47.right = right_94;
		left_47.height = heightL_49;
		right_3.element = element_62;
		right_3.left = left_63;
		right_3.right = right_64;
		right_3.height = heightR_8;
		obj.insert(x);
	}

	@Test
	public void test_insert16() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_47 = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode right_48 = null;
		AvlNode left_93 = null;
		AvlNode right_94 = null;
		AvlNode left_63 = null;
		AvlNode right_64 = null;
		int element_92 = -1;
		int heightL_49 = 0;
		int heightR_8 = 0;
		int element_228 = 2;
		int element_226 = 1;
		int heightL_6 = 1;
		int element_1 = 1;
		int element_62 = 2;
		int element_223 = -1;
		int element_224 = -1;
		int height_4 = 2;
		int element_225 = 0;
		int element_227 = 2;
		int element_46 = 0;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_46;
		left_2.left = left_47;
		left_2.right = right_48;
		left_2.height = heightL_6;
		left_47.element = element_92;
		left_47.left = left_93;
		left_47.right = right_94;
		left_47.height = heightL_49;
		right_3.element = element_62;
		right_3.left = left_63;
		right_3.right = right_64;
		right_3.height = heightR_8;
		obj.insert(x);
	}

	@Test
	public void test_insert17() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode right_3 = null;
		AvlNode left_47 = null;
		AvlNode right_48 = null;
		int heightL_6 = 0;
		int element_1 = 0;
		int element_223 = -1;
		int element_224 = -1;
		int height_4 = 1;
		int element_225 = 0;
		int element_46 = -1;
		int x = 1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_46;
		left_2.left = left_47;
		left_2.right = right_48;
		left_2.height = heightL_6;
		obj.insert(x);
	}

	@Test
	public void test_insert18() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode right_3 = null;
		AvlNode left_47 = null;
		AvlNode right_48 = null;
		int heightL_6 = 0;
		int element_1 = 0;
		int element_223 = -1;
		int element_224 = -1;
		int height_4 = 1;
		int element_225 = 0;
		int element_46 = -1;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_46;
		left_2.left = left_47;
		left_2.right = right_48;
		left_2.height = heightL_6;
		obj.insert(x);
	}

	@Test
	public void test_insert19() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_47 = new AvlNode();
		AvlNode right_48 = new AvlNode();
		AvlNode left_63 = null;
		AvlNode right_64 = null;
		AvlNode left_299 = null;
		AvlNode right_298 = null;
		AvlNode left_313 = null;
		AvlNode right_312 = null;
		int heightR_50 = 0;
		int heightL_49 = 0;
		int heightR_8 = 0;
		int element_228 = 1;
		int element_297 = -3;
		int element_226 = 0;
		int heightL_6 = 1;
		int element_1 = 0;
		int element_62 = 1;
		int element_223 = -2;
		int element_224 = -2;
		int height_4 = 2;
		int element_225 = 0;
		int element_227 = 1;
		int element_46 = -2;
		int x = 0;
		int element_311 = -1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_46;
		left_2.left = left_47;
		left_2.right = right_48;
		left_2.height = heightL_6;
		right_3.element = element_62;
		right_3.left = left_63;
		right_3.right = right_64;
		right_3.height = heightR_8;
		left_47.element = element_297;
		left_47.left = left_299;
		left_47.right = right_298;
		left_47.height = heightL_49;
		right_48.element = element_311;
		right_48.left = left_313;
		right_48.right = right_312;
		right_48.height = heightR_50;
		obj.insert(x);
	}

	@Test
	public void test_insert20() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_47 = new AvlNode();
		AvlNode right_48 = null;
		AvlNode left_63 = null;
		AvlNode right_64 = null;
		AvlNode left_301 = null;
		AvlNode right_300 = null;
		int heightL_49 = 0;
		int heightR_8 = 0;
		int element_228 = 1;
		int element_299 = -2;
		int element_226 = 0;
		int heightL_6 = 1;
		int element_1 = 0;
		int element_62 = 1;
		int element_223 = -1;
		int element_224 = -1;
		int height_4 = 2;
		int element_225 = 0;
		int element_227 = 1;
		int element_46 = -1;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_46;
		left_2.left = left_47;
		left_2.right = right_48;
		left_2.height = heightL_6;
		right_3.element = element_62;
		right_3.left = left_63;
		right_3.right = right_64;
		right_3.height = heightR_8;
		left_47.element = element_299;
		left_47.left = left_301;
		left_47.right = right_300;
		left_47.height = heightL_49;
		obj.insert(x);
	}

	@Test
	public void test_insert21() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = null;
		AvlNode left_123 = null;
		AvlNode right_124 = null;
		int element_1 = 0;
		int heightR_8 = 0;
		int element_223 = 0;
		int element_224 = 1;
		int height_4 = 1;
		int element_225 = 1;
		int element_122 = 1;
		int x = -1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		right_3.element = element_122;
		right_3.left = left_123;
		right_3.right = right_124;
		right_3.height = heightR_8;
		obj.insert(x);
	}

	@Test
	public void test_insert22() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_123 = null;
		AvlNode right_124 = null;
		AvlNode left_2 = null;
		int height_4 = 1;
		int element_1 = -1;
		int heightR_8 = 0;
		int element_122 = 1;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		right_3.element = element_122;
		right_3.left = left_123;
		right_3.right = right_124;
		right_3.height = heightR_8;
		obj.insert(x);
	}

	@Test
	public void test_insert23() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode right_124 = null;
		AvlNode left_123 = null;
		AvlNode left_2 = null;
		int height_4 = 1;
		int element_1 = -2;
		int heightR_8 = 0;
		int element_122 = -1;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		right_3.element = element_122;
		right_3.left = left_123;
		right_3.right = right_124;
		right_3.height = heightR_8;
		obj.insert(x);
	}

	@Test
	public void test_insert24() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_123 = null;
		AvlNode right_124 = null;
		AvlNode left_2 = null;
		int height_4 = 1;
		int element_1 = -1;
		int heightR_8 = 0;
		int element_122 = 0;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		right_3.element = element_122;
		right_3.left = left_123;
		right_3.right = right_124;
		right_3.height = heightR_8;
		obj.insert(x);
	}

	@Test
	public void test_insert25() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_123 = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode right_124 = null;
		AvlNode left_164 = null;
		AvlNode right_165 = null;
		AvlNode left_117 = null;
		AvlNode right_118 = null;
		int heightR_8 = 1;
		int element_228 = -1;
		int element_229 = 0;
		int element_226 = 2;
		int element_122 = 2;
		int heightL_125 = 0;
		int heightL_6 = 0;
		int element_116 = -1;
		int element_1 = 0;
		int element_223 = 0;
		int element_224 = 1;
		int height_4 = 2;
		int element_163 = 1;
		int element_225 = 1;
		int element_227 = -1;
		int x = 3;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		right_3.element = element_122;
		right_3.left = left_123;
		right_3.right = right_124;
		right_3.height = heightR_8;
		left_123.element = element_163;
		left_123.left = left_164;
		left_123.right = right_165;
		left_123.height = heightL_125;
		left_2.element = element_116;
		left_2.left = left_117;
		left_2.right = right_118;
		left_2.height = heightL_6;
		obj.insert(x);
	}

	@Test
	public void test_insert26() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_123 = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode right_124 = null;
		AvlNode left_164 = null;
		AvlNode right_165 = null;
		AvlNode left_117 = null;
		AvlNode right_118 = null;
		int heightR_8 = 1;
		int element_228 = -1;
		int element_229 = 0;
		int element_226 = 2;
		int element_122 = 2;
		int heightL_125 = 0;
		int heightL_6 = 0;
		int element_116 = -1;
		int element_1 = 0;
		int element_223 = 0;
		int element_224 = 1;
		int height_4 = 2;
		int element_163 = 1;
		int element_225 = 1;
		int element_227 = -1;
		int x = 2;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		right_3.element = element_122;
		right_3.left = left_123;
		right_3.right = right_124;
		right_3.height = heightR_8;
		left_123.element = element_163;
		left_123.left = left_164;
		left_123.right = right_165;
		left_123.height = heightL_125;
		left_2.element = element_116;
		left_2.left = left_117;
		left_2.right = right_118;
		left_2.height = heightL_6;
		obj.insert(x);
	}

	@Test
	public void test_insert27() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = null;
		AvlNode left_123 = null;
		AvlNode right_124 = null;
		int element_1 = -1;
		int heightR_8 = 0;
		int element_223 = -1;
		int element_224 = 0;
		int height_4 = 1;
		int element_225 = 0;
		int element_122 = 0;
		int x = -1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		right_3.element = element_122;
		right_3.left = left_123;
		right_3.right = right_124;
		right_3.height = heightR_8;
		obj.insert(x);
	}

}

