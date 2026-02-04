// class Solution {
class q67{
    public static String addBinary(String a, String b) {

        int carry = 0;
        int total = 0;
    
        StringBuilder sb = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        while ( i >= 0 || j >= 0 ){
            int aInt = (i >= 0 && i < a.length()) ? a.charAt(i) - '0' : 0;
            int bInt = (j >= 0 && j < b.length()) ? b.charAt(j) - '0' : 0;

            total = aInt + bInt + carry;
            int resultBit = total % 2;
            carry = total / 2;
            System.out.println("total: " + total + ", resultBit: " + resultBit + ", carry: " + carry);

            sb.insert(0, resultBit);

            i--;
            j--;
        }
        System.out.println("total: " + total + /* ", resultBit: " + resultBit +  */", carry: " + carry);
        if ( carry == 1){
            sb.insert( 0 , 1);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        System.out.println(addBinary(a, b));
    }
}