import java.util.regex.Pattern;

public class MyUtilities implements IUtilities {

    @Override
    public int checkNumber(String s) {
        
        Pattern check;
        check = Pattern.compile("^[0-9]+$");
       
        if (check.matcher(s).find()) {
            int num = Integer.parseInt(s);
            return num * num;
        } else {
            return s.length();
        }

    }

    @Override
    public int sumNumber(String s) {
        String temp = "0";
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {

                temp += ch;
                int num = Integer.parseInt(temp);
                sum += num;
                temp = "";
            }
        }
        return sum;
    }

}
