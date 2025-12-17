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
        Aerodactyl aerodactyl = new Aerodactyl("coconut", 76);
        Zorua zorua = new Zorua("pie", 68);
        Zoroak zoroak = new Zoroak("apple", 92);
        Seedot seedot = new Seedot("banana", 54);
        Nuzleaf nuzleaf = new Nuzleaf("orange", 62);
        Shiftry shiftry = new Shiftry("cucumber", 85);
        b.addAlly(aerodactyl);
        b.addAlly(nuzleaf);
        b.addAlly(zorua);
        b.addFoe(shiftry);
        b.addFoe(seedot);
        b.addFoe(zoroak);
        b.go();

    }
}
