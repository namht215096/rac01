package piano;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import piano.Music_Notes.Note;

import java.io.File;

public class Piano {

    @FXML
    private Button btnnoteC;
    @FXML
    private Button btnnoteCs;
    @FXML
    private Button btnnoteD;
    @FXML
    private Button btnnoteE;
    @FXML
    private Button btnnoteF;
    @FXML
    private Button btnnoteDs;
    @FXML
    private Button btnnoteFs;
    @FXML
    private Button btnnoteG;
    @FXML
    private Button btnnoteA;
    @FXML
    private Button btnnoteB;
    @FXML
    private Button btnnoteGs;
    @FXML
    private Button btnnoteBb;
    @FXML
    private Button btnnoteC1;
    @FXML
    private Button btnnoteD1;
    @FXML
    private Button btnnoteE1;
    @FXML
    private Button btnnoteF1;
    @FXML
    private Button btnnoteCs1;
    @FXML
    private Button btnnoteDs1;



    Note noteC;
    Note noteD;
    Note noteCs;
    Note noteE;
    Note noteF;
    Note noteDs;
    Note noteFs;
    Note noteG;
    Note noteA;
    Note noteB;
    Note noteGs;
    Note noteBb;
    Note noteC1;
    Note noteD1;
    Note noteE1;
    Note noteF1;
    Note noteCs1;
    Note noteDs1;



    private String noteCFile = "src/main/java/piano/Music_Notes/C.wav";
    private String noteDFile = "src/main/java/piano/Music_Notes/D.wav";
    private String noteCsFile = "src/main/java/piano/Music_Notes/C_s.wav";
    private String noteEFile = "src/main/java/piano/Music_Notes/E.wav";
    private String noteFFile = "src/main/java/piano/Music_Notes/F.wav";
    private String noteDsFile = "src/main/java/piano/Music_Notes/D_s.wav";
    private String noteFsFile = "src/main/java/piano/Music_Notes/F_s.wav";
    private String noteGFile = "src/main/java/piano/Music_Notes/G.wav";
    private String noteAFile = "src/main/java/piano/Music_Notes/A.wav";
    private String noteBFile = "src/main/java/piano/Music_Notes/B.wav";
    private String noteGsFile = "src/main/java/piano/Music_Notes/G_s.wav";
    private String noteBbFile = "src/main/java/piano/Music_Notes/Bb.wav";
    private String noteC1File = "src/main/java/piano/Music_Notes/C1.wav";
    private String noteD1File = "src/main/java/piano/Music_Notes/D1.wav";
    private String noteE1File = "src/main/java/piano/Music_Notes/E1.wav";
    private String noteF1File = "src/main/java/piano/Music_Notes/F1.wav";
    private String noteCs1File = "src/main/java/piano/Music_Notes/C_s1.wav";
    private String noteDs1File = "src/main/java/piano/Music_Notes/D_s1.wav";

    private String type = "Piano";

    @FXML void initialize() {
        noteC = new Note(noteCFile, DRUMPATH);
        noteD = new Note(noteDFile);
        noteCs = new Note(noteCsFile);
        noteE = new Note(noteEFile);
        noteF = new Note(noteFFile);
        noteDs= new Note(noteDsFile);
        noteFs= new Note(noteFsFile);
        noteG= new Note(noteGFile);
        noteA= new Note(noteAFile);
        noteB= new Note(noteBFile);
        noteGs= new Note(noteGsFile);
        noteBb= new Note(noteBbFile);
        noteC1= new Note(noteC1File);
        noteD1= new Note(noteD1File);
        noteE1= new Note(noteE1File);
        noteF1= new Note(noteF1File);
        noteCs1 = new Note(noteCs1File);
        noteDs1 = new Note(noteDs1File);

    }

    @FXML
    void changeType(ActionEvent event) {
        if (type=="Piano"){
            System.out.println("Change to drum");
            type = "Drum";
        }else{
            System.out.println("Change to piano");
            type = "Piano";
        }
    }
    @FXML
    private void dosthC(){
        noteC.playNote(type);
    }
    @FXML
    private void dosthD(){
        noteD.playNote(type);
    }
    @FXML
    private void dosthCs() {
        noteCs.playNote(type);
    }
    @FXML
    private void dosthE() {
        noteE.playNote(type);
    }
    @FXML
    private void dosthF() {
        noteF.playNote(type);
    }
    @FXML
    private void dosthDs() {
        noteDs.playNote(type);
    }
    @FXML
    private void dosthFs() {
        noteFs.playNote(type);
    }
    @FXML
    private void dosthG() {
        noteG.playNote(type);
    }
    @FXML
    private void dosthA() {
        noteA.playNote(type);
    }
    @FXML
    private void dosthB() {
        noteB.playNote(type);
    }
    @FXML
    private void dosthGs() {
        noteGs.playNote(type);
    }
    @FXML
    private void dosthBb() {
        noteBb.playNote(type);
    }
    @FXML
    private void dosthC1() {
        noteC1.playNote(type);
    }
    @FXML
    private void dosthD1() {
        noteD1.playNote(type);
    }
    @FXML
    private void dosthE1() {
        noteE1.playNote(type);
    }
    @FXML
    private void dosthF1() {
        noteF1.playNote(type);
    }
    @FXML
    private void dosthCs1() {
        noteCs1.playNote(type);
    }
    @FXML
    private void dosthDs1() {
        noteDs1.playNote(type);
    }



}
