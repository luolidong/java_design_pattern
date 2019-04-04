package com.imooc.design.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dell on 2019/3/25.
 */
public class TeamLeader {
    public void checkNumberOfCourse() {
        List<Course> courseList = new ArrayList<Course>();
        for(int i = 0; i < 20; i++) {
            courseList.add(new Course());
        }
        System.out.println("num:" + courseList.size());
    }
}
