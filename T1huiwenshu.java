class Solution {
    public boolean isPalindrome(int x) {
        String str =Integer.toString(x);
        String reversedStr = "" ;
        for (int i = str.length()-1;i>=0;i--){
            reversedStr += str.charAt(i);

        }
        return str.equals(reversedStr);
    }

}