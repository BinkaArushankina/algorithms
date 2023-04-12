package Consultation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Consultation_SetTest {
    Consultation_Set consultationSet;

    @BeforeEach
    public void init(){
        consultationSet= new Consultation_Set();
    }
    @Test
    public void without_duplicat_one(){
        List<String> actual = Arrays.asList("Jack","Jack","Mary","John");
        List<String> expected = Arrays.asList("John","Jack","Mary");

        assertEquals(expected,consultationSet.withoutDuplicates(actual));
    }
    @Test
    public void without_duplicat_two(){
        List<String> actual = Arrays.asList("Jack","Jack","Jack","Jack");
        List<String> expected = Arrays.asList("Jack");

        assertEquals(expected,consultationSet.withoutDuplicates(actual));
    }
    @Test
    public void without_duplicat_emptyList(){
        List<String> actual = Arrays.asList();
        List<String> expected = Arrays.asList();

        assertEquals(expected,consultationSet.withoutDuplicates(actual));
    }


    //___________________________________________________________________________________________________________\\


    @Test
    public void testing_duplicates_one(){
        List<String> actual = Arrays.asList("Jack","John","Mary","Jack","John");
        List<String> expected = Arrays.asList("Jack","John");

        assertEquals(expected,consultationSet.duplicates(actual));
    }
    @Test
    public void testing_duplicates_two(){
        List<String> actual = Arrays.asList("Jack","John","Mary","Jack","John","Jack","John");
        List<String> expected = Arrays.asList("Jack","John");

        assertEquals(expected,consultationSet.duplicates(actual));
    }
    @Test
    public void testing_duplicates_three(){
        List<String> actual = Arrays.asList("Jack","Jack","Jack");
        List<String> expected = Arrays.asList("Jack");

        assertEquals(expected,consultationSet.duplicates(actual));
    }
    @Test
    public void testing_duplicates_emptyList(){
        List<String> actual = Arrays.asList();
        List<String> expected = Arrays.asList();

        assertEquals(expected,consultationSet.duplicates(actual));
    }
    @Test
    public void testing_duplicates_oneElement(){
        List<String> actual = Arrays.asList("John");
        List<String> expected = Arrays.asList();

        assertEquals(expected,consultationSet.duplicates(actual));
    }
    @Test
    public void testing_duplicates_emptyList_noDuplicates(){
        List<String> actual = Arrays.asList("Jack","John","Jill");
        List<String> expected = Arrays.asList();

        assertEquals(expected,consultationSet.duplicates(actual));
    }



}