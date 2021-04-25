package homeworks;

public class SequenceSum {
    public static String showSequence(int value) {
        StringBuffer sb = new StringBuffer();
        int result = 0;
        for (int i = 0; i <= value; i++) {
            result += i;
            sb.append(i);
            if (i != value) {
                sb.append("+");
            }
        }
        // внимательнее ;)
        sb.append(" = ");
        sb.append(result);
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(showSequence(10));
        // не работает
        System.out.println(showSequence(-10));
        System.out.println(showSequence(0));
    }
}
