class StringToIntegerAOI {
    public static int myAtoi(String s) {
        s = s.trim();
        int sign = 1;
        int num = 0;
        for( int j = 0; j < s.length(); j ++)
        {
            if(!Character.isDigit(s.charAt(j))){
                if(j == 0 && (s.charAt(j) == '-' || s.charAt(j) == '+')){
                    if(s.charAt(j) == '-'){
                        sign = -1;
                    }
                }
                else{
                    break;
                }
            }
            else{
                int digit = s.charAt(j) - '0';
                System.out.println( j + " : " + digit);

                if(num > Integer.MAX_VALUE / 10 || (num == Integer.MAX_VALUE / 10 && digit > 7)){
                    return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }

                num = num * 10 + digit;
            }
        }
        return  num * sign;   
    }

    public static void main(String[] args) throws Exception {
        String s1 = "42";
        System.out.println(myAtoi(s1));
        System.out.println();


        String s2 = "   -042";
        System.out.println(myAtoi(s2));
        System.out.println();

        String s3 = "1337c0d3";
        System.out.println(myAtoi(s3));
        System.out.println();

        String s4 = "0-1";
        System.out.println(myAtoi(s4));
        System.out.println();

        String s5 = "words and 987";
        System.out.println(myAtoi(s5));
        System.out.println();
    }
}

/*

-> remove whitespace

-> sign

-> leading zeroes

-> conclude the int value after it is trailled by char

//remove whitespace, leading zero = s.trim()

//


*/