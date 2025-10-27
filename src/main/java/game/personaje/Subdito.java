package game.personaje;

public class Subdito extends  Personaje implements HablidadSimple {

    private final double daExp = 10;
    private final TipoAtaque ataque;


    public Subdito(TipoAtaque ataque){
        this.ataque = TipoAtaque.ATAQUE_ESPDADA;
    }


    public double getDaExp() {
        return daExp;
    }

    @Override
    public void usaHablidadNormal(TipoAtaque ataque, Personaje e) {
        e.reciboDaño(ataque.getNumAtaque());
        System.out.println("El subdito a pegado con " + ataque);
    }

    @Override
    public void eee() {
        System.out.println("");
    }

    

}
