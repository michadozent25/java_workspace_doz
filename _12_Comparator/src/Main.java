import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//class MyComparator implements Comparator<String>{
//
//    @Override
//    public int compare(String s1, String s2) {
//        return s1.toLowerCase().compareTo(s2.toLowerCase());
//    }
//}

class User implements Comparable<User>{
    private int alter;
    private String namen;

    public User(int alter, String namen) {
        this.alter = alter;
        this.namen = namen;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public String getNamen() {
        return namen;
    }

    public void setNamen(String namen) {
        this.namen = namen;
    }

    @Override
    public String toString() {
        return "User{" +
                "alter=" + alter +
                ", namen='" + namen + '\'' +
                '}';
    }

    @Override
    public int compareTo(User o) {
//        if(this.getAlter() < o.getAlter()){
//            return -1;
//        }
        return this.getAlter() - o.getAlter();
    }
}
public class Main {


    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Max");
        list.add("Otto");
        list.add("anna");
        list.add("bert");

        list.sort((s1,s2)->s1.toLowerCase().compareTo(s2.toLowerCase()));

      //  Collections.sort(list);

        System.out.println(list);

        ArrayList<User> users = new ArrayList<>();
        users.add(new User(34,"Max"));
        users.add(new User(14,"Otto"));
        users.add(new User(31,"Ina"));
        users.add(new User(18,"Anna"));
        Collections.sort(users);

        System.out.println(users);
    }
}
