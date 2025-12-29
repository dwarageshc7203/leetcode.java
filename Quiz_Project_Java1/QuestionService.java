package Quiz_Project_Java1;

import java.util.Scanner;

public class QuestionService {

    Scanner scanner = new Scanner(System.in);

    Questions[] questions = new Questions[5];

    //constructor
    public QuestionService(){
        questions[0] = new Questions(1, "Who is CNL", "CNL", "BNL", "BNL", "BNL", "CNL");
        questions[1] = new Questions(2, "Who is CNL", "CNL", "BNL", "BNL", "BNL", "CNL");
        questions[2] = new Questions(3, "Who is CNL", "CNL", "BNL", "BNL", "BNL", "CNL");
        questions[3] = new Questions(4, "Who is CNL", "CNL", "BNL", "BNL", "BNL", "CNL");
        questions[4] = new Questions(5, "Who is CNL", "CNL", "BNL", "BNL", "BNL", "CNL");
    }    

    public boolean checkAnswer(int qNo, String ans){

        if(questions[qNo].getAns().equals(ans)){
            return true;
        }
        return false;
    }

    public void displayQuestions(){

        int score = 0;
        int num = 0;

        while(num < 5){
            System.out.println("Question:");
            System.out.println(questions[num].getQuestion());
            System.out.println(questions[num].getO1());
            System.out.println(questions[num].getO2());
            System.out.println(questions[num].getO3());
            System.out.println(questions[num].getO4());
            System.out.println("Enter the right answer: ");
            String qAnswer = scanner.nextLine();
            
            if(checkAnswer(num, qAnswer)){
                score += 1;
            }
            num += 1;

            System.out.println("Your current score is " + score + "/5");

            System.out.println("What is the full use of documenting all these?");
            System.out.println("Am really trying my best to motivate myself into thinking that I would be of very great help to whatever I collaborate with");
        }
    }    

    public void startQuiz(){

    }

}
