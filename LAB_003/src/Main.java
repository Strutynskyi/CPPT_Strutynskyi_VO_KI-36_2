public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer(new Screen(7.8, "720x1980"), new HardDisk(1000, "Harman"));

        audioPlayer.AddSong("Stepan Giga - Zoloto Karpat");
        audioPlayer.AddSong("Stepan Giga - Yvoruna");
        audioPlayer.AddSong("Victor Pavlic - Shikidim");
        audioPlayer.AddSong("Zhadan i Sobaku - Madona");
        audioPlayer.AddSong("Zhadan i Sobaku - Kobzon");

        audioPlayer.TurnOnPrevSong();
        audioPlayer.TurnOnPrevSong();
        audioPlayer.TurnOnPrevSong();

        audioPlayer.TurnOnPrevSong();
        audioPlayer.TurnOnPrevSong();
        audioPlayer.TurnOnPrevSong();
        audioPlayer.TurnOnPrevSong();

        System.out.println(audioPlayer);
    }
}