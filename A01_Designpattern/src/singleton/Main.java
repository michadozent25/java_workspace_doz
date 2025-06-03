package singleton;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ConfigurationManager cm=   ConfigurationManager.getInstance();
        cm.setProperty("breite","20px");
        cm.setProperty("höhe","100px");

        System.out.println(cm.getProperty("breite"));

        cm.printAllProperties();
    }
}