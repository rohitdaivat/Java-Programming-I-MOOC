public class Film {
    private String name;
    private int filmAgeRating;
    
    public Film (String filmName, int filmAgeRating){
        this.name = filmName;
        this.filmAgeRating = filmAgeRating;
    }
    public String name(){
        return this.name;
    }
    public int ageRating(){
        return this.filmAgeRating;
    }

}
