package com.imooc.design.pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dell on 2019/4/8.
 */
public class CourseCatalog extends CatalogComponent{
    private List<CatalogComponent> items = new ArrayList<CatalogComponent>();
    private String name;

    public CourseCatalog(String name) {
        this.name = name;
    }

    @Override
    public void add(CatalogComponent catalogComponent) {
        items.add(catalogComponent);
    }

    @Override
    public void remove(CatalogComponent catalogComponent) {
        items.remove(catalogComponent);
    }

    @Override
    public void print() {
        System.out.println(this.name);
        for (CatalogComponent catalogComponent: items) {
            System.out.print("  ");
            catalogComponent.print();
        }
    }
}
