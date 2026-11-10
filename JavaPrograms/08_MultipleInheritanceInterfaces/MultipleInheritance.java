interface Camera {
    void takePhoto();
}

interface MusicPlayer {
    void playMusic();
}

interface Phone {
    void makeCall(String number);
}

class SmartPhone implements Camera, MusicPlayer, Phone {
    String model;

    SmartPhone(String model) {
        this.model = model;
    }

    public void takePhoto() {
        System.out.println(model + " is taking a photo");
    }

    public void playMusic() {
        System.out.println(model + " is playing music");
    }

    public void makeCall(String number) {
        System.out.println(model + " is calling " + number);
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone("Galaxy X");
        sp.takePhoto();
        sp.playMusic();
        sp.makeCall("9876543210");

        Camera c = sp;
        MusicPlayer m = sp;
        c.takePhoto();
        m.playMusic();
    }
}
