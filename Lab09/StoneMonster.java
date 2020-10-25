package Lab09;

public class StoneMonster extends Monster {
    public StoneMonster(String name){
        super(name);
    }
    @Override
    public String attack(){
        return "attack with stone!";
    }
}
