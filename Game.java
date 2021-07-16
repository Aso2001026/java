import java.util.Scanner;

public class Game {
    private int MAP_SIZE;
    private int SHIP_NUM;
    private Map map = new Map();
    private Ship[] ship;
    private int turn = 1;


    Scanner sc = new Scanner(System.in);


    //マップのサイズと船の数を入力させる
    public Game(){
        System.out.println("マップサイズを入力してください(3-5)");
        MAP_SIZE = sc.nextInt();
        while(MAP_SIZE <3 || MAP_SIZE>5){
            System.out.println("マップサイズを入力してください(3-5)");
        MAP_SIZE = sc.nextInt();
        }
        System.out.println("敵船の数を入力してください(1-5)");
        SHIP_NUM = sc.nextInt();
        while(SHIP_NUM <1 || SHIP_NUM>5){
            System.out.println("敵船の数を入力してください(1-5)");
            SHIP_NUM = sc.nextInt();
        }
    }
    
    public int getSHIP_NUM() {
        return SHIP_NUM;
    }

    public int getMAP_SIZE() {
        return MAP_SIZE;
    }

    //マップを生成し船を設置する。
    public void createGame(){
        map.createMap(MAP_SIZE);
        ship = new Ship[SHIP_NUM];
        for(int i = 0;i<SHIP_NUM;i++){
            ship[i] = new Ship();
            moveShip(ship[i]);
        }
        map.resetMap(MAP_SIZE,ship);
    }

    public void startGame(){
        int attackX;
        int attackY;

        System.out.println("********************");
        System.out.println("      戦艦ゲーム      ");
        System.out.println("********************");

        //船が全て沈んでいない間ゲームを続ける
        while(notAllShinking()){
            System.out.println("------["+turn+"ターン]------");
            displaySituation();
            System.out.println("爆弾のx座標を入力してください(1-"+MAP_SIZE+")");
            attackX = sc.nextInt();
            while(attackX<1 || (attackX != 999 && attackX >MAP_SIZE)){
                System.out.println("爆弾のx座標を入力してください(1-"+MAP_SIZE+")");
            attackX = sc.nextInt();
            }
            System.out.println("爆弾のy座標を入力してください(1-"+MAP_SIZE+")");
            attackY = sc.nextInt();
            while(attackY<1 || (attackY != 999 && attackY >MAP_SIZE)){
                System.out.println("爆弾のy座標を入力してください(1-"+MAP_SIZE+")");
                attackY = sc.nextInt();
            }

            //隠しコマンドのソナーを使う
            if(attackX == 999 || attackX == 999){
                sonar();
            }
            //爆弾が当たったか確認しその結果を表示する
            else{
                for(int i = 0;i<SHIP_NUM;i++){
                    int result = ship[i].check(attackX,attackY);
                    Result(ship[i],i+1,result);
                }  
            }
            //10ターン目にヒントとしてソナーコマンドを教える
            if(turn == 10){
                System.out.println("");
                System.out.println("ヒント:x,y座標いずれかに999を入力すると敵船の場所がわかります。");
                System.out.println("");
            }
            turn++;
        }
        System.out.println(turn-1 + "ターンでクリアしました。");

    }

    //船が全て沈んだかチェックする
    public boolean notAllShinking(){
        for(int i = 0;i<ship.length;i++){
            if(ship[i].liveShip()){
                return true;
            }
        }
        return false;
    }

    //船が沈んだか生きているかを表示する
    private void displaySituation(){
        for(int i = 0; i < SHIP_NUM; i++){
            if(ship[i].liveShip()){
                System.out.println("船"+(i+1)+":生きてる");
            }else{
                System.out.println("船"+(i+1)+":撃沈済み");
            }
        }
    }

    //爆弾が当たったか判断し結果を表示する
    private void Result(Ship ship,int no,int result){
        if( result == Ship.NO_HIT){
            System.out.println("船"+no+":はずれ！");
        }else if( result == Ship.NERE){
            System.out.println("船"+no+":波高し！");
        }else if( result == Ship.HIT){
            System.out.println("船"+no+":爆弾が当たった！しかし船はまだ沈まない！船は移動します");
            map.clear(ship.getX(),ship.getY());
            moveShip(ship);
        }else{
            System.out.println("船"+no+":爆弾が当たった！撃沈しました");
            map.clear(ship.getX(),ship.getY());
        }
    }

    //全ての船の場所を表示させる
    public void sonar(){
        System.out.println("ソナーを使います。");
        for (Ship row : ship) {
            if(row.liveShip()){
                System.out.printf("船%dはx:%d,y:%dにいます。\n",row.getNo(),row.getX(),row.getY()); 
            }
        }
    }

    //船を同じ位置に設置しないように動かす
    private void moveShip(Ship ship){
        do{
            ship.moveShip(MAP_SIZE);
        }while(!map.deployShip(ship));
    }

}
