package Pokemons;

import Moves.*;
import ru.ifmo.se.pokemon.Type;

public final class Shiftry extends Nuzleaf{
    public Shiftry(String name, int level){
        super(name, level);

        setType(Type.GRASS, Type.DARK);
        setStats(90,100,60,90,60,80);

        SwordsDance swordsDance = new SwordsDance(0,0);
        addMove(swordsDance);
    }
}
