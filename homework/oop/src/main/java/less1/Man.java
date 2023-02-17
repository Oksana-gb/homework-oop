package less1;

public class Man extends Human {

    Human wife;
    public Man(String name, String birthdate, String death, Human mother, Human father, Human child) {
        super(name, birthdate, death, mother, father, child);
    }

    public Man(String name, String birthdate) {
        super(name, birthdate);
    }

}
