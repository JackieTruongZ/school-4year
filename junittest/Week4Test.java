
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Week4Test {
    @Test
    public void testMax2Int1(){
        Week4 week4Test = new Week4();
        int value = week4Test.max2Int(2,1);
        assertEquals(2, value);
    }

    @Test
    public void testMax2Int2(){
        Week4 week4Test = new Week4();
        int value = week4Test.max2Int(2,2);
        assertEquals(2, value);
    }

    @Test
    public void testMax2Int3(){
        Week4 week4Test = new Week4();
        int value = week4Test.max2Int(2,3);
        assertEquals(3, value);
    }

    @Test
    public void testMax2Int4(){
        Week4 week4Test = new Week4();
        int value = week4Test.max2Int(2,4);
        assertEquals(4, value);
    }

    @Test
    public void testMax2Int5(){
        Week4 week4Test = new Week4();
        int value = week4Test.max2Int(2,5);
        assertEquals(5, value);
    }

    @Test
    public void testMinArray1(){
        Week4 week4Test = new Week4();
        int[] array = {1,2,3,4,5,6};
        int value = week4Test.minArray(array);
        assertEquals(1, value);
    }

    @Test
    public void testMinArray2(){
        Week4 week4Test = new Week4();
        int[] array = {2,3,4,5,6};
        int value = week4Test.minArray(array);
        assertEquals(2, value);
    }

    @Test
    public void testMinArray3(){
        Week4 week4Test = new Week4();
        int[] array = {10,4,5,6};
        int value = week4Test.minArray(array);
        assertEquals(4, value);
    }

    @Test
    public void testMinArray4(){
        Week4 week4Test = new Week4();
        int[] array = {11,23,3,4,5,6};
        int value = week4Test.minArray(array);
        assertEquals(3, value);
    }

    @Test
    public void testMinArray5(){
        Week4 week4Test = new Week4();
        int[] array = {100,40,4,5,6};
        int value = week4Test.minArray(array);
        assertEquals(4, value);
    }

    @Test
    public void testCalculateBMI1(){
        Week4 week4Test = new Week4();
        String value = week4Test.calculateBMI(40,1.6);
        assertEquals("Thiếu Cân", value);
    }

    @Test
    public void testCalculateBMI2(){
        Week4 week4Test = new Week4();
        String value = week4Test.calculateBMI(100,1.6);
        assertEquals("Béo Phì", value);
    }

    @Test
    public void testCalculateBMI3(){
        Week4 week4Test = new Week4();
        String value = week4Test.calculateBMI(60,1.6);
        assertEquals("Thừa Cân", value);
    }

    @Test
    public void testCalculateBMI4(){
        Week4 week4Test = new Week4();
        String value = week4Test.calculateBMI(50,1.6);
        assertEquals("Bình thường", value);
    }

    @Test
    public void testCalculateBMI5(){
        Week4 week4Test = new Week4();
        String value = week4Test.calculateBMI(60,1.9);
        assertEquals("Thiếu Cân", value);
    }
}
