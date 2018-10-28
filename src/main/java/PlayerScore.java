import java.util.ArrayList;
import java.util.List;

public class PlayerScore {
    private final List<Integer> rolls;

    public PlayerScore(String name) {
        this.rolls = new ArrayList<Integer>();
    }

    public List<Frame> frames() {
        List<Frame> frames = new ArrayList<Frame>();
        for (int i = 0; i<rolls.size() && frames.size()<10; i += new Frame(i).isStrike() ? 1 : 2) frames.add(new Frame(i));
        return frames;
    }

    public PlayerScore roll(int pins) {
        rolls.add(pins);
        return this;
    }
    public class Frame {
        private int offset;

        public Frame(int offset) {
            this.offset = offset;
        }

        public boolean isStrike() {
            return roll(0) == 10;
        }

        private Integer roll(int i) {
            return isOutOfBounds(i) ? rolls.get(i + offset) : 0;
        }

        private boolean isOutOfBounds(int i) {
            return i < rolls.size() - offset;
        }
    }
}