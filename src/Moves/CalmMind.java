package Moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

/**
 * Приём Calm Mind (Спокойный Разум) — статусная атака типа Психо.
 * Повышает специальную атаку и специальную защиту пользователя на одну ступень каждую.
 */
public final class CalmMind extends StatusMove {
    public CalmMind(double pow, double acc){
        super(Type.PSYCHIC, pow, acc);
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.SPECIAL_ATTACK, +1);
        p.setMod(Stat.SPECIAL_DEFENSE, +1);
    }

    @Override
    protected String describe(){
        return "Does Calm Mind";
    }
}
