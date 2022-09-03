package DesignPattern.Dp11_AdapterPattern;

public class AudioPlayer implements MediaPlayer{

    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {

        // 内置支持mp3
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file. Name: "+ fileName);
        }

        // 其他格式支持
        else if (audioType.equalsIgnoreCase("vlc")
            || audioType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("Invalid media. "+ audioType + " format not supported");
        }
    }
}
