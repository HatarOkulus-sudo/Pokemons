package Moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

/**
 * Приём Swords Dance (Танец Мечей) — статусная атака типа Нормальный.
 * Резко повышает атаку пользователя на две ступени.
 */
public final class SwordsDance extends StatusMove {
    public SwordsDance (double pow, double acc){
        super(Type.NORMAL, pow, acc);
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        super.applySelfEffects(p);

        p.setMod(Stat.ATTACK, +2);

    }

    @Override
    protected String describe(){
        return "does Sword Dance";
    }
}
