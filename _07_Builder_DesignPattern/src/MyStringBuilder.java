import java.util.ArrayList;

public class MyStringBuilder {
    ArrayList<Character> characters = new ArrayList<>();


    public MyStringBuilder append(String s){
        for(char c: s.toCharArray()){
            characters.add(c);
        }

        return this;
    }

    public MyStringBuilder append(char c){
        characters.add(c);
        return this;
    }
}
