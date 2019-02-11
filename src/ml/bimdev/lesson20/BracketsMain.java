package ml.bimdev.lesson20;

import java.util.Scanner;

public class BracketsMain {
    static char[] openBrackets = {'(', '{', '['};
    static char[] closeBrackets = {')', '}', ']'};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s == "" ? "{[7+5)*3+7]-10}/7" : s;

        System.out.println(isBracketsCorrect(s));
    }

    static boolean isBracketsCorrect(String str) {
        char[] symbols = str.toCharArray();
        Stack stack = new Stack(symbols.length);
        for (char c : symbols) {
            if (isInArray(openBrackets, c)) {
                stack.push(c);
            } else {
                if (c == ')' || c == '}' || c == ']') {
                    if (stack.isEmpty()) return false;
                    // todo: brackets checking
                }

            }
        }
        return false;
    }

    static boolean isInArray(char[] arr, char c) {
        for (char c1 : arr) {
            if (c1 == c) return true;
        }
        return false;
    }
}
