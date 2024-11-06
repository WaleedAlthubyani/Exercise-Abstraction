public class Movie extends Product{

    private String director;

    Movie(){super("N/A",0.0);}

    Movie(String name, double price,String director) {
        super(name, price);
        this.director=director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public double getDiscount() {
        return getPrice()-(getPrice()*0.1);
    }
}
