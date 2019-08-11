import com.sun.media.sound.JavaSoundAudioClip;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class TikTok {

    public static void main(String[] args) throws InterruptedException {
        int bpm = 60;
        int length = 4;
        int tiktoks = 60000 / (bpm * length);



        for (; ; ) {
            clearScreen();

            for (int z = 1; z <= length; z++) {
                if (z == 1) {
                    System.out.print("O");
                    try {
                        new JavaSoundAudioClip(new FileInputStream(new File("tik.aiff"))).play();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    Thread.sleep(tiktoks);
                } else {
                    System.out.print("●");
                    try {
                        new JavaSoundAudioClip(new FileInputStream(new File("tok.aiff"))).play();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    Thread.sleep(tiktoks);

                }

            }

        }

    }

    public static void clearScreen() {

        for (int i = 0; i < 50; ++i) System.out.println();
        System.out.flush();
    }
}
