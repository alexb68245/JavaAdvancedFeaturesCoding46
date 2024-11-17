import java.util.Queue;
import java.util.Stack;

public class Weapon {
    private int sizeOfMagazine;
    Stack<String> bullets = new Stack<>();

    public Weapon(int sizeOfMagazine) {
        this.sizeOfMagazine = sizeOfMagazine;
    }

    public void loadBullet(String bullet){
        if (bullets.size() < sizeOfMagazine){
            bullets.push(bullet);
        }else {
            System.out.println("Magazine is full");
        }
    }

    public boolean isLoaded(){
        return !bullets.isEmpty();
    }

    public void shot(){
        if (bullets.isEmpty()){
            System.out.println("There are no bullets left");
        }else if (bullets.size() == 2){
            System.out.println(bullets.peek() + " was shot");
            System.out.println("You have one bullet left");
            bullets.pop();
        }else {
            System.out.println(bullets.peek() + " was shot");
            bullets.pop();
        }
    }

    public static void main(String[] args) {
        Weapon weapon = new Weapon(5);
        weapon.loadBullet("1");
        weapon.loadBullet("2");
        weapon.loadBullet("3");
        weapon.loadBullet("4");
        weapon.loadBullet("5");
        weapon.loadBullet("6");
        System.out.println("Is weapon loaded? " + weapon.isLoaded());
        weapon.shot();
        weapon.shot();
        weapon.shot();
        weapon.shot();
        weapon.shot();
        System.out.println("Is weapon loaded? " + weapon.isLoaded());
    }
}
