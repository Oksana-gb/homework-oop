package less1;

public class Human {
    String name;
    String birthdate;
    String death;
    Human mother;
    Human father;
    Human child;
    Human brother;
    Human sister;

    public String getName() {
        return name;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public String getDeath() {
        return death;
    }

    public Human getMother() {
        return mother;
    }

    public Human getFather() {
        return father;
    }

    public Human getChild() {
        return child;
    }

    public Human getBrother() {
        return brother;
    }

    public Human getSister() {
        return sister;
    }

    public Human(String name, String birthdate, String death, Human mother, Human father, Human child) {
        this.name = name;
        this.birthdate = birthdate;
        this.death = death;
        this.mother = mother;
        this.father = father;
        this.child = child;
    }

    public Human(String name, String birthdate) {
        this(name,birthdate,null,null,null,null);
    }


    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", birthdate='" + birthdate + '\'' +
                ", death='" + death + '\'' +
                '}';
    }
}
