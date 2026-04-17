import java.sql.Connection;
import java.sql.PreparedStatement;

public class ScoreDAO {
    public static void saveScore(String playerName, int score) {
        String query = "INSERT INTO scores(player_name, score) VALUES (?, ?)";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, playerName);
            ps.setInt(2, score);
            ps.executeUpdate();
            System.out.println("Score saved for " + playerName);
        } catch (Exception e) {
            System.err.println("Error saving score: " + e.getMessage());
        }
    }
}
