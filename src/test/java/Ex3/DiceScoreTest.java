package Ex3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


public class DiceScoreTest {

    private DiceScore diceScore;
    private Ide de = Mockito.mock(Ide.class);

    @Test
    public void testWhen_two_dice_equals_Then_get_value_x2_plus_10() {
        // Arrange
        diceScore = new DiceScore(de);

        // Act
        int result =  diceScore.getScore();
        System.out.println(result);

        int result2 =  diceScore.getScore();
        System.out.println(result2);

        // Assert
        Assertions.assertEquals(result2, result);
    }

}
