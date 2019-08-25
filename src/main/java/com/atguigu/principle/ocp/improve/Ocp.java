package com.atguigu.principle.ocp.improve;

public class Ocp {

    public static void main(String[] args) {

        GraphicEditor graphicEditor = new GraphicEditor();

        graphicEditor.drawShape(new Rectangle());

        graphicEditor.drawShape(new Circle());

        //如果需要扩展功能只需要 新增类，而不需要修改使用方GraphicEditor这个类
        //就遵循了ocp原则

    }
}

class GraphicEditor {
    public void drawShape(Shape shape) {
        shape.draw();
    }
}

abstract class Shape {

    int type;

    abstract void draw();
}

class Rectangle extends Shape {
    Rectangle() {
        super.type = 1;
    }

    @Override
    void draw() {
        System.out.println("绘制矩形");
    }
}

class Circle extends Shape {
    Circle() {
        super.type = 2;
    }

    void draw() {
        System.out.println("绘制圆形");
    }
}


