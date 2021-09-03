package Pokemon;

public class Pokemon {
	private String name;
	private int health;
	private String type;
	private static int count;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public void attackPokemon(Pokemon pokemon) {
		pokemon.setHealth(pokemon.getHealth() - 10);
	}
	public Pokemon(String name, int health, String type) {
		this.setHealth(health);
		this.setName(name);
		this.setType(type);
		count++;
	}
	public void pokemonInfo(Pokemon pokemon) {
		System.out.println("Name: " + pokemon.name);
		System.out.println("Type: " + pokemon.type);
		System.out.println("health: " + pokemon.health);
	}

}
