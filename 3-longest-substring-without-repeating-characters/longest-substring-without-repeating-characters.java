class Solution {
    public int lengthOfLongestSubstring(String s) {
        int k=0,j=0,size=0,sum=0;
        HashMap<Character,Integer> map=new HashMap<>();
       while(j<s.length()){
            char ch=s.charAt(j);
            if(!map.containsKey(ch)){
                map.put(ch,1);
                j++;
                size++;
            } else {
               if(sum<size){
                sum=size;
               }   
               while(map.containsKey(ch)){
                map.remove(s.charAt(k));
                size--;
                k++;
               }
            }
        }
        if(sum<size){
                sum=size;
               } 
        return sum;
    }
}