public abstract class Title {

    protected String title; //Har valgt at ændre denne til protected for at kunne arve mine toString metoder i de to subklasser.

    protected int copies;

    protected double rate = 0.067574;

    protected String literatureType;


    public Title(String title, String literatureType, int copies) {
        this.title = title;
        this.copies = copies;
        this.literatureType = literatureType;

    }

    public double calculateRoyalty() {
        double calculateRoyalty =  calculatePoints() * rate;
        calculateRoyalty = Math.round(calculateRoyalty * 100.0) / 100.0;
        return calculateRoyalty;

    }

    @Override

    public String toString(){ //Laver en toString metode, som bliver kaldt automatisk, når jeg printer bøgerne ud i main.
        return title;
    }


    public abstract double calculatePoints();

    public abstract double calculateLiteraturePoints();

}