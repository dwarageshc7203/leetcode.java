class Solution {
    public  int value(char a) {
        if (a == 'I') {
            return 1;
        } else if (a == 'V') {
            return 5;
        } else if (a == 'X') {
            return 10;
        } else if (a == 'L') {
            return 50;
        } else if (a == 'C') {
            return 100;
        } else if (a == 'D') {
            return 500;
        } else if (a == 'M') {
            return 1000;
        } else {
            return 0;
        }
        }
    public int romanToInt(String s) {
        int answer = 0;
        for ( int i = 0; i < s.length(); i++){
            char a = s.charAt(i);
            if( i < s.length() - 1 && value(a) < value(s.charAt( i +1))) {
                answer += value(s.charAt( i +1)) - value (a);
                i++;
            }
            else{
                answer += value( a );
            }
        }
        return answer;
    }

    public static void main( String [] args){
        Solution obj = new Solution();
        String s = "MCMXCIV";
        System.out.println(obj.romanToInt(s));

    }
}