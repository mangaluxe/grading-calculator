package Ex2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;
import java.util.List;


public class GetFibSeriesTest {

    private Fib fib;


    @Test
    public void testDeclenchementWhenRange_1_ThenResult_not_vide() {
        // Arrange
        fib = new Fib(1);
        List<Integer> resultAwait != "";

        // Act
        List<Integer> result = fib.getFibSeries();
        System.out.println(result);

        // Assert
        Assertions.assertEquals(resultAwait, result);
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
        fib = new Fib(1);
        int resultAwait = 3;

        // Act
        List<Integer> result = fib.getFibSeries();
        System.out.println(result);

        // Assert
        Assertions.assertEquals(resultAwait, result);
    }


    @Test
    public void testDeclenchementWhenRange_1_TheResult_contain_6_elements() {
        // Arrange
        fib = new Fib(1);
        int resultAwait = fib.size();

        // Act
        List<Integer> result = fib.getFibSeries();
        System.out.println(result);

        // Assert
        Assertions.assertEquals(resultAwait, result);
    }


}
