package Ex1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GetGrade {

    private GradingCalculator gradingCalculator;

    @Test
    public void testScorePresenceWhenScore_95_Presence_90() {
        // Arrange
        gradingCalculator = new GradingCalculator(95, 90);
        char resultAwait = 'A';

        // Act
        char result = gradingCalculator.getGrade();
        System.out.println(result);

        // Assert
        Assertions.assertEquals(resultAwait, result);
    }


    @Test
    public void testScorePresenceWhenScore_85_Presence_90() {
        // Arrange
        gradingCalculator = new GradingCalculator(85, 90);
        char resultAwait = 'B';

        // Act
        char result = gradingCalculator.getGrade();
        System.out.println(result);

        // Assert
        Assertions.assertEquals(resultAwait, result);
    }


    @Test
    public void testScorePresenceWhenScore_65_Presence_90() {
        // Arrange
        gradingCalculator = new GradingCalculator(65, 90);
        char resultAwait = 'C';

        // Act
        char result = gradingCalculator.getGrade();
        System.out.println(result);

        // Assert
        Assertions.assertEquals(resultAwait, result);
    }


    @Test
    public void testScorePresenceWhenScore_95_Presence_65() {
        // Arrange
        gradingCalculator = new GradingCalculator(95, 65);
        char resultAwait = 'B';

        // Act
        char result = gradingCalculator.getGrade();
        System.out.println(result);

        // Assert
        Assertions.assertEquals(resultAwait, result);
    }


    @Test
    public void testScorePresenceWhenScore_95_Presence_55() {
        // Arrange
        gradingCalculator = new GradingCalculator(95, 55);
        char resultAwait = 'F';

        // Act
        char result = gradingCalculator.getGrade();
        System.out.println(result);

        // Assert
        Assertions.assertEquals(resultAwait, result);
    }


    @Test
    public void testScorePresenceWhenScore_65_Presence_55() {
        // Arrange
        gradingCalculator = new GradingCalculator(65, 55);
        char resultAwait = 'F';

        // Act
        char result = gradingCalculator.getGrade();
        System.out.println(result);

        // Assert
        Assertions.assertEquals(resultAwait, result);
    }


    @Test
    public void testScorePresenceWhenScore_50_Presence_90() {
        // Arrange
        gradingCalculator = new GradingCalculator(50, 90);
        char resultAwait = 'F';

        // Act
        char result = gradingCalculator.getGrade();
        System.out.println(result);

        // Assert
        Assertions.assertEquals(resultAwait, result);
    }

}
