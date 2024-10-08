package Ex1;

/*
Les scénarios de tests :

Score : 95%, Présence : 90 => Note: A
Score : 85%, Présence : 90 => Note: B
Score : 65%, Présence : 90 => Note: C
Score : 95%, Présence : 65 => Note: B
Score : 95%, Présence : 55 => Note: F
Score : 65%, Présence : 55 => Note: F
Score : 50%, Présence : 90 => Note: F
*/

public class GradingCalculator {

    // ----- Propriétés -----

    public int score;
    public int attendancePercentage;


    // ----- Constructeur -----

    public GradingCalculator(int score, int attendancePercentage) {
        this.score = score;
        this.attendancePercentage = attendancePercentage;
    }


    // ----- Méthodes -----

    public char getGrade() {
        if(score > 90 && attendancePercentage > 70) return 'A';
        else if(score > 80 && attendancePercentage > 60) return  'B';
        else if (score > 60 && attendancePercentage > 60) return  'C';
        else return 'F';
    }

}