class Solution {
/*     public  int value(char a) {
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

    } */
    public String intToRoman(int num) {
        int[] value = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] letter = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

        int length = String.valueOf((num)).length();
        StringBuilder roman = new StringBuilder();
        for ( int i = 0; i< value.length; i++){
            while( num >= value[i]){
                roman.append(letter[i]);
                num = num - value[i];
            }
        }
        String ans = String.valueOf(roman);

        return ans;
    }

    public static void main(String [] args){
        Solution obj = new Solution();
        int num= 3749;
        System.out.println(obj.intToRoman(num));
    }
    
}