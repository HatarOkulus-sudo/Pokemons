package Moves;

import Chance.Chance;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class IronHead extends PhysicalMove {
    public IronHead (double pow, double acc){
        super(Type.STEEL, pow, acc);

    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);

        if (Chance.chance(0.3)){
            Effect.flinch(p);
        }
    }

    @Override
    protected String describe(){
        return "Does IronHead";
    }
}
