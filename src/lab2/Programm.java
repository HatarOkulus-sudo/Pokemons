package lab2;

import Pokemons.*;
import ru.ifmo.se.pokemon.Battle;

public final class Programm {

    //https://pokemondb.net/pokedex/aerodactyl\
    //https://pokemondb.net/pokedex/zorua
    //https://pokemondb.net/pokedex/zoroark
    //https://pokemondb.net/pokedex/seedot
    //https://pokemondb.net/pokedex/shiftry

    public static void main(String[] args){
        Battle b = new Battle();
        Aerodactyl aerodactyl = new Aerodactyl("coconut", 1);
        Zorua zorua = new Zorua("pie", 1);
        Zoroak zoroak = new Zoroak("apple", 1);
        Seedot seedot = new Seedot("banana", 1);
        Nuzleaf nuzleaf = new Nuzleaf("orange", 1);
        Shiftry shiftry = new Shiftry("cucumber", 1);
        b.addAlly(aerodactyl);
        b.addAlly(nuzleaf);
        b.addAlly(zorua);
        b.addFoe(shiftry);
        b.addFoe(seedot);
        b.addFoe(zoroak);
        b.go();

    }
    public static boolean chance(double d){
        return d > Math.random();
    }
}