import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> totalPlays = new HashMap<>();
        Map<String, List<int[]>> songInfo = new HashMap<>();
        for (int i = 0; i < genres.length; i++) {
            String genre = genres[i];
            int play = plays[i];
            totalPlays.put(genre, totalPlays.getOrDefault(genre, 0) + play);
            List<int[]> list = songInfo.getOrDefault(genre, new ArrayList<>());
            list.add(new int[]{i, play});
            songInfo.put(genre, list);
        }

        List<String> genreList = new ArrayList<>(totalPlays.keySet());
        Collections.sort(genreList, (a, b) -> totalPlays.get(b) - totalPlays.get(a));

        List<Integer> result = new ArrayList<>();
        for (String genre : genreList) {
            List<int[]> list = songInfo.get(genre);
            Collections.sort(list, (a, b) -> {
                if (a[1] == b[1]) {
                    return a[0] - b[0];
                }
                return b[1] - a[1];
            });

            result.add(list.get(0)[0]);
            if (list.size() > 1) {
                result.add(list.get(1)[0]);
            }
        }

        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }
}