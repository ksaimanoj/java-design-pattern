
public abstract class DrinkRecipe {
	protected abstract void addSugar();
	protected abstract void addSalt();
	
	final void makeDrink() {
		addWater();
		addSugar();
		addSalt();
		pourIntoCup();
	}
	
	private void addWater() {
		System.out.println("add water");
	}
	
	private void pourIntoCup() {
		System.out.println("pour drink into a cup");
	}
}
