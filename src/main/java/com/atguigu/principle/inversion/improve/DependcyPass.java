package com.atguigu.principle.inversion.improve;

import lombok.NoArgsConstructor;

//依赖关系传递的三种方式
public class DependcyPass {

    public static void main(String[] args) {
        ChangHong changHong = new ChangHong();

        //方式1
        OpenAndClose openAndClose1 = new OpenAndClose();
        openAndClose1.open(changHong);

        //方式2
        OpenAndClose openAndClose2 = new OpenAndClose(changHong);
        openAndClose2.open();

        OpenAndClose openAndClose3 = new OpenAndClose();
        openAndClose3.setTv(changHong);
        openAndClose3.open();


    }

}


// 开关的接口
interface IOpenAndClose {
    public void open(ITV tv); //抽象方法,接收接口

    // 方式3 , 通过setter方法传递
    public void setTv(ITV tv);
}

interface ITV { //ITV接口
    public void play();
}

class ChangHong implements ITV {

    @Override
    public void play() {
        System.out.println("长虹电视机，打开");
    }

}

// 实现接口
@NoArgsConstructor
class OpenAndClose implements IOpenAndClose {

    //方式1：通过接口依赖
    public void open(ITV tv) {
        tv.play();
    }


    // 方式2: 通过构造方法依赖传递
    private ITV tv;

    public OpenAndClose(ITV tv) {
        this.tv = tv;
    }

    public void open() {
        tv.play();
    }

    // 方式3 , 通过setter方法传递
    @Override
    public void setTv(ITV tv) {
        this.tv = tv;
    }
}


