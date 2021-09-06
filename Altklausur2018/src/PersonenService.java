import java.util.HashSet;

public class PersonenService {

    Personen pers;

    public void createObject(String vorname, String nachname, int alter, HashSet<String> hobList) throws NoFreeTimeExcetion {
        pers = new Personen(vorname, nachname, alter, hobList);
    }

    public void printObject(){
        System.out.println("Vorname: " + pers.getVorname());
        System.out.println("Nachname: " + pers.getNachname());
        System.out.println("Vorname: " + pers.getAge());
        System.out.println("Hobbies: " + pers.getHobby());
        System.out.println();
    }
}
