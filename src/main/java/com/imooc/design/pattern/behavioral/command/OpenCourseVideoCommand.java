package com.imooc.design.pattern.behavioral.command;

/**
 * Created by dell on 2019/4/11.
 */
public class OpenCourseVideoCommand implements Command {
    private CourseVideo courseVideo;

    public OpenCourseVideoCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    public void execute() {
        courseVideo.open();
    }
}
