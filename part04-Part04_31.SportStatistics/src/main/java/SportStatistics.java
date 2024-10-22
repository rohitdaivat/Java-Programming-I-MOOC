
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        int wins = 0;
        int losses = 0;
        System.out.println("File:");
        String fileInput = scan.nextLine();

        System.out.println("Team:");
        String teamInput = scan.nextLine();

        ArrayList<Team> teams = readStatisticsFromFile(fileInput);
        for (Team team : teams) {
            if (team.getHomeTeam().contains(teamInput)) {
                count++;

                if (team.homeTeamPoint() > team.visitingTeamPoint()) {
                    wins++;
                    team.setWins();
                } else {
                    losses++;
                    team.setLosses();
                }
                team.playGame();
            } else if (team.getVisitingTeam().contains(teamInput)) {
                count++;

                if (team.visitingTeamPoint() > team.homeTeamPoint()) {
                    wins++;
                    team.setWins();
                } else {
                    losses++;
                    team.setLosses();
                }
                team.playGame();
            }

        }
        System.out.println("Games: " + count);
//        System.out.println("wins: " + wins);
//        System.out.println("Losses " + losses);
    }

    public static ArrayList<Team> readStatisticsFromFile(String file) {
        ArrayList<Team> teams = new ArrayList<>();

        try ( Scanner scan = new Scanner(Paths.get(file))) {
            while (scan.hasNextLine()) {
                String list = scan.nextLine();
                String[] parts = list.split(",");

                String homeTeam = parts[0];
                String VisitingTeam = parts[1];
                int HomeTeamPoint = Integer.valueOf(parts[2]);
                int VisitingTeamPoint = Integer.valueOf(parts[3]);
                teams.add(new Team(homeTeam, VisitingTeam, HomeTeamPoint, VisitingTeamPoint));
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return teams;
    }
}
