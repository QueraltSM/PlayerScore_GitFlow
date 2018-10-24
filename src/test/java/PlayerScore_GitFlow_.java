import org.junit.jupiter.api.Test;

public class PlayerScore_GitFlow_ {
    private PlayerScore playerScore = new PlayerScore("Queralt");

    @Test
    public void given_new_player_score_frames_should_be_zero() {
        assert(playerScore.frames()==0);
    }

    @Test
    public void given_one_roll_frames_should_be_one() {
        playerScore.roll(4);
        assert(playerScore.frames()==1);
    }
}