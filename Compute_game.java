
import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {

        Scanner read=new Scanner(System.in);
     
        int lucky_number,play_times,remainder;
        int total_score=0;
        final int secret_number=4;

        System.out.println("How many rounds do you want to play?");
        play_times=read.nextInt();

        for (int i=0;play_times>i;){
            System.out.println("What is your lucky number?");
            lucky_number=read.nextInt();
            remainder=(lucky_number%secret_number);

            if (remainder==0){
                total_score++;

                if (total_score>0){
                    System.out.println("You have won");
                }
                else {
                    System.out.println("You have lost");
                }
                System.out.println("Your total score is:"+total_score);
            }
            else if ((remainder%2)==0){
                total_score=+3;

                if (total_score>0){
                    System.out.println("You have won");
                }
                else {
                    System.out.println("You have lost");
                }
                System.out.println("Your total score is:"+total_score);
            }
            else if ((remainder%2)!=0){
                total_score-=3;

                if (total_score>0){
                    System.out.println("You have won");
                }
                else {
                    System.out.println("You have lost");
                }
                System.out.println("Your total score is:"+total_score);
            }

            play_times--;
        }




    }
}
