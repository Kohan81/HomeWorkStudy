package org.example.topik5.task2_2.answer;

public class Television {

    // Instance Variables

    private int channel = 1; // Default channel is 1
    private int volumeLevel = 1; // Default volume level is 1
    private boolean on_off = false; // By default, TV is off

    public void setChannel(int newChannel) {
        if (on_off && (newChannel >= 1 && newChannel <= 120) ){
            this.channel = newChannel;
        }// default channel setting is 1
    }

    public int getChannelNo(){
        return this.channel;
    }

    public void setVolume(int newVolumeLevel) {
        if ( on_off && (newVolumeLevel >= 1 && newVolumeLevel <= 7) ){
            this.volumeLevel = newVolumeLevel;
        }
    }

    public int getVolume(){
        return this.volumeLevel;
    }

    public void setOn_Off(boolean on_off) {
        if(on_off == true){
            this.on_off = true;
        }else{
            this.on_off = false;
        }
    }

    public boolean getOn_Off(){
        return on_off;
    }

    public void channelUp() {
        if (on_off && channel < 120)
            channel++;
    }

    public void channelDown() {
        if (on_off && channel > 1)
            channel--;
    }

    public void volumeUp() {
        if (on_off && volumeLevel < 7)
            volumeLevel++;
    }

    public void volumeDown() {
        if (on_off && volumeLevel > 1)
            volumeLevel--;
    }

    @Override
    public String toString() {
        return "Channel = " + channel + ", VolumeLevel = " + volumeLevel + ", on = " + on_off;
    }

}//class