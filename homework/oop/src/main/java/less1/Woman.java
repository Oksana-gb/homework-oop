package less1;

public class Woman extends Human{

    Human husband;
    public Woman(String name, String birthdate, String death, Human mother, Human father, Human child) {
        super(name, birthdate, death, mother, father, child);
    }

    public Woman(String name, String birthdate) {
        super(name, birthdate);
    }

    
}
