class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashMap<Integer, Boolean> map = new HashMap<>();
        for(int n : nums){
            map.put(n,false);
        }
        int max = 0;
        for(int n : map.keySet()){
            int count = 1;
            if(map.get(n)==true) continue;
            map.put(n,true);
            int temp = n;
            int temp2 = n;
            while(true){   
                if(map.containsKey(temp+1)){
                    map.put(temp+1,true);
                    count++;
                    temp=temp+1;
                }
                else if(map.containsKey(temp2-1)){
                    map.put(temp2-1,true);
                    count++;
                    temp2 = temp2-1;
                }
                else{
                    break;
                }  
            }
            max = Math.max(count,max);
        }
        return max;
    }
}
