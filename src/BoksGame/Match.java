package BoksGame;

import java.util.Random;

public class Match {
    Fighter f1, f2;
    int minWeight, maxWeight;

    public Match(int maxWeight, int minWeight, Fighter f2, Fighter f1) {
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;
        this.f2 = f2;
        this.f1 = f1;
    }
    public void run(){
        if(checkWeight()){
            while(!isWin()){
                System.out.println("========= NEW ROUND =========");
                if (whoStarts()){
                    f1.health=f2.hit(f1);
                    if(isWin()){
                        break;
                    }
                }else{
                    f2.health=f1.hit(f2);
                    if (isWin()){
                        break;
                    }
                }
                printScore();
            }
        }
    }

    public boolean checkWeight() {
        return (f1.weight <= maxWeight && f1.weight >= minWeight) && (f2.weight<=maxWeight && f2.weight>=minWeight);
    }
    public boolean isWin(){
        if(f1.health<=0){
            System.out.println("The winner is :"+f2.name);
            return true;
        } else if (f2.health<=0) {
            System.out.println("The winner is:"+f1.name);
            return true;
        }
        return false;
    }
    public void printScore(){
        System.out.println(f1.name+"'s remain health "+f1.health);
        System.out.println(f2.name+"'s remain health "+f2.health);
    }
    boolean whoStarts(){
        Random random = new Random();
        int value = random.nextInt(2);
        return value==1;
    }
}
