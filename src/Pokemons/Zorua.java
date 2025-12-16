package Pokemons;

import Moves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Zorua extends Pokemon {
    public Zorua(String name, int level){
        super(name,level);

        super.setType(Type.DARK);
        super.setStats(40,65,40,80,40,65);

        CalmMind calmMind = new CalmMind(0,0);
        DoubleTeam doubleTeam = new DoubleTeam(0,0);
        FurySwipes furySwipes = new FurySwipes(18,80);
        setMove(calmMind, doubleTeam, furySwipes);

    }
}
