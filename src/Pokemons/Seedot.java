package Pokemons;

import Moves.*;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Seedot extends Pokemon {
    public Seedot(String name, int level){
        super(name, level);

        setType(Type.GRASS);
        setStats(40,40,50,30,30,30);

        Swagger swagger = new Swagger(0, 85);
        Facade facade = new Facade(70,100);
        setMove(swagger, facade);
    }
}
