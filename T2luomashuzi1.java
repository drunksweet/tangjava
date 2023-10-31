import java.util.HashMap;
public class T2luomashuzi1 {
    class Solution1 {
        public int romanToInt(String s) {
            int sum = 0;
            String cup = "" + s.charAt(0);
            String a="";
            int partsum = 0;
            HashMap<String, Integer> dictionary = new HashMap<>();
            dictionary.put("I",1);
            dictionary.put("V",5);
            dictionary.put("X",10);
            dictionary.put("L",50);
            dictionary.put("C",100);
            dictionary.put("D",500);
            dictionary.put("M",1000);

            for(int i =1;i<s.length();i++){
                cup+=s.charAt(i);
                if(dictionary.get( cup.charAt(i-1))<dictionary.get(cup.charAt(i)) && i<s.length()-1){
                    continue;
                }else if (dictionary.get (cup.charAt(i-1))==dictionary.get (cup.charAt(i)) && i<s.length()-1){
                    continue;
                }else if (dictionary.get (cup.charAt(i-1))==dictionary.get (cup.charAt(i)) && i>=s.length()-1){
                    for (int j = 0 ; j < cup.length(); j++){
                        sum+=dictionary.get(cup.charAt(j));
                        cup="";
                    }
                }else {
                    a= ""+cup.charAt(cup.length()-1);
                    partsum=dictionary.get(cup.charAt(cup.length()-2));
                    for (int j =cup.length()-3; j>=0;j--){
                        partsum-=dictionary.get(cup.charAt(j));
                    }
                    sum+=partsum;
                    cup=a ;
                }

            }
            return sum;

        }

    }
}
