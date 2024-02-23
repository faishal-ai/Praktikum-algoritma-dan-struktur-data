public class dragonMain {
    public static void main(String[] args) {
        Dragon player = new Dragon();
        player.x = 0;
        player.y = 0;
        player.width = 5;
        player.height = 4;
        player.moveRight();
        player.printPosition();
    }
}
