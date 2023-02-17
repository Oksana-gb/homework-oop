package less1;

public class Main {
    public static void main(String[] args){
        Woman h1=new Woman("Таня", "20.06.1967");
        Man h2=new Man("Ваня", "25.03.1967");
        Woman h3=new Woman("Саша","5.02.2000",null,h1,h2,null);
        Man h4=new Man("Игорь","14.05.2025",null,h1,h2,null);
        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);
        h2.death = "5.10.2005";
        System.out.println(h2);
        h2.child = h3;
        System.out.println(h2.child);
        h3.brother=h4;
        System.out.println(h3.brother);
        System.out.println(h2.wife=h1);

    }

}
