package main.homeworks;

public class JadenCase {
    public static String toJadenCase(String phrase) {
        StringBuffer sb = new StringBuffer();
        boolean ram = false;
        for (int i = 0; i < phrase.length(); i++) {
            char s = phrase.charAt(i);
            if (s == ' ') {
                sb.append(s);
                ram = true;
            } else if (ram == true) {
                sb.append(Character.toUpperCase(s));
                ram = false;
            } else {
                sb.append(s);
            }
        }
        return String.valueOf(sb);
    }

    public static void main(String[] args) {
        System.out.println(toJadenCase("How can mirrors be real if our eyes aren't real"));
    }
}