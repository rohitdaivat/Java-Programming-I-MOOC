
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int gameCount = 0;
        int losses = 0;
        int wins = 0;
        
        System.out.println("File:");
        String fileName = scanner.nextLine();

        System.out.println("Team:");
        String teamInput = scanner.nextLine();

        ArrayList<Team> teams = sportStatisticsRecords(fileName);

        for (Team team : teams) {
            if (team.getHomeTeam().contains(teamInput)) {
                    if (team.getHomeTeamPt() >= team.getVisitingTeamPt()){
                        wins++;
                    }else{
                        losses++;
                    }
                gameCount++;
                
            } else if (team.getVisitingTeam().contains(teamInput) ){
                if(team.getVisitingTeamPt() >= team.getHomeTeamPt()){
                    wins++;
                } else{
                    losses++;
                }
                gameCount++;
            } else {
                continue;
            }
            
        }
        System.out.println("Games: "  + gameCount);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: "  + losses);

    }

    public static ArrayList<Team> sportStatisticsRecords(String fileName) {
        ArrayList<Team> sportRecord = new ArrayList();

        try (Scanner scanner = new Scanner(Paths.get(fileName))) {
            while (scanner.hasNextLine()) {
                String raw = scanner.nextLine();
                String[] parts = raw.split(",");

                String homeTeam = parts[0];
                String visitingTeam = parts[01];
                int homeTeamPt = Integer.valueOf(parts[2]);
                int visitingTeamPt = Integer.valueOf(parts[3]);

                sportRecord.add(new Team(homeTeam, visitingTeam, homeTeamPt, visitingTeamPt));

            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return sportRecord;
    }
}
