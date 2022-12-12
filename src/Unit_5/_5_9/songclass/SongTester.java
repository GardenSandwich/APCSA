package Unit_5._5_9.songclass;

public class SongTester {
    public static void main(String[] args) {
        Song song1 = new Song("ABBA", "Dancing Queen", 3, 54);
        Song song2 = new Song("Bruce Springsteen", "The Heart of Rock and Roll", 5, 14);
        Song song3 = new Song("Huey Lewis & the News", "The Heart of Rock and Roll", 4, 59);

        //test out getters and setters
        System.out.println(song1.getArtist());
        System.out.println(song1.getTitle());
        System.out.println(song1.getMinutes());
        System.out.println(song1.getSeconds());


        //print out values
        System.out.println(song1.toString());
        System.out.println(song2.toString());
        System.out.println(song3.toString());
    }
}
