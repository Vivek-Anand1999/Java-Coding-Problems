package Moolya;

import java.util.*;

public class AddNumberFromString {
    public static void main(String[] args) {
        String s = "123";
        int r = Integer.valueOf(s);
        String s2 = String.valueOf(r);
        System.out.println(s2);
        System.out.println(s2.getClass());
        System.out.println(r);
        String input = "03ju283st 8poi896y";
        input = input.replace(" ","");
        int result = add(input);
         System.out.println(result);

        HashSet<Integer> hashSet = new HashSet<>(20,0.75f);
        HashMap<String, Integer> group = new HashMap<>();
        System.out.println("xyz");

        String word = "i LOve my coding world love love";
        for(String ch : word.split(" ")){
            group.put(ch, group.getOrDefault(ch,0)+1);
        }
        group.put("a", null);

        Map<String,Integer> sync = Collections.synchronizedMap(new HashMap<>());
        System.out.println(group);
        System.out.println("xxxxxxxxxxxxxxx");
        for(Map.Entry<String,Integer> e : group.entrySet()){

            System.out.println(e.getKey() + " " + e.getValue());
        }
    }

    public static int add(String input){
        int sum=0;
        boolean flag = false;
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0;i<input.length();i++){
            if(Character.isDigit(input.charAt(i))){
                stringBuilder.append(input.charAt(i));
                flag = true;
            }else{
                if (flag) {
                    sum += Integer.parseInt(stringBuilder.toString());
                    stringBuilder.delete(0,stringBuilder.length());
                    flag = false;
                }
            }
        }
        return sum;
    }
}
