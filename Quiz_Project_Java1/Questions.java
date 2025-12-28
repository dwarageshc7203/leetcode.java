package Quiz_Project_Java1;

public class Questions {
    
    //this is Question class

    private int qNo;
    private String question;
    private String o1;
    private String o2;
    private String o3;
    private String o4;
    private String ans;
    
    //constructor

    public Questions(int qNo, String question, String o1, String o2, String o3, String o4, String ans) { 
        this.qNo = qNo;
        this.question = question;
        this.o1 = o1;
        this.o2 = o2;
        this.o3 = o3;
        this.o4 = o4;
        this.ans = ans;
    }

    //getters and setters

    public int getqNo() {
        return qNo;
    }

    public void setqNo(int qNo) {
        this.qNo = qNo;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getO1() {
        return o1;
    }

    public void setO1(String o1) {
        this.o1 = o1;
    }

    public String getO2() {
        return o2;
    }

    public void setO2(String o2) {
        this.o2 = o2;
    }

    public String getO3() {
        return o3;
    }

    public void setO3(String o3) {
        this.o3 = o3;
    }

    public String getO4() {
        return o4;
    }

    public void setO4(String o4) {
        this.o4 = o4;
    }

    public String getAns() {
        return ans;
    }

    public void setAns(String ans) {
        this.ans = ans;
    }

    @Override
    public String toString() {
        return "Question{" +
                "qNo=" + qNo +
                ", question='" + question + '\'' +
                ", o1='" + o1 + '\'' +
                ", o2='" + o2 + '\'' +
                ", o3='" + o3 + '\'' +
                ", ot4='" + o4 + '\'' +
                ", ansr='" + ans + '\'' +
                '}';
    }

    
}
