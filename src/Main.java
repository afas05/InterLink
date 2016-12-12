/**
 * Created by User on 11.12.2016.
 */
public class Main {

    public static void main(String[] args) {

        ItCompany link = new InterLink();
        System.out.println(link.getName() + " " + link.getLocation() + " " + link.getWorkers());

        ItCompany anotherComp = new AnotherItCompany("AnotherComp", 12);
        System.out.println(anotherComp.getName() + " " + anotherComp.getLocation() + " " + anotherComp.getWorkers());
    }
}
