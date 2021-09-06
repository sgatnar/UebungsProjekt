public class CoronaTest {

    private String vorname;
    private String nachname;
    private Testergebnis testergebnis;

    public CoronaTest(String vorname, String nachname, Testergebnis testergebnis) throws CustomException {
        setVorname(vorname);
        setNachname(nachname);
        this.testergebnis = testergebnis;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public Testergebnis getTestergebnis() {
        return testergebnis;
    }

    public void setVorname(String vorname) throws CustomException {
        int numberOfLength = String.valueOf(vorname).length();
        if (numberOfLength >= 3) {
            this.vorname = vorname;
        } else {
            throw new CustomException();
        }
    }

    public void setNachname(String nachname) throws CustomException {
        int numberOfLength = String.valueOf(nachname).length();
        if (numberOfLength >= 3) {
            this.nachname = nachname;
        } else {
            throw new CustomException();
        }
    }

    public void setTestergebnis(Testergebnis testergebnis) {
        this.testergebnis = testergebnis;
    }
}
