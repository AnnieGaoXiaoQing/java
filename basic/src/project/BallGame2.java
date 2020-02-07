package project;

import javax.swing.*;
import java.awt.*;

/**
 * 任意跑
 */
public class BallGame2 extends JFrame {
    // 加载图片
    Image ball = Toolkit.getDefaultToolkit().getImage("/images/ball.png");
    Image desk = Toolkit.getDefaultToolkit().getImage("/images/desk.pnd");

    double x = 100; //小球的横坐标
    double y = 100; // 小球的纵坐标



    // 画窗口的方法
    public void paint(Graphics graphics){
        System.out.print("窗口被画了一次");
        graphics.drawImage(desk,0,0,null);
        graphics.drawImage(ball,(int)x,(int)y,null);


    }

    // 窗口加载
    void lauchFrame(){
        setSize(856,500);
        setLocation(400, 400);
        setVisible(true);

        // 重画窗口，25次
        while(true){
            repaint();
            try{
                Thread.sleep(40); // 40ms 1m=1000ms 大约1秒25次
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args){
        System.out.printf("游戏Game来了");
        BallGame ballGame = new BallGame();
        ballGame.lauchFrame();
    }
}
