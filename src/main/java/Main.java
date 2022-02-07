import POJOs.Player;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("Finn Russell", "Fly Half", 10, 10);
        Player player2 = new Player("Finn Russell", "Fly Half", 10, 10);

//        System.out.println(player == player2);   //false because they are NOT the same object
//
//        System.out.println(player.hashCode());
//        System.out.println(player2.hashCode());
//
//        System.out.println(player.equals(player2));   //.equals : have they actually got the same stuff in them                                                           (got the same value) ---> true
    }
}
