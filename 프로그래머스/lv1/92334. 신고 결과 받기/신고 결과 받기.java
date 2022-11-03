import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        //신고 당한 횟수
        HashMap<String,Integer> reportCountMap = new HashMap<String,Integer>();
        //신고한 유저 목록
        HashMap<String,HashSet<String>> reportUserMap = new HashMap<String,HashSet<String>>();
        //정지먹은 유저목록
        ArrayList<String> stopUser = new ArrayList<String>();

        //신고당한횟수, 신고한유저목록 초기 세팅
        for(String name : id_list){
            HashSet<String> tempHashSet = new HashSet<String>();
            reportCountMap.put(name,0);
            reportUserMap.put(name,tempHashSet);
        }

        //report로 신고당한 횟수, 신고한 유저목록에 데이터 추가
        for(String repo : report){
            String [] slpitString = repo.split(" ");
            
            //중복 신고 방지
            if(!reportUserMap.get(slpitString[0]).contains(slpitString[1])){
                //신고한 유저목록 추가
                reportUserMap.get(slpitString[0]).add(slpitString[1]);
                //신고당한 횟수 추가
                reportCountMap.put(slpitString[1],reportCountMap.get(slpitString[1])+1);
            }

        }

        //k 번이상 신고된 유저목록
        for(int i=0;i<id_list.length;i++){
            if(reportCountMap.get(id_list[i])>=k){
                stopUser.add(id_list[i]);
            }
        }



        for(int i=0;i<id_list.length;i++){
            for(int j=0;j<stopUser.size();j++){
                if(reportUserMap.get(id_list[i]).contains(stopUser.get(j))){
                    answer[i] +=1;
                }
            }

        }
        return answer;
    }
}