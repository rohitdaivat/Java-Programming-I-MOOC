public class Team {
    private String homeTeam;
    private String visitingTeam;
    private int homeTeamPt;
    private int visitingTeamPt;
    
    public Team(String homeTeam, String visitingTeam, int homeTeamPt, int visitingTeamPt){
        this.homeTeam = homeTeam;                
        this.visitingTeam = visitingTeam;                        
        this.homeTeamPt = homeTeamPt;                
        this.visitingTeamPt = visitingTeamPt;
    }
    
    public String getHomeTeam(){
        return this.homeTeam;
    }
    
    public String getVisitingTeam(){
        return this.visitingTeam;
    }
    
    public int getHomeTeamPt(){
    return this.homeTeamPt;
    }
    
    public int getVisitingTeamPt(){
        return this.visitingTeamPt;
    }
    
    
}
