package cancion;

import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Cancion extends Thread{
    public void run() {
            try {
                File archivoSonido = new File("C:\\Users\\ACER\\OneDrive\\Documentos\\NetBeansProjects\\ejerciciohilos\\src\\Ejerciciohilos\\audio.wav");
                Clip clip = AudioSystem.getClip();
                clip.open(AudioSystem.getAudioInputStream(archivoSonido));
                clip.start();
                Thread.sleep(clip.getMicrosecondLength() / 1000);
            } catch (Exception e) {
                System.out.println("Error al reproducir el archivo de sonido: " + e.getMessage());
            }
        }
    
}
