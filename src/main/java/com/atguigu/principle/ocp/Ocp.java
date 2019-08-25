package com.atguigu.principle.ocp;

/**
 * 开闭原则
 */
public class Ocp {
    public static void main(String[] args) {

    }
}

//绘图的类 （使用方）
class GraphicEditor {

    public void drawShape(Shape shape) {
        if (shape.type == 1) {
            drawRectangle(shape);
        } else if (shape.type == 2) {
            drawCircle(shape);
        }

    }

    private void drawRectangle(Shape shape) {
        System.out.println("绘制矩形");
    }

    private void drawCircle(Shape shape) {
        System.out.println("绘制圆形");
    }
}

//绘图 基类
class Shape {
    //表明画哪种图形
    int type;
}

//画矩形
class Rectangle extends Shape {
    Rectangle() {
        super.type = 1;
    }
}

//画圆形
class Circle extends Shape {
    Circle() {
        super.type = 2;
    }
}


