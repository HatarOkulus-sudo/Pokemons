package Moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

/**
 * Приём Dragon Claw (Коготь Дракона) — физическая атака типа Дракон.
 * Наносит урон противнику без дополнительных эффектов.
 */
public final class DragonClaw extends PhysicalMove {

    public DragonClaw (double pow, double acc){
        super(Type.DRAGON, pow, acc);

    }

    @Override
    protected String describe(){
        return "Does DragonClaw";
    }

}
