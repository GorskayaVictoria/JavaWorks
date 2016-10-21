package work1;

/**
 * Created by sergey on 07.10.16.
 */
abstract class Cow {
    int weight;
    int x;
    int y;

    public Cow(int weight, int x, int y) {
        this.weight = weight;
        this.x = x;
        this.y = y;
    }

    public String muu(){
        return "Muuuuu!!";
    }
    public void eat(Food food){
        if (food.food<3){
            System.out.println("не наелась");
        }else {
            System.out.println("наелась");
        }
    }

    public void move(int x,int y){
        this.x=this.x+x;
        this.y=this.y+y;
        System.out.println("Я убежала");
        System.out.println("Мои координаты: x="+this.x+"y="+this.y);
    }

}
