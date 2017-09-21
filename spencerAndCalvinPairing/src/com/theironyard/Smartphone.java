package com.theironyard;

/**
 * Created by calvinwebster on 9/21/17.
 */
public class Smartphone implements CameraPhone, TextMessage, PhoneCall, Comparable<Smartphone> {

    private double size;
    private int totalPictures = 0;

    public double getSize() {
        return size;
    }

    @Override
    public void capture() {
        System.out.println("Say Cheese! We just captured your picture!");

    }

    @Override
    public void savePicture() {
        totalPictures += 1;
        System.out.println("Your picture has been saved! You now have " + totalPictures);

    }

    @Override
    public void flash() {
        System.out.println("Bling Bling!");

    }

    @Override
    public void talk() {
        System.out.println("WaWaWa");

    }

    @Override
    public void dial() {
        System.out.println("Tone Tone Tone has done it again");

    }

    @Override
    public void listen() {
        System.out.println("shhhhhhh");

    }

    @Override
    public void send() {
        System.out.println("It gone!");

    }

    @Override
    public void type() {
        System.out.println("Click Click Clack");

    }

    @Override
    public void receive() {
        System.out.println("Hello?!");

    }

    @Override
    public int compareTo(Smartphone smartphone) {
        if(this.size > smartphone.getSize()) {
            return 1;
        } else if (this.size < smartphone.getSize()) {
            return -1;
        } else {
            return 0;
        }
    }

    public Smartphone(double size) {
        this.size = size;
    }
}
