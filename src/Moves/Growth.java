package Moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

import java.awt.*;

public final class Growth extends StatusMove {
    public Growth (double pow, double acc){
        super(Type.NORMAL, pow, acc);
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        super.applySelfEffects(p);

        p.setMod(Stat.ATTACK, +1);
        p.setMod(Stat.SPECIAL_ATTACK, +1);
    }

    @Override
    protected String describe(){
        return "does Growth";
    }
}
