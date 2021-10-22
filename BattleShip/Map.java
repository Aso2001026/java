public class Map {
    private Ship[][] MAP;

    public Map(){

    }

    //マップを作り全てをnullに初期化する
    public void createMap(int MAP_SIZE){
        MAP = new Ship[MAP_SIZE][MAP_SIZE];
        for(int i = 0;i<MAP_SIZE;i++){
            for(int j = 0;j<MAP_SIZE;j++){
                MAP[i][j] = null;
            }
        }
    }

    //マップを初期化した後,船を設置する
    public void resetMap(int MAP_SIZE,Ship[] ship){
        for(int i = 0;i<MAP_SIZE;i++){
            for(int j = 0;j<MAP_SIZE;j++){
                MAP[i][j] = null;
            }
        }
        for(int i = 0;i<ship.length;i++){
            MAP[ship[i].getX()-1][ship[i].getY()-1] = ship[i];
        }
    }

    //爆弾の当たった船の位置を消す
    public void clear(int x,int y){
        MAP[x-1][y-1]= null;
    }

    //船の位置がマップ上であるか、同じ場所に船が存在するのかを判断する
    public boolean deployShip(Ship ship){
        int x = ship.getX()-1;
        int y = ship.getY()-1;

        if(x > MAP.length || y> MAP.length){
            return false;
        }

        if(MAP[x][y] != null){
            return false;
        }

        MAP[x][y] = ship;

        return true;
    }

}
