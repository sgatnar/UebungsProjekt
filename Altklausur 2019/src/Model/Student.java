package Model;

public class Student {

    private String anrede;
    private String name;
    private int matriculationNumber;

    public Student(String anrede, String name, String matriculationNumber) throws CustomException {
        setAnrede(anrede);
        setName(name);
        setMatriculationNumber(matriculationNumber);
    }

    public String getAnrede() {
        return anrede;
    }

    public void setAnrede(String anrede) throws CustomException{
        this.anrede = anrede;
        try {
            überprüfeZeichen(anrede);
        } catch (CustomException e) {
            throw new CustomException();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws CustomException {
        this.name = name;
        try {
            überprüfeZeichen(name);
        } catch (CustomException e) {
            throw new CustomException();
        }
    }

    public int getMatriculationNumber() {
        return matriculationNumber;
    }

    public void setMatriculationNumber(String matriculationNumber) throws CustomException, NumberFormatException {

        if (matriculationNumber.length() == 6) {
            this.matriculationNumber = Integer.parseInt(matriculationNumber);
        } else {
            throw new CustomException();
        }
    }

    public static String überprüfeZeichen(String input) throws CustomException {
        int numberOfLength = String.valueOf(input).length();
        if (numberOfLength > 0) {
            return input;
        } else {
            throw new CustomException();
        }
    }
}