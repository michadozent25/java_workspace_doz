import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ListFactory {


    public static <T> List<T> create(String t){
        if(t.equalsIgnoreCase("a")){
            return new ArrayList<>();
        }else if(t.equalsIgnoreCase("v")){
            return new Vector<>();// Thread-Sicher
        }

        return null;
    }
}
