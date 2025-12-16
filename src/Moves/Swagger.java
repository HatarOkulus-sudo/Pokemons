package Moves;

import ru.ifmo.se.pokemon.*;


public final class Swagger extends StatusMove {
    public Swagger (double pow, double acc){
        super(Type.NORMAL, pow, acc);

    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        Effect.confuse(p);
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.ATTACK, +2);
    }

    @Override
    protected String describe(){
        return "does Swagger";
    }
}
