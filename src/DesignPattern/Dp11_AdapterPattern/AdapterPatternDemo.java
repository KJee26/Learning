package DesignPattern.Dp11_AdapterPattern;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "cxx.mp3");
        audioPlayer.play("mp4", "ffg,mp4");
        audioPlayer.play("vlc", "13131.vlc");
        audioPlayer.play("avi", "91hd.avi");
    }
}
