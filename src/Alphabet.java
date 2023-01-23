public class Alphabet {
    private  int number;
    private String alphabet;

    public Alphabet() {

    }

    public Alphabet(int number ) {
        this.number = number;

    }

    public Alphabet(String alphabet) {
        this.alphabet = alphabet;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getAlphabet() {
        return alphabet;
    }

    public void setAlphabet(String alphabet) {
        this.alphabet = alphabet;
    }

    @Override
    public String toString() {
        return "Alphabet: " +alphabet +"number: "+number;
    }
}
