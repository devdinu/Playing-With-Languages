import java.util.HashMap;
import java.util.Map;

class Game {

    public HashMap<String, Integer> movesCount = new HashMap<String, Integer>();

    public Game() {
        movesCount.put("R", 0);
        movesCount.put("P", 0);
        movesCount.put("S", 0);
    }


    public static void main(String[] args) {
        Game game = new Game();
        game.makeMove("R");
        System.out.println(game.getFrequentlyUsedMove());
        game.makeMove("S");
        game.makeMove("S");
        System.out.println(game.getFrequentlyUsedMove());
        game.displayMoveOccurrences();
    }

    public void makeMove(String move) {
        Integer existingCount = movesCount.get(move);
        movesCount.put(move, ++existingCount);
    }

    public void displayMoveOccurrences() {
        System.out.println(movesCount);
    }


    public String getFrequentlyUsedMove() {
        int maxCount = -1;
        String frequentMove = null;
        for (Map.Entry<String, Integer> currMove : movesCount.entrySet()) {
            Integer occurrence = currMove.getValue();
            if (occurrence > maxCount) {
                maxCount = occurrence;
                frequentMove = currMove.getKey();
            }
        }
        return frequentMove;
    }

}