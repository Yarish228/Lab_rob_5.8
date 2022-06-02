package Two;

public class Main {
    public static void main (String[] args){
        int a, b, c, d, x;;
        x = 123;
        a = x / 100;
        b = x / 10 % 10;
        c = x % 100 % 10;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        if (a>b){
            if (a>c){ System.out.println("Найбільше число : "+a); }
            else{ System.out.println("Найбільше число : "+c); }
        }
        else if (b>c){ System.out.println("Найбільше число : "+b); }
        else{ System.out.println("Найбільше число : "+c); }
    }
}