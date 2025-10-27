package game.personaje;

import game.level.Experencia;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Heroe extends Personaje implements UsuarioConHablidad {

    private int level;
    private double exp;
    private Experencia experencia;
    private static final Logger logger = LogManager.getLogger(Heroe.class);
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public double getExp() {
        return exp;
    }

    @Override
    public void userSkill(TipoAtaque ataque, Personaje enemigo) {
        if(ataque.equals(TipoAtaque.CURACION)){
            enemigo.reciboDaño(0);
            setVida(getVida() + ataque.getNumAtaque());
            logger.info("El heroe se a curado {} puntos de vida",TipoAtaque.CURACION);

        }
        enemigo.reciboDaño( getAtaque() + ataque.getNumAtaque());
        logger.info("{} a usado {} y a hecho este daño {}",getNombre(), ataque, ataque.getNumAtaque());

    }


    public void addExp( Subdito enemigo){
        this.exp = exp + enemigo.getDaExp();
    }

}
