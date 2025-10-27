package game.personaje;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public interface HablidadSimple {
    Logger logger = LogManager.getLogger(HablidadSimple.class);

    void usaHablidadNormal(TipoAtaque tipoAtaque, Personaje e);

    default void uso() {
        logger.info("Skill used");
    }

    default void eee() {
        System.out.println("eee");
    }
}
