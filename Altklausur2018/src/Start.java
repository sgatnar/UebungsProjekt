import java.util.HashSet;

public class Start {

    private static HashSet<Hobby> list;

    public static void main(String[] args) throws NoFreeTimeExcetion {

        list = new HashSet<>();
        list.add(Hobby.HANDBALL);
        list.add(Hobby.TENNIS);

        PersonenService personenService = new PersonenService();
        for (Hobby hob : list){
            System.out.println(hob);
        }
        personenService.createObject("Sven", "Gatnar", 24, null);
        personenService.printObject();

    }
}
