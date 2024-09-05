package Ex1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class GetGradeTest {

    private GradingCalculator gradingCalculator;

//    @Test
//    public void testScorePresenceWhenScore_95_Presence_90_ThenResult_A() {
//        // Arrange
//        gradingCalculator = new GradingCalculator(95, 90);
//        char resultAwait = 'A';
//
//        // Act
//        char result = gradingCalculator.getGrade();
//        System.out.println(result);
//
//        // Assert
//        Assertions.assertEquals(resultAwait, result);
//    }
//
//
//    @Test
//    public void testScorePresenceWhenScore_85_Presence_90_ThenResult_B() {
//        // Arrange
//        gradingCalculator = new GradingCalculator(85, 90);
//        char resultAwait = 'B';
//
//        // Act
//        char result = gradingCalculator.getGrade();
//        System.out.println(result);
//
//        // Assert
//        Assertions.assertEquals(resultAwait, result);
//    }
//
//
//    @Test
//    public void testScorePresenceWhenScore_65_Presence_90_ThenResult_C() {
//        // Arrange
//        gradingCalculator = new GradingCalculator(65, 90);
//        char resultAwait = 'C';
//
//        // Act
//        char result = gradingCalculator.getGrade();
//        System.out.println(result);
//
//        // Assert
//        Assertions.assertEquals(resultAwait, result);
//    }
//
//
//    @Test
//    public void testScorePresenceWhenScore_95_Presence_65_ThenResult_B() {
//        // Arrange
//        gradingCalculator = new GradingCalculator(95, 65);
//        char resultAwait = 'B';
//
//        // Act
//        char result = gradingCalculator.getGrade();
//        System.out.println(result);
//
//        // Assert
//        Assertions.assertEquals(resultAwait, result);
//    }
//
//
//    @Test
//    public void testScorePresenceWhenScore_95_Presence_55_ThenResult_F() {
//        // Arrange
//        gradingCalculator = new GradingCalculator(95, 55);
//        char resultAwait = 'F';
//
//        // Act
//        char result = gradingCalculator.getGrade();
//        System.out.println(result);
//
//        // Assert
//        Assertions.assertEquals(resultAwait, result);
//    }
//
//
//    @Test
//    public void testScorePresenceWhenScore_65_Presence_55_ThenResult_F() {
//        // Arrange
//        gradingCalculator = new GradingCalculator(65, 55);
//        char resultAwait = 'F';
//
//        // Act
//        char result = gradingCalculator.getGrade();
//        System.out.println(result);
//
//        // Assert
//        Assertions.assertEquals(resultAwait, result);
//    }
//
//
//    @Test
//    public void testScorePresenceWhenScore_50_Presence_90_ThenResult_F() {
//        // Arrange
//        gradingCalculator = new GradingCalculator(50, 90);
//        char resultAwait = 'F';
//
//        // Act
//        char result = gradingCalculator.getGrade();
//        System.out.println(result);
//
//        // Assert
//        Assertions.assertEquals(resultAwait, result);
//    }


    // ---------------------------- Sans répéter ----------------------------

    @ParameterizedTest
    @CsvSource({
            "95,90,A",
            "85,90,B",
            "65,90,C",
            "95,65,B",
            "95,55,F",
            "65,55,F",
            "50,90,F",
    })
//    @MethodSource("providerParameters")
    public void whenScoreAndPresenceThenResultAwaitedGrade(int score,int presence, char awaitedGrade){
        // Arrange
        gradingCalculator = new GradingCalculator(score,presence);

        // Act
        char gradGet = gradingCalculator.getGrade();

        // Assert
        Assertions.assertEquals(awaitedGrade,gradGet);
    }


    // ---------------------------- Sans répéter ----------------------------

//    @ParameterizedTest
//    @MethodSource("providerParameters")
//    public void whenScoreAndPresenceThenResultAwaitedGrade(int score,int presence, char awaitedGrade){
//        // Arrange
//        gradingCalculator = new GradingCalculator(score,presence);
//
//        // Act
//        char gradGet = gradingCalculator.getGrade();
//
//        // Assert
//        Assertions.assertEquals(awaitedGrade,gradGet);
//    }
//
//    private static Stream<Arguments> providerParameters(){
//        return Stream.of(
//                Arguments.of(95,90,'A'),
//                Arguments.of(85,90,'B'),
//                Arguments.of(65,90,'C'),
//                Arguments.of(95,65,'B'),
//                Arguments.of(95,55,'F'),
//                Arguments.of(65,55,'F'),
//                Arguments.of(50,90,'F')
//        );
//    }

}
