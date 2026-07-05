class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] indegree  = new int[n+1];
        int[] outdegree = new int[n+1];

        for( int[] x : trust){
            outdegree[x[0]]++;
            indegree[x[1]]++;
        }
        for(int i=1; i<=n; i++){
            if(indegree[i]==n-1 && outdegree[i]==0) return i;
        }
        return -1;

        
    }
}