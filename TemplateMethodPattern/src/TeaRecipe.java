
public class TeaRecipe extends DrinkRecipe {

	@Override
	protected void addSugar() {
		System.out.println("add 10mg of sugar");
	}

	@Override
	protected void addSalt() {
		System.out.println("add 10mg of salt");
	}

}
