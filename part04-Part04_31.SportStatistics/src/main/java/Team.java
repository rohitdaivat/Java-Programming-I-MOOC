public class Team {
    private String homeTeam;
    private String visitingTeam;
    private int homeTeamPoint;
    private int visitingTeamPoint;
    private int games;
    private int wins;
    private int losses;
    
    
    public Team(String homeTeam, String visitingTeam, int homeTeamPoint, int visitingTeamPoint){
        this.homeTeam = homeTeam;
        this.visitingTeamPoint = visitingTeamPoint;
        this.homeTeamPoint = homeTeamPoint;
        this.visitingTeamPoint = visitingTeamPoint;
    }
    public String getHomeTeam(){
        return this.homeTeam;
    }

    public String getVisitingTeam(){
        return this.visitingTeam;
    }
    public int homeTeamPoint(){
        return this.homeTeamPoint;
    }
    public int visitingTeamPoint(){
        return this.visitingTeamPoint;
    }
    public int playGame(){
        return this.games += 1;
    }
    public int setWins(){
        return this.wins+= 1;
    }
    public int setLosses(){
        return this.losses+= 1;
    }
    public int getWin(){
        return this.wins;
    }
    public  int getLosses(){
        return this.losses;
    }
}
