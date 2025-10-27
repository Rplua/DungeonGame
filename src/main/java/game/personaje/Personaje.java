package game.personaje;

public abstract class Personaje {

    private String nombre;
    private double vida;
    private double ataque;
    private double defensa;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()){
            this.nombre = nombre;
        }

    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        if (vida < 0){
            this.vida = 0;
            return;
        }
        if (vida > 100){
            this.vida = 100;
            return;
        }
        this.vida = vida;
    }

    public double getAtaque() {
        return ataque;
    }

    public void setAtaque(double ataque) {
        if (ataque <= 0){
            this.ataque = 0;
            return;
        }
        if (ataque >= 100){
            this.ataque = 100;
            return;
        }
        this.ataque = ataque;
    }

    public double getDefensa() {
        return defensa;
    }

    public void setDefensa(double defensa) {
        if (defensa <= 0){
            this.defensa = 0;
            return;
        }
        if (defensa >= 100){
            this.defensa = 100;
            return;
        }
        this.defensa = defensa;
    }

    public void reciboDaño(double dmg){
        this.vida = vida - dmg;
    }
}
