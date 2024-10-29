public class AudioBook extends Title {

    private int durationInMinutes;

    public AudioBook(String title, int durationInMinutes, String literatureType, int copies) {
        super(title, literatureType, copies);
        this.durationInMinutes = durationInMinutes;
        this.literatureType = literatureType;
    }

    @Override
    public double calculatePoints() {
        double totalPoints = (durationInMinutes * 0.5) * calculateLiteraturePoints() * copies;
        totalPoints =  Math.round(totalPoints * 100.0) / 100.0;;//Sørger for at det totale antal point bliver returneret med 2 decimaler.
        return totalPoints;

    }

    @Override
    public double calculateLiteraturePoints() {
        if (literatureType == "BI") {
            return 1.5;
        } else if (literatureType == "TE") {
            return 1.5;
        } else if (literatureType == "LYRIK") {
            return 3.0;
        } else if (literatureType == "SKØN") {
            return 0.85;
        } else if(literatureType == "FAG"){
            return 0.5;
        }
        return 0.0;
    }

    @Override
    public String toString() {
        return "lydbogen \"" + title + "\"";
    }
}

