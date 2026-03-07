package Moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

/**
 * Приём Fury Swipes (Яростные Удары) — физическая атака типа Нормальный.
 * Наносит урон противнику несколькими последовательными ударами.
 */
public final class FurySwipes extends PhysicalMove {
    public FurySwipes (double pow, double acc){
        super(Type.NORMAL, pow, acc);
    }

    @Override
    protected String describe(){
        return "does Fury Swipes";
    }
}
