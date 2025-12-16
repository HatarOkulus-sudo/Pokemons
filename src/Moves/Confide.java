package Moves;

import ru.ifmo.se.pokemon.*;

public final class Confide extends StatusMove {
    public Confide (double pow, double acc) {
        super(Type.NORMAL, pow, acc);

    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        p.setMod(Stat.SPECIAL_ATTACK,-1);


    }



    @Override
    protected String describe(){
        return "Does Confide";
    }
}
