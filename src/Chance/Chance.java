package Chance;

/**
 * Утилитарный класс для симуляции случайных событий в бою.
 * Предоставляет статический метод для проверки вероятности наступления события.
 */
public class Chance {
    public static boolean chance(double d){
        return d > Math.random(); // a function for simulating random actions in combat
    }
}
