package Moves;


import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

/**
 * Приём Night Slash (Ночной Удар) — физическая атака типа Тёмный.
 * Имеет повышенный шанс критического удара.
 */
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
