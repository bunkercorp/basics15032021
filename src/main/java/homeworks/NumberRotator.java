package homeworks;

public class NumberRotator {
    public static long rotate(long n) {
        String num = String.valueOf(n);
        for (int i = 0; i < num.length() - 1; i++) {
            num = num.substring(0, i) +
                    num.substring(i + 1) +
                    num.charAt(i);
/*
// ты два раза заставляешь процессор исполнить одно и то же вычисление.
final long currVal =Long.parseLong(num);
    if ( currVal > n){
                   n = currVal;
                }
 */
            if (Long.parseLong(num) > n) {
                // в общем случае нужно очень осторожно менять значение входного параметра. Для примитивов, впрочем, некритично.
                n = Long.parseLong(num);
            }
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println(rotate(56789));
       // не работает =)
        System.out.println(rotate(-56789));
    }
}

