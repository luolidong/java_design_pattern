package com.imooc.design.pattern.behavioral.State;

/**
 * Created by dell on 2019/4/11.
 */
public class StopState  extends CourseVideoState  {
    public void play() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.PLAY_STATE);
    }

    public void speed() {
        System.out.println("STOP , CANT SPEED");
    }

    public void pause() {
        System.out.println("STOP , CANT PAUSE");
    }

    public void stop() {
        System.out.println("stop");
    }
}
