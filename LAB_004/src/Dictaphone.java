/**
 * Class Dictaphone
 * @version 1.0
 */
public class Dictaphone extends AudioPlayer implements VoiceRecord
{
    /**
     * Constructor
     *
     * @param screen
     * @param hardDisk
     */
    public Dictaphone(Screen screen, HardDisk hardDisk) {
        super(screen, hardDisk);
    }

    /**
     * Overrided method to turn on next song
     */
    @Override
    public void TurnOnNextSong() {
        logger.log(logger.infoFlag + "TurnOnNextSong Dictaphone method was called");
        if(curSong == songs.size() - 1)
        {
            System.out.println("You push button " + nextSong.getAction());
            System.out.println("Now playing " + songs.get(curSong));
            curSong = 0;
        } else if (curSong < songs.size() - 1) {
            System.out.println("You push button " + nextSong.getAction());
            System.out.println("Now playing " + songs.get(curSong));
            curSong++;
        }
    }
    /**
     * Overrided method to turn on prev song
     */
    @Override
    public void TurnOnPrevSong() {
        logger.log(logger.infoFlag + "TurnPrevNextSong Dictaphone method was called");
        if(curSong == 0)
        {
            System.out.println("You push button " + prevSong.getAction());
            System.out.println("Now playing " + songs.get(curSong));
            curSong = songs.size() - 1;
        } else if (curSong > 0) {
            System.out.println("You push button " + prevSong.getAction());
            System.out.println("Now playing " + songs.get(curSong));
            curSong--;
        }
    }

    @Override
    public void RecordVoice(String voice) {
        songs.add("Voice Record - " + voice);
    }

    @Override
    public String toString() {
        return "Dictaphone{ " +
                ", screen=" + screen + "\n" +
                ", hardDisk=" + hardDisk + "\n" +
                ", songs=" + songs + "\n" +
                ", curSong=" + curSong + "\n" +
                '}';
    }
}
