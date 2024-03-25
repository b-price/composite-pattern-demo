public class Client {
    public static void main(String[] args) {
        Directory artists = new Directory("Artists");
        Directory atthegates = new Directory("At the Gates");
        Directory sepultura = new Directory("Sepultura");
        Directory godflesh = new Directory("Godflesh");
        Directory arise = new Directory("Arise");
        Directory beneath = new Directory("Beneath the Remains");
        Directory streetcleaner = new Directory("Streetcleaner");
        atthegates.add(new File("Blinded by Fear"));
        atthegates.add(new File("Kingdom Gone"));
        arise.add(new File("Desperate Cry"));
        beneath.add(new File("Inner Self"));
        beneath.add(new File("Mass Hypnosis"));
        sepultura.add(new File("Symptom of the Universe"));
        streetcleaner.add(new File("Like Rats"));
        streetcleaner.add(new File("Streetcleaner"));
        sepultura.add(arise);
        sepultura.add(beneath);
        godflesh.add(streetcleaner);
        artists.add(sepultura);
        artists.add(atthegates);
        artists.add(godflesh);

        System.out.println("Artists, albums, songs");
        artists.ls();

    }
}