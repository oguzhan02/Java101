package BoksGame;

public class Fighter {
    String name;
    int damage,health,weight,dodge;

    public Fighter( String name,int health, int damage, int weight,int dodge) {
        this.health = health;
        this.name = name;
        this.damage = damage;
        this.weight = weight;
        if(dodge>=0 && dodge<=100){
            this.dodge=dodge;
        }else{
            this.dodge=0;
        }
    }
    public int hit (Fighter foe){
        System.out.println(this.name+" => "+this.damage+" damaged to "+foe.name );
        if(foe.dodge()){
            System.out.println(foe.name+" dodged the hit");
            return foe.health;
        }
        return foe.health-this.damage;
    }
    public boolean dodge(){
        double randomValue = Math.random()*100;
        return randomValue<=this.dodge;
    }

}
