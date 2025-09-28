import game.personaje.Heroe;

public class Main {
    public static void main(String [] args){
        Heroe u = new Heroe();
        u.setVida(100);
        u.setAtaque(122);
        u.setDefensa(50);
        System.out.println(u.getDefensa());

    }


}
