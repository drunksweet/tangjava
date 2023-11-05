public class longestCommonPrefix {
    class Solution {
        public String longestCommonPrefix(String[] strs) {

            int shortestIndex = 0; // 假设最短字符串的位置为0
            for (int i = 1; i < strs.length; i++) {
                if (strs[i].length() < strs[shortestIndex].length()) {
                    shortestIndex = i; // 更新最短字符串的位置
                }
            }
         /*if (Arrays.equals(strs[shortestIndex],new String[]{""})){
            return "";
        }
*/
            if (strs[shortestIndex].equals("")){
                return "";
            }

            int n = strs.length;
            if (n==1){
                return strs[0];
            }
            int b = 0;
            outerLoop:
            for (int i=0 ;i<strs[shortestIndex].length() ; i++){
                char a = strs[shortestIndex].charAt(i);
                for ( int j=0;j<n;j++){
                    if (a != strs[j].charAt(i)){
                        b=i;
                        break outerLoop;
                    }

                }

            }

            if (b == 0){
                return "";
            }else{
                return strs[shortestIndex].substring(0,b);
            }
        }
    }