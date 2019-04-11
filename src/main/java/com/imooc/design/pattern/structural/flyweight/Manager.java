package com.imooc.design.pattern.structural.flyweight;

/**
 * Created by dell on 2019/4/8.
 */
public class Manager implements Employee {
    public void report() {
        System.out.println(reportContent);
    }

    private String department;
    private String reportContent;

    public Manager(String department) {
        this.department = department;
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }
}
