package com.imooc.design.principle.demeter;

/**
 * Created by dell on 2019/3/25.
 */
public class Test {
    public static void main(String[] args) {
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.commandCheckNumber(teamLeader);
    }
}
