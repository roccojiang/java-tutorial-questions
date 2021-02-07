package solutions.question7ec8;

public class Main {

  public static void main(String[] args) {

    // Uses singleton pattern so it is not possible to create multiple game worlds
    final GameEngine gameEngine = GameEngine.getInstance();

    final Fighter first = new Fighter("Joe", "Human Warrior", 16, 12, gameEngine);
    final Fighter second = new Fighter("Alex", "Elf Lord", 18, 6, gameEngine);

    gameEngine.simulateBattle(first, second);
  }
}
