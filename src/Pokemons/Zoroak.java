package Pokemons;

import Moves.*;
import ru.ifmo.se.pokemon.*;

/**
 * Покемон Zoroak — покемон типа Тёмный, эволюция Zorua.
 * Базовые характеристики: HP 60, Атака 105, Защита 60, Сп. Атака 120, Сп. Защита 60, Скорость 105.
 * Дополнительный приём: Night Slash.
 */
public final class Zoroak extends Zorua{
    public Zoroak(String name, int level){
        super(name, level);

        setType(Type.DARK);
        setStats(60,105,60,120,60,105);
        NightSlash nightSlash = new NightSlash(70,100);
        addMove(nightSlash);
    }
}
