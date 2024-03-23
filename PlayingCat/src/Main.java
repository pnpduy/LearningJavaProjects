public class Main {
    public static void main(String[] args) {

        boolean catPlaying = PlayingCat.isCatPlaying(true, 10);
        System.out.println(catPlaying);
        boolean catPlaying1 = PlayingCat.isCatPlaying(false, 36);
        System.out.println(catPlaying1);
        boolean catPlaying2 = PlayingCat.isCatPlaying(false, 35);
        System.out.println(catPlaying2);
    }
}