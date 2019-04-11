package com.imooc.design.pattern.behavioral.State;

/**
 * Created by dell on 2019/4/11.
 */
public class SpeedState  extends CourseVideoState  {
    public void play() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.PLAY_STATE);
    }

    public void speed() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.SPEED_STATE);
    }

    public void pause() {
        System.out.println("SPEED");
    }

    public void stop() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.STOP_STATE);
    }
}
