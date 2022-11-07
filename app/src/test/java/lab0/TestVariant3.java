package lab0;


import static lab0.Variant3.MonthOfYear.*;
import static lab0.Variant3.SeasonOfYear.*;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class TestVariant3 {

    @Test(dataProvider = "inputProvider")
    public void inputTest(int input, int expected) {
        Variant3 variant3 = new Variant3();
        assertEquals(variant3.integerNumbersTask(input), expected);
    }

    @DataProvider
    public Object[][] inputProvider() {
        return new Object[][] { { 500, 0 }, { 1025, 1 }, {2048, 2} };
    }

    @Test(dataProvider = "booleanProvider")
    public void booleanTest(int p1, boolean p3) {
        assertEquals(new Variant3().booleanTask(p1), p3);
    }

    @DataProvider
    public Object[][] booleanProvider() {
        return new Object[][] { { 5, false }, { 12, true }, { -3, false } , {24, true} };
    }


    @Test(dataProvider = "ifProvider")
    public void ifTest(int p1, int p3) {
        assertEquals(new Variant3().ifTask(p1), p3);
    }

    @DataProvider
    public Object[][] ifProvider() {
        return new Object[][] { { 2, 3 }, { 0, 10 }, { -3, -5 } };
    }

        @Test(dataProvider = "switchProvider")
    public void switchTest(Variant3.MonthOfYear p1, Variant3.SeasonOfYear p2) {
        assertEquals(new Variant3().switchTask(p1), p2);
    }

    @DataProvider
    public Object[][] switchProvider() {
        return new Object[][] { { January, Winter }, { May, Spring} , {July, Summer}, {November , Autumn}
                };
    }

    @Test(dataProvider = "forProvider")
    public void forTest(int a, int b, int[] res) {
        assertEquals(new Variant3().forTask(a,b), res);
    }

    @DataProvider
    public Object[][] forProvider() {
        return new Object[][] { { 2, 5, new int[]{4,3, 2} }, {10, 15, new int[]{14,13,12,11, 4}}, {1,2, new int[]{0}}};
    }

        @Test(dataProvider = "whileProvider")
    public void whileTest(int a, int b, int[] result) {
        assertEquals(new Variant3().whileTask(a, b), result);
    }

    @DataProvider
    public Object[][] whileProvider() {
        return new Object[][] { { 9, 2, new int[]{4,1} }, { 33, 10, new int[]{3,3} }, { 72, 7, new int[]{10,2} },
                { 25, 7, new int[]{3,4} }, {8,2, new int[]{4,0}} };
    }

        @Test(dataProvider = "arrayProvider")
    public void arrayTest(int n, double a, double d, double[] result) {
        assertEquals(new Variant3().arrayTask(n,a,d), result);
    }

    @DataProvider
    public Object[][] arrayProvider() {
        return new Object[][] { {3, 1, 2, new double[]{1, 3, 5}},
                                {5, 3, 4, new double[]{3,7,11,15,19}},
                                {4, 1.5, 1.2, new double[]{1.5, 2.7, 3.9, 5.1}} };
    }

        @Test(dataProvider = "matrixProvider")
    public void twoDimensionArrayTest(int m, int n, int[] input, int[][] output) {
        assertEquals(new Variant3().twoDimensionArrayTask(m, n, input), output);
    }

    @DataProvider
    public Object[][] matrixProvider() {
        int[] array1 = new int[]{1,3,5,2,7};

        int[][] array2 = new int[][]{ {1,1,1,1,1}, {3,3,3,3,3},
                {5,5,5,5,5}, {2,2,2,2,2}, {7,7,7,7,7}};

        int[] array3 = new int[]{5,4,1,3};

        int[][] array4 = new int[][]{ {5,5,5,5}, {4,4,4,4}, {1,1,1,1}, {3,3,3,3} };

        return new Object[][] { {5,5,array1, array2} , {4,4,array3,array4} };

    }
}

