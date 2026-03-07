package Pokemons;
import Moves.*;
import ru.ifmo.se.pokemon.*;

/**
 * Покемон Nuzleaf — покемон типов Трава и Тёмный, эволюция Seedot.
 * Базовые характеристики: HP 70, Атака 70, Защита 40, Сп. Атака 60, Сп. Защита 40, Скорость 60.
 * Дополнительный приём: Growth.
 */
public class Nuzleaf extends Seedot{
    public Nuzleaf(String name, int level){
        super(name, level);

        setType(Type.GRASS, Type.DARK);
        setStats(70,70,40,60,40,60);

        Growth growth = new Growth(0,0);
        addMove(growth);
    }
}
