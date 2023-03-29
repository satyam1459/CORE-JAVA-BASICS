package OOPS.src;

class Movies{
    public String name;
    public int rating;
    public int money;
    public int profit;
    public String leadActor;
    public String leadActress;

    public Movies(String name, int rating, int money, int profit, String leadActor, String leadActress) {
        this.name = name;
        this.rating = rating;
        this.money = money;
        this.profit = profit;
        this.leadActor = leadActor;
        this.leadActress = leadActress;
    }
    void displayRating(){
        System.out.println(rating);
        System.out.println("This is the function of movies class.");
    }
}

class CommercialMovies extends Movies{
    public int likes;
    public int views;

    CommercialMovies(String name, int rating, int money, int profit, String leadActor, String leadActress,int likes,int views){
        super(name,rating,money,profit,leadActor,leadActress);
        this.likes=likes;
        this.views=views;
    }
    @Override
    void displayRating(){
        System.out.println(this.rating+"\n"+"This is the function of the commercial movies class.");
    }
}

class CreativeMovies extends Movies{
    public CreativeMovies(String name, int rating, int money, int profit, String leadActor, String leadActress) {
        super(name, rating, money, profit, leadActor, leadActress);
    }

    void displayRating(){
        System.out.println(this.rating);
        System.out.println("Inside the creativeMovies class");
    }
}
public class Solution {
    public static void main(String[] args) {
        CommercialMovies londonDreams=new CommercialMovies("London Dreams",10,9000000,7000000,"Salman Khan","Asin",10000,500);

        CreativeMovies andhadhun = new CreativeMovies("Andhadhun",10,7000000,800000,"Ayushman Khurana","Disha");

    londonDreams.displayRating();
    andhadhun.displayRating();

    }
}


