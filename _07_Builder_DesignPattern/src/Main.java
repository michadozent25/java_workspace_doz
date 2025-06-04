import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        StringBuilder stringBuilder = new StringBuilder("Hallo");
        stringBuilder.
                append("guten Tag!").
                append("noch was").
                append(324423);//

        System.out.println(stringBuilder);

        MyStringBuilder myStringBuilder = new MyStringBuilder();
        myStringBuilder.
                append('c').
                append("dsfsdf").
                append("gddfgdfgdf");





    }
}