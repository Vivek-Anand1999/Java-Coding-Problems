package StringPro;

public class StringDigitAdd {
    public static void main(String[] args) {
        String input = " vb12jh8 hg52oy";
        input = input.trim().replace(" ", "");
        StringBuilder stringBuilder = new StringBuilder();
        int sum = 0;
        boolean flag = false;
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                stringBuilder.append(input.charAt(i));
                flag = true;
            }else{
                if(flag){
                    String s = stringBuilder.toString();
                    int value = Integer.parseInt(s);
                    sum += value;
                    stringBuilder.delete(0,stringBuilder.length());
                    flag = false;
                }
            }
        }
        System.out.println(sum);
    }

}
