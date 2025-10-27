package game.personaje;


public enum TipoAtaque {
    ATAQUE_ESPDADA(10),
    ATAQUE_FUEGO(20),
    ATAQUE_HIELO(20),
    CURACION(20);

    private final int numAtaque;

    TipoAtaque(int n) {
        this.numAtaque = n;
    }

    public int getNumAtaque() {
        return numAtaque;
    }

    public static TipoAtaque fromKeyboard(String keyboard) {
        for (var t : values()) if (t.name().equalsIgnoreCase(keyboard)) return t;
        throw new IllegalArgumentException("Ataque no válido: " + keyboard);
    }

    @Override
    public String toString() {
        return "TipoAtaque{" +
                "numAtaque=" + numAtaque +
                '}';
    }
}

