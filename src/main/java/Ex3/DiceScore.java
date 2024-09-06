package Ex3;

/*
Le but de l'exercice est de réaliser des tests unitaires de la classe suivante en mockant l'interface Ide.

- Lorsque les 2 dés sont identiques, on récupère bien la valeur du dé * 2 + 10
- Dans le cas où les 2 dés sont identiques et égaux a 6 on récupère 30.
- Dans le cas où les dés sont quelconques, on récupère la valeur du plus haut des deux.
*/

public class DiceScore {

    private Ide de;

    public DiceScore(Ide de) {
        this.de = de;
    }

    public int getScore() {
        int scoreFirst = de.getRoll();
        int scoreSecond = de.getRoll();

        if (scoreFirst == scoreSecond) {
            if (scoreFirst == 6) {
                return 30;
            }
            return scoreFirst*2 + 10;

            /*
            Si 1 : 1x2+10 = 12
            Si 2 : 2x2+10 = 14
            Si 3 : 3x2+10 = 16
            Si 4 : 4x2+10 = 18
            Si 5 : 5x2+10 = 20
            Si 6 : 30
            */
        }
        else {
            return scoreFirst < scoreSecond ? scoreSecond : scoreFirst;
        }
    }

}
