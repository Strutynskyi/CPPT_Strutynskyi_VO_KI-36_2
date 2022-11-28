import org.w3c.dom.ls.LSOutput;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;

/**
 * Class AudioPlayer
 * @author
 * @version 1.0
 */
public class AudioPlayer
{
    private final Button nextSong = new Button("next song");
    private final Button prevSong = new Button("prev song");
    private final Button pause = new Button("pause");
    private Logger logger = Logger.getLogger("logs.txt");
    private Screen screen;
    private HardDisk hardDisk;
    private ArrayList<String> songs = new ArrayList<>();
    private int curSong = 0;
    
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
    public void TurnOnNextSong()
    {
        logger.log(logger.infoFlag + "TurnOnNextSong AudioPlayer method was called");
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
     * Method to turn on prev song
     */
    public void TurnOnPrevSong()
    {
        logger.log(logger.infoFlag + "TurnPrevNextSong AudioPlayer method was called");
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
