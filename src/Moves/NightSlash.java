package Moves;


import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class NightSlash extends PhysicalMove {
    public NightSlash(double pow, double acc){
        super(Type.DARK, pow, acc);
    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage){
        super.applyOppDamage(def, damage);

    }




    @Override
    protected String describe(){
        return "does Night Slash";
    }
}
