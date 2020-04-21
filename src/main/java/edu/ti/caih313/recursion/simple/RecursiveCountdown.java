package edu.ti.caih313.recursion.simple;

public class RecursiveCountdown {
    public static void main(String[] args) {
        countDown(3);
    }

    public static void countDown(int num) {
        if (num == 0) {
            System.out.println("That's all, folks!");
        } else {
            System.out.print(num + " ");
            countDown(num - 1);
        }
    }
}
