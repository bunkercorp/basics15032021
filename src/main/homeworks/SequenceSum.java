package main.homeworks;

public class SequenceSum {
    public static String showSequence(int value) {
        StringBuffer sb = new StringBuffer();
        int result = 0;
        for (int i = 0; i <= value; i ++){
            result += i;
            sb.append(i);
            if(i != value){
                sb.append("+");
            }
        }
        sb.append("=");
        sb.append(result);
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(showSequence(10));
    }
}
