import java.util.ArrayList;
import java.util.List;

public class PlayerScore {
    private final List<Integer> rolls;

    public PlayerScore(String name) {
        this.rolls = new ArrayList<Integer>();
    }

    public int frames() {
        return rolls.size();
    }

    public PlayerScore roll(int pins) {
        rolls.add(pins);
        return this;
    }
}