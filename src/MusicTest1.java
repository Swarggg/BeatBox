import javax.sound.midi.*;
import java.sql.SQLOutput;

public class MusicTest1 {
    public void play(){
        try {
            Sequencer sequencer = MidiSystem.getSequencer(); // пасный метод который что-то выбрасывает
        } catch (MidiUnavailableException mue) {  // ловим то, что выбрасывает опасный метод
            System.out.println("Неудача"); //обрабатываем если поймали
        }
        System.out.println("Мы получили синтезатор");
    }

    public static void main(String[] args) {
        MusicTest1 mt = new MusicTest1();
        mt.play();
    }
}
