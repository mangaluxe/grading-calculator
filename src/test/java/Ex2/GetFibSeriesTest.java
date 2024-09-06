package Ex2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


public class GetFibSeriesTest {

    private Fib fib;


    @Test
    public void testDeclenchementWhenRange_1_ThenResult_not_vide() {
        // Arrange
        fib = new Fib(1);

        // Act
        List<Integer> result = fib.getFibSeries();
        System.out.println(result);

        // Assert
        Assertions.assertFalse(result.isEmpty());
    }


    @Test
    public void testDeclenchementWhenRange_1_ThenResult_isListContain_0() {
        // Arrange
        fib = new Fib(1);
       List<Integer> resultAwait = {0};

        // Act
        List<Integer> result = fib.getFibSeries();
        System.out.println(result);

        // Assert
        Assertions.assertEquals(resultAwait, result);
    }


    @Test
    public void testDeclenchementWhenRange_1_TheResult_contain_3() {
        // Arrange
        fib = new Fib(6);

        // Act
        List<Integer> result = fib.getFibSeries();
        System.out.println(result);

        // Assert
//        Assertions.assertEquals(resultAwait, result);
        Assertions.assertTrue(result.contains(3));
    }


    @Test
    public void testDeclenchementWhenRange_1_TheResult_contain_6_elements() {
        // Arrange
        fib = new Fib(6);

        // Act
        List<Integer> result = fib.getFibSeries();
        System.out.println(result);

        // Assert
        Assertions.assertEquals(6, result.size());

    }


    @Test
    public void testDeclenchementWhenRange_6_ThenResult_not_contain_4() {
        // Arrange
        fib = new Fib(6);

        // Act
        List<Integer> result = fib.getFibSeries();
        System.out.println(result);

        // Assert
        Assertions.assertFalse(result.contains(4));
    }


    @Test
    public void testDeclenchementWhenRange_6_ThenResult_isSortedAscending() {
        // Arrange
        fib = new Fib(6);
        List<Integer> resultAwait = ;

        // Act
        List<Integer> result = fib.getFibSeries();
        System.out.println(result);

        // Assert
        Assertions.assertEquals(resultAwait, result);
    }


}
