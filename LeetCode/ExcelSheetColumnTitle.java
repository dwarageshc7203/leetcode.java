public class ExcelSheetColumnTitle {
    public static String convertToTitle(int columnNumber) {
        String s = "";
        while(columnNumber > 0){
            columnNumber --;
            char c = (char)((columnNumber % 26) + 'A');
            s= c + s;
            columnNumber = columnNumber/26;
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(convertToTitle(28));

    }
}   
