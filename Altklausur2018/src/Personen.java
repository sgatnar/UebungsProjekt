import java.util.HashSet;

public class Personen {

    private String vorname;
    private String nachname;
    private int alter;
    private HashSet<String> hobbylist;

    public Personen(String vorname, String nachname, int age, HashSet<String> hobbyList) throws NoFreeTimeExcetion {
        setVorname(vorname);
        setNachname(nachname);
        setAge(age);
        setHobby(hobbyList);
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) throws IllegalArgumentException {
        if (vorname == null) {
            throw new IllegalArgumentException("Bitte geben Sie einen Vornamen an!");
        } else {
            this.vorname = vorname;
        }
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) throws IllegalArgumentException {
        if (nachname == null) {
            throw new IllegalArgumentException("Bitte geben Sie einen Nachnamen an!");
        } else {
            this.nachname = nachname;
        }
    }

    public int getAge() {
        return alter;
    }

    public void setAge(int alter) throws IllegalArgumentException {
        if (alter <= 0 || alter >= 130) {
            throw new IllegalArgumentException("Bitte geben Sie ein Alter zwischen 0 und 130 an");
        } else {
            this.alter = alter;
        }
    }

    public void setHobby(HashSet<String> hobby) throws NoFreeTimeExcetion {
        if (hobby.size() > 5) {
            throw new NoFreeTimeExcetion();
        }
    }

    public HashSet<String> getHobby() {
        return hobbylist;
    }
}


