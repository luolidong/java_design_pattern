package com.imooc.design.pattern.creational.prototype;

/**
 * Created by dell on 2019/4/3.
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("init");
        for (int i = 0; i< 10; i++) {
            Mail nailTemp = (Mail) mail.clone();
            nailTemp.setName("姓名" +i);
            nailTemp.setEmailAddress("姓名"+i+"@imooc.com");
            nailTemp.setContent("中奖");
            MailUtil.sendMail(nailTemp);
        }
        MailUtil.saveOriginMailRecord(mail);
    }
}
