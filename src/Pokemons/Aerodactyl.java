package Pokemons;

import Moves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

/**
 * Покемон Aerodactyl — ископаемый покемон типов Камень и Летающий.
 * Базовые характеристики: HP 80, Атака 105, Защита 65, Сп. Атака 60, Сп. Защита 75, Скорость 130.
 * Приёмы: Dragon Claw, Iron Head, Confide, Aerial Ace.
 */
public final class Aerodactyl extends Pokemon {
    public Aerodactyl (String name, int level){
        super(name, level);

        super.setType(Type.ROCK, Type.FLYING);
        super.setStats(80, 105, 65, 60, 75, 130);


        DragonClaw dragonClaw = new DragonClaw(80,100);
        IronHead ironHead = new IronHead(80, 100);
        Confide confide = new Confide(0,0);
        AerialAce aerialAce = new AerialAce(60,0);

        setMove(dragonClaw, ironHead, confide, aerialAce);
    }
}
