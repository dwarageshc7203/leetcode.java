class StringToIntegerAOI {
    public static int myAtoi(String s) {
        s = s.trim();
        StringBuilder sb = new StringBuilder(s);
        boolean letter = false;

        int i = 0;
        while( i < sb.length() && letter == false){
            if(sb.charAt(i) == '+'){
                sb.deleteCharAt(i);
            }

            if( i > 0 && Character.isDigit(sb.charAt(i-1))){
                letter = Character.isDigit(sb.charAt(i));
            }

            else if(!Character.isDigit(sb.charAt(i))){
                sb.deleteCharAt(i);
            }
            System.out.println(i + " : " + sb); 
            i++; 
        }
        String str = sb.toString();
        int val = 0;
        val = val + Integer.valueOf(str);
        return  val;
    }

    public static void main(String[] args) throws Exception {
        String s = "words";
        System.out.println(myAtoi(s));
    }
}