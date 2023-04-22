class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean visited [] = new boolean[n];
        
        for(int i=0;i<n;i++){
            if(!visited[i]){
                dfs(i,computers,visited);
                answer++;
            }
            
        }
        
        return answer;
    }
    
    public void dfs(int visit , int[][] computers , boolean[] visited){
        visited[visit]=true;
        
        for(int i=0; i<computers.length; i++){
            if(computers[visit][i]==1 && visited[i]==false){
                visited[i]=true;
                dfs(i,computers,visited);
            }
            
        }
    }
}