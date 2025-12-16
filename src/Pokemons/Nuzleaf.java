package Pokemons;
import Moves.*;
import ru.ifmo.se.pokemon.*;

public class Nuzleaf extends Seedot{
    public Nuzleaf(String name, int level){
        super(name, level);

        setType(Type.GRASS, Type.DARK);
        setStats(70,70,40,60,40,60);

        Growth growth = new Growth(0,0);
        addMove(growth);
    }
}
