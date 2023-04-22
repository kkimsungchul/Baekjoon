import java.util.*;

class Solution {
    public String[] solution(String[][] tickets) {
        List<String> result = new ArrayList<>();
        String[] answer = new String[tickets.length+1];
        String startAirport = "ICN";
        ArrayList<String[]> ticketList = new ArrayList<>(Arrays.asList(tickets));
        Collections.sort(ticketList, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return o1[1].compareTo(o2[1]);
            }
        });
        dfs(result ,startAirport , ticketList);
        return result.toArray(new String[0]);
    }
    
    public boolean dfs(List<String> result , String startAirport , ArrayList<String[]> ticketList){
        if(ticketList.size() == 0){
            result.add(startAirport);
            return true;
        }
        for(int i=0; i<ticketList.size(); i++){
            if(ticketList.get(i)[0].equals(startAirport)){
                String nextAirport = ticketList.get(i)[1];
                ticketList.remove(i);
                result.add(startAirport);
                if(dfs(result, nextAirport, ticketList)){
                    return true;
                }
                result.remove(result.size()-1);
                ticketList.add(i, new String[]{startAirport, nextAirport});
            }
        }
        return false;
    }
}
