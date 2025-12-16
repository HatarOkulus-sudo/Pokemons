package Pokemons;

import Moves.*;
import ru.ifmo.se.pokemon.*;

public final class Zoroak extends Zorua{
    public Zoroak(String name, int level){
        super(name, level);

        setType(Type.DARK);
        setStats(60,105,60,120,60,105);
        NightSlash nightSlash = new NightSlash(70,100);
        addMove(nightSlash);
    }
}
