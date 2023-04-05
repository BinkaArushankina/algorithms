package Homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HomeworkTest {

    Homework homework;

    @BeforeEach
    public void init(){
        homework= new Homework();
    }
    @Test
    public void testingBinarySearch_oneElement(){
        int[]actual={1};
        int expected= 0;

        assertEquals(expected,homework.binarySearch(1,actual));
    }
    @Test
    public void testingBinarySearch_twoElement(){
        int[]actual={1,2};
        int expected= 1;

        assertEquals(expected,homework.binarySearch(2,actual));
    }
    @Test
    public void testingBinarySearch_normal(){
        int[]actual={1,2,3,4,5,6};
        int expected= 2;

        assertEquals(expected,homework.binarySearch(3,actual));
    }
    @Test
    public void testingBinarySearch_emptyArray(){
        int[]actual={};
        int expected= -1;

        assertEquals(expected,homework.binarySearch(0,actual));
    }
    @Test
    public void testingBinarySearch_default(){
        int[]actual={1,2,3,4,5,6};
        int expected= -1;

        assertEquals(expected,homework.binarySearch(7,actual));
    }

}