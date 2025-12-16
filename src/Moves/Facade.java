package Moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public final class Facade extends PhysicalMove {
    public Facade (double pow, double acc){
        super(Type.NORMAL, acc, pow);

    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.ATTACK,
                switch (p.getCondition().toString()) {
                    case "burned", "poisoned", "paralyzed" -> 2;
                    default -> 1;
                });
    }
}
