package com.imooc.design.pattern.behavioral.memento;

/**
 * Created by dell on 2019/4/11.
 */
public class Test {
    public static void main(String[] args) {
        ArticleMementoManager articleMementoManager = new ArticleMementoManager();

        Article article = new Article("A", "A", "A");

        articleMementoManager.addMemento(article.saveToMemento());

        System.out.println("修改");

        article.setTitle("B");
        article.setContent("B");
        article.setImgs("B");

        articleMementoManager.addMemento(article.saveToMemento());
        article.undoFromMemento(articleMementoManager.getMemento());
        System.out.println(article.toString());
    }
}
