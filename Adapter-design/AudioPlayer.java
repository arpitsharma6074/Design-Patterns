class AudioPlayer {
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file: " + fileName);
        }
        else if(audioType.equalsIgnoreCase("mp4")) {
            MediaPlayer mp4 = new Mp4Player();
            mp4.play(fileName);
        }
        else if(audioType.equalsIgnoreCase("vlc")) {
            MediaPlayer vlc = new VlcPlayer();
            vlc.play(fileName);
        }
        else {
            System.out.println("Invalid format: " + audioType);
        }
    }
}
