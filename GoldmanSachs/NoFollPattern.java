//User function Template for Java
class Solution{
    static String printMinNumberForPattern(String S){
        int n = S.length();
        int current = 1;
        int i = 0;
        StringBuilder ans = new StringBuilder();
        ans.append('1');
        while (i < n) {
            if (S.charAt(i) == 'D') {
                int j = i;
                while (j < n && S.charAt(j) == 'D') {
                    j++;
                }
                int no_of_D = j - i;
                current += no_of_D;
                ans.setCharAt(i, (char)(current + '0'));
                int count = current;
                while (i != j) {
                    count--;
                    ans.append((char)(count + '0'));
                    i++;
                }
            } else {
                current++;
                ans.append((char)(current + '0'));
                i++;
            }
        }
        return ans.toString();
    }
}
