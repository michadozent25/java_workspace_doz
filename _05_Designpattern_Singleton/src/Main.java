import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Singleton s= Singleton.getInstance();
        s.andereMethode();


        HashMap<String,String> map = new HashMap<>();

        map.put("rot","#ff0000");
        map.put("grün","#00ff00");

        System.out.println(map.get("rot"));



    }
}