package Quiz_Project_Java1;

public class QuestionService {

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

        if(questions[qNo].getAns() == ans){
            return true;
        }
        return false;
    }

    public void displayQuestions(){

        System.out.println(questions[0]);
        for( Questions q : questions){
            System.out.println(q.toString());
        }
    }    

    public void startQuiz(){
        
    }

}
