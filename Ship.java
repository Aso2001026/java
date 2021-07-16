import java.util.Random;

public class Ship {
    private final int MAX_HP = 3;
    private int x;
    private int y;
    public final static int HIT = 0;
    public final static int NERE = 1;
    public final static int NO_HIT = 2;
    public final static int SINKING = 3;
    private int HP;
    public static int count = 1;
    private int no;

    Random rnd = new Random();

    public Ship(){
        this.HP = MAX_HP;
        this.no = count;
        count++;
    }

    public int getNo() {
        return no;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    //船の場所を決める
    public void moveShip(int MAP_SIZE){
        setX(rnd.nextInt(MAP_SIZE)+1);
        setY(rnd.nextInt(MAP_SIZE)+1);

    }

    //船が生きているか沈んでいるか判断する
    public boolean liveShip(){
        boolean result = true;
        if(this.HP<=0){
            result = false;
            return result;
        }
        return result;
    }

    //爆弾が打たれた後の船の状況をチェックする
    public int check(int x,int y){
        int result = NO_HIT;

        if(x == this.x && y == this.y){
           HP--;
           if(HP == 0){
               result = SINKING;
           }else{
               result = HIT;
           }
        }
        //船の上下左右4マスに爆弾が飛んできたか判断する
        else if(this.x-1 == x && this.y == y){
            result = NERE;
        }else if(this.x+1 == x && this.y == y){
            result = NERE;
        }else if(this.x == x && this.y-1 == y){
            result = NERE;
        }else if(this.x == x && this.y+1 == y){
            result = NERE;
        }

        return result;
    }

    
}
