package com.imooc.design.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dell on 2019/3/25.
 */
public class Boss {
    //违背迪米特法则，boos不应该调用course
    public void commandCheckNumber(TeamLeader teamLeader) {

        teamLeader.checkNumberOfCourse();
    }
}
