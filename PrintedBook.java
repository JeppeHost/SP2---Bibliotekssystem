public class PrintedBook extends Title {

    private int pages;

    public PrintedBook(String title, String literatureType, int copies, int pages){
        super(title, literatureType, copies);
        this.copies = copies;
        this.pages = pages;
        this.literatureType = literatureType;


    }
@Override
    public double calculatePoints(){
        double totalPoints = pages * calculateLiteraturePoints() * copies;
        totalPoints = Math.round(totalPoints * 100) / 100.0;
        return totalPoints;
    }

@Override
    public double calculateLiteraturePoints(){
        if(literatureType.equals("BI")){
            return 3.0;
        } else if(literatureType.equals("TE")){
            return 3.0;
        } else if(literatureType.equals("LYRIK")){
            return 6.0;
        } else if(literatureType.equals("SKØN")){
            return 1.7;
        } else if(literatureType.equals("FAG")){
            return 1.0;
        }
        return 0.0;
    }
    @Override
    public String toString(){
        return "bogen \"" + title + "\"";
    }
}
