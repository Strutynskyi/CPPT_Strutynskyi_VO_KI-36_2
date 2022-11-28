public class Main {
    public static void main(String[] args) {
        Dictaphone Dictaphone = new Dictaphone(new Screen(7.8, "720x1980"), new HardDisk(1000, "Harman"));

        Dictaphone.AddSong("Stepan Giga - Zoloto Karpat");
        Dictaphone.AddSong("Stepan Giga - Yvoruna");
        Dictaphone.AddSong("Victor Pavlic - Shikidim");
        Dictaphone.AddSong("Zhadan i Sobaku - Madona");
        Dictaphone.AddSong("Zhadan i Sobaku - Kobzon");

        Dictaphone.TurnOnPrevSong();
        Dictaphone.TurnOnPrevSong();
        Dictaphone.TurnOnPrevSong();

        Dictaphone.TurnOnPrevSong();
        Dictaphone.TurnOnPrevSong();
        Dictaphone.TurnOnPrevSong();
        Dictaphone.TurnOnPrevSong();

        System.out.println(Dictaphone);
    }
}