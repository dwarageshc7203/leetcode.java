// class Solution {
public class q2976{
    public long minimumCost(String source, String target, char[] original, char[] changed, int[] cost) {
        int minCost = 0;

        for ( int i = 0; i < source.length(); i++)
        {
            if(  source.charAt(i) != target.charAt(i))
            {
                int var = 0;
                while (var < original.length)
                {
                    if( source.charAt(i) == original[var] && target.charAt(i) == changed[var])
                    {
                        minCost = minCost + cost[var];
                    }
                }
            }
        }
        if( minCost == 0){
            return -1;
        }
        return minCost;
    }
}