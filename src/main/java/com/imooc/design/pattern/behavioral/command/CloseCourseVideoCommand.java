package com.imooc.design.pattern.behavioral.command;

/**
 * Created by dell on 2019/4/11.
 */
public class CloseCourseVideoCommand implements Command {
    private CourseVideo courseVideo;

    public CloseCourseVideoCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    public void execute() {
        courseVideo.close();
    }
}
