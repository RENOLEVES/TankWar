package com.zhengxuan99.tank;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        TankFrame tf = new TankFrame();


        while (true) {
            Thread.sleep(50);
            tf.repaint();
        }
    }

}
