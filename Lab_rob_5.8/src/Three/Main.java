package Three;

public class Main {
    public static void main(String[] args) {
        String direction = "Вниз";
        int poverh = 4;
        if (direction == "Вгору") {
            if (poverh == 1) {
                System.out.println(" 1 поверх");}
            if (poverh == 2) {
                System.out.println(" 3 поверх");}
            if (poverh == 3) {
                System.out.println(" 3 поверх");}
            if (poverh == 4) {
                System.out.println(" 4 поверх");}
            if (poverh == 5) {
                System.out.println(" 5 поверх");}
            if (poverh == 6) {
                System.out.println("Ви піднялись на 6 поверх");}
            if (poverh == 7) {
                System.out.println(" 7 поверх");}
            if (poverh == 8) {
                System.out.println(" 8 поверх");}
            if (poverh == 9) {
                System.out.println(" 9 поверх");}
        }
        if (direction == "Вниз") {
            if (poverh == 9) {
                System.out.println(" 9 поверх");}
            if (poverh == 8) {
                System.out.println(" 8 поверх");}
            if (poverh == 7) {
                System.out.println(" 7 поверх");}
            if (poverh == 6) {
                System.out.println(" 6 поверх");}
            if (poverh == 5) {
                System.out.println(" 5 поверх");}
            if (poverh == 4) {
                System.out.println(" 4 поверх");}
            if (poverh == 3) {
                System.out.println(" 3 поверх");}
            if (poverh == 2) {
                System.out.println(" 1 поверх");}
            if (poverh == 1) {
                System.out.println(" 1 поверх");}
            // якщо робити щоб користувач водив поверх то додати ще
            //  else {
            //     System.out.print("Ви вказали неіснуючий поверх");}
        }
    }
}