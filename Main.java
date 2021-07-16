public class Main{    
    public static void main(String[] args) {
        //マップサイズと船の数を入力させる
        Game game = new Game();

        //マップを生成し、マップに船を設置させる
        game.createGame();

        //ゲーム開始
        game.startGame();
    }
}