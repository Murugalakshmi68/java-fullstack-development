package inheritance;
class Sports{
    Sports(){
        System.out.println("This is a Sports");
    }
}
class Cricket extends Sports{
    Cricket(){
        System.out.println("It is a Cricket");
    }
}
class Player extends Cricket{
    Player(){
        System.out.println("Dhoni Here");
    }
}
public class Multilevel_Inherit {
    public static void main(String[] args){
        Sports p = new Player();
    }
}
