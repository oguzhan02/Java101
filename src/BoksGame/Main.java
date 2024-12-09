package BoksGame;

public class Main {
    public static void main(String[] args){
        Fighter omer =new Fighter("Ömer",100,20,80,30);
        Fighter oguz= new Fighter("Oguzhan",120,18,75,40);
        Match match = new Match(100,70,omer,oguz);
        match.run();
    }
}
