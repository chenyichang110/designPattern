package com.atguigu.facade;

public class DVDPlayer {

  private static DVDPlayer instance = new DVDPlayer();

  public static DVDPlayer getInstance() {
    return instance;
  }

  public void on() {
    System.out.println("dvd on");
  }

  public void off() {
    System.out.println("dvd off");
  }

  //播放
  public void play() {
    System.out.println("dvd is palying");
  }

  //暂停
  public void pause() {
    System.out.println("dvd pause ..");
  }
}
