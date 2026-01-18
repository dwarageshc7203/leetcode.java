import java.util.ArrayList;
import java.util.List;

public class q4 {
//public class Solution{
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List <Integer> list = new ArrayList();
        for( int a : nums1){
            list.add(a);
        }
        for( int b : nums2){
            list.add(b);
        }

        list.sort(null);
        System.out.println(list);
        double d;
        int len = list.size();

        if(len % 2 == 1){
            d = (double) (list.get(len/2));
        }

        else{
            System.out.println("else part");

            System.out.println(len);

            System.out.println(list.get( (len/2)) - 1);
            System.out.println(list.get( (len/2) ) );
            double one = list.get( (len/2) - 1);
            System.out.println(one);

            double two = list.get( (len/2) );
            System.out.println(two);
            
            d = ( one + two ) / 2;
            // d = (double)( ((list.get(len/2)) + (list.get( (len/2) + 1) )) / 2 );
        }



        return d;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,3};
        int[] nums2 = {2};

        int[] nums3 = {1,2};
        int[] nums4 = {3, 4};

        System.out.println(findMedianSortedArrays(nums1, nums2));
        System.out.println(findMedianSortedArrays(nums3, nums4));
    }
}
