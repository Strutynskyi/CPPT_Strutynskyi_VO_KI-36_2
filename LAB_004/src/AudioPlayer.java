import java.util.ArrayList;

/**
 * Class AudioPlayer
 * @author
 * @version 1.0
 */
public abstract class AudioPlayer
{
    protected final Button nextSong = new Button("next song");
    protected final Button prevSong = new Button("prev song");
    protected final Button pause = new Button("pause");
    protected Logger logger = Logger.getLogger("logs.txt");
    protected Screen screen;
    protected HardDisk hardDisk;
    protected ArrayList<String> songs = new ArrayList<>();
    protected int curSong = 0;
    
    /**
     * Constructor
     * @param screen
     * @param hardDisk
     */
    public AudioPlayer(Screen screen, HardDisk hardDisk) {
        logger.log(logger.infoFlag + "AudioPlayer constructor called");
        this.screen = screen;
        this.hardDisk = hardDisk;
    }

    /**
     * Method to add new song to player
     * @param song
     */
    public void AddSong(String song)
    {
        songs.add(song);
        System.out.println(song + " was added to audio player");
        logger.log(logger.infoFlag + "AudioPlayer AddSong method was called");
    }


    /**
     * Method to turn on next song
     */
    public abstract void TurnOnNextSong();

    /**
     * Method to turn on prev song
     */
    public abstract void TurnOnPrevSong();


    public Button getNextSong() {
        return nextSong;
    }

    public Button getPrevSong() {
        return prevSong;
    }

    public Button getPause() {
        return pause;
    }

    public Logger getLogger() {
        return logger;
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public ArrayList<String> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<String> songs) {
        this.songs = songs;
    }

    public int getCurSong() {
        return curSong;
    }

    public void setCurSong(int curSong) {
        this.curSong = curSong;
    }

    @Override
    public String toString() {
        return "AudioPlayer{ " +
                " screen=" + screen + "\n" +
                ", hardDisk=" + hardDisk +  "\n" +
                ", songs=" + songs + "\n" +
                ", curSong=" + curSong + "\n" +
                '}';
    }
}
