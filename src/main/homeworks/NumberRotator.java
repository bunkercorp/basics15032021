package main.homeworks;

public class NumberRotator {
        public static long rotate (long n) {
            String num = String.valueOf(n);
            for (int i = 0; i < num.length() - 1; i++) {
                num = num.substring(0, i) +
                        num.substring(i + 1) +
                        num.charAt(i);

                if (Long.parseLong(num) > n) {
                    n = Long.parseLong(num);
                }
            }
            return n;
        }

     public static void main(String[] args) {
         System.out.println(rotate(56789));
     }
    }

