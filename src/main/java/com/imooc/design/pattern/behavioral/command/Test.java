package com.imooc.design.pattern.behavioral.command;

/**
 * Created by dell on 2019/4/11.
 */
public class Test {
    public static void main(String[] args) {
        CourseVideo courseVideo = new CourseVideo("Java");

        OpenCourseVideoCommand openCourseVideoCommand = new OpenCourseVideoCommand(courseVideo);
        CloseCourseVideoCommand closeCourseVideoCommand = new CloseCourseVideoCommand(courseVideo);

        Staff staff = new Staff();
        staff.addCommand(openCourseVideoCommand);
        staff.addCommand(closeCourseVideoCommand);

        staff.executeCommands();
    }
}
