package Moves;

import ru.ifmo.se.pokemon.PhysicalMove;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

/**
 * Приём Aerial Ace (Воздушный Туз) — физическая атака типа Летающий.
 * Никогда не промахивается по противнику.
 */
public final class AerialAce extends PhysicalMove {
    public AerialAce (double pow, double acc) {
        super(Type.FLYING, pow, acc);

    }

    @Override
    protected String describe(){
        return "Does Aerial Ace";
    }
}