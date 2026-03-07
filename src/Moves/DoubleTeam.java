package Moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

/**
 * Приём Double Team (Двойная Команда) — статусная атака типа Нормальный.
 * Повышает уклонение пользователя на одну ступень.
 */
public final class DoubleTeam extends StatusMove {
    public DoubleTeam (double pow, double acc){
        super(Type.NORMAL, pow, acc);

    }

    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.EVASION, +1);
    }

    @Override
    protected String describe(){
        return "does Double Team";
    }
}