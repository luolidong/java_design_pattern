package com.imooc.design.pattern.behavioral.State;

/**
 * Created by dell on 2019/4/11.
 */
public class PlayState  extends CourseVideoState  {
    public void play() {
        System.out.println("正常播放状态");
    }

    public void speed() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.SPEED_STATE);
    }

    public void pause() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.PAUSE_STATE);
    }

    public void stop() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.STOP_STATE);
    }
}
