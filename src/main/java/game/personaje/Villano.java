package game.personaje;

public class Villano extends Personaje implements UsuarioConHablidad {
    @Override
    public void userSkill(TipoAtaque ataque, Personaje enemigo) {
        enemigo.reciboDaño(ataque.getNumAtaque()); //NO USAR Ñ
        System.out.println("El enemigo ha atacado con : " + ataque + " y a hecho " + ataque.getNumAtaque() + " de daño");
    }
}
