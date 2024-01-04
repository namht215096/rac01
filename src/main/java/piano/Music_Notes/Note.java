package piano.Music_Notes;
import java.awt.Toolkit;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.Media;
import java.io.File;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;

public class Note {

    private String noteFile;
    MediaPlayer mediaPlayer;
    public Note(String path)
    {
        noteFile=path;
//        Media sound = new Media(new File(noteFile).toURI().toString());
        mediaPlayer = new MediaPlayer(new Media(new File(noteFile).toURI().toString()));
    }
    //private String note1File = "src/main/java/piano/Music_Notes/B.wav";
    public void playNote() {
        mediaPlayer.stop();
        mediaPlayer.play();
    }

}
