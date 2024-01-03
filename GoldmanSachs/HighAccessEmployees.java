class Solution {
    public List<String> findHighAccessEmployees(List<List<String>> access_times) {
        List<String> ans = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();

        for(List<String> i: access_times){
            String emp = i.get(0);
            String acc = i.get(1);

            if (!map.containsKey(emp)){
                map.put(emp, new ArrayList<>());
            }
            map.get(emp).add(acc);
        }

        for(String emp: map.keySet()){
            List<String> x = map.get(emp);
            int m = x.size();
            if(m < 3){
                continue;
            }
            int[] t = new int[m];
            for(int j = 0; j < m; j++){
                String s = x.get(j);
                t[j] = ((s.charAt(0) - '0') * 10 + s.charAt(1) - '0') * 60 + (s.charAt(2) - '0') * 10 + s.charAt(3) - '0';
            }
            Arrays.sort(t);

            for (int a = 0, b = 2; b < m; ++a, ++b) {
                if ((t[b] - t[a]) < 60) {
                    ans.add(emp);
                    break;
                }
            }
        }
        return ans;
    }
}
