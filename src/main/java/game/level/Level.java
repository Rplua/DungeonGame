package game.level;

import game.personaje.Subdito;
import game.personaje.Villano;

import java.util.ArrayList;
import java.util.List;

public class Level {
    private int levelNum;
    private List<Subdito> subditos = new ArrayList<>();
    private List<Villano> villanolist = new ArrayList<>();


    public Level(int levelNum, List<Subdito> subditos, List<Villano> villanolist) {
        this.levelNum = levelNum;
        this.subditos = subditos;
        this.villanolist = villanolist;
    }

    public int getLevelNum() {
        return levelNum;
    }

    public void setLevelNum(int levelNum) {
        this.levelNum = levelNum;
    }

    public List<Subdito> getSubditos() {
        return subditos;
    }

    public void setSubditos(List<Subdito> subditos) {
        this.subditos = subditos;
    }

    public List<Villano> getVillanolist() {
        return villanolist;
    }

    public void setVillanolist(List<Villano> villanolist) {
        this.villanolist = villanolist;
    }

    public boolean isCompleteLevel(){
        if (subditos.isEmpty()){
            return  true;
        }
        return false;
    }
}
