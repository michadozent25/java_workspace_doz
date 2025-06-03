//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static int count=0;
    public static void go(){
        if(count >=100) return;//Abbruchbedingung
        count++;
        System.out.println(count);
        go();
    }

    public static void go2(){
       while (true) {
           if(count >=100) return;
           count++;
           System.out.println(count);
       }

    }
    public static void main(String[] args) {
        go();
    }
}