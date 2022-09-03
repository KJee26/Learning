package DesignPattern.Dp11_AdapterPattern.Impl;

import DesignPattern.Dp11_AdapterPattern.AdvanceMediaPlayer;

public class Mp4Player implements AdvanceMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        // none
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
