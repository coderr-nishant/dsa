/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low=1,high=n;
        int mid=0;
        while(low<=high){
             mid=low+(high-low)/2;
            if(isBadVersion(mid)==true){
                if(isBadVersion(mid)==true&&high==low){
                    break;
                }
                if(isBadVersion(mid)==true){
                    high=mid;
                }

            } else if(isBadVersion(mid)==false){
                low=mid+1;
            }
        }
        return mid;
    }
}