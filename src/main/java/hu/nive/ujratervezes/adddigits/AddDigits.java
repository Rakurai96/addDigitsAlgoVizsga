package hu.nive.ujratervezes.adddigits;

public class AddDigits {

    public int addDigits(String input) {
        if(input == null) {
            return -1;
        }
        if(input.isEmpty()) {
            return -1;
        }

        int sum = 0;
        for(int i = 0; i < input.length(); i++) {
            if(Character.isDigit(input.charAt(i))) {
                int num = Integer.parseInt(input.substring(i, i + 1));
                sum += num;
            }
        }

        return sum;
    }
}
