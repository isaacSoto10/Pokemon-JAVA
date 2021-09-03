package Pokemon;

public class pokeTests extends Pokedex {
	public static void main(String[] args) {
		Pokedex p = new Pokedex();
		Pokemon charmander = p.createPokemon("charmander", "fire", 100);
		
		p.attackPokemon(charmander);
		p.pokemonInfo(charmander);
	}
}
