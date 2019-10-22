package com.atguigu.facade;

//外观类
public class HomeTheaterFacade {

  private DVDPlayer dvdPlayer;
  private Popcorn popcorn;
  private Projector projector;
  private Screen screen;
  private Stereo stereo;
  private TheaterLight theaterLight;


  public HomeTheaterFacade() {
    super();
    dvdPlayer = DVDPlayer.getInstance();
    popcorn = Popcorn.getInstance();
    projector = Projector.getInstance();
    screen = Screen.getInstance();
    stereo = Stereo.getInstance();
    theaterLight = TheaterLight.getInstance();
  }

  //准备
  public void ready() {
    popcorn.on();
    popcorn.pop();

    screen.down();

    projector.on();

    stereo.on();

    dvdPlayer.on();

    theaterLight.dim();
  }

  public void play() {
    dvdPlayer.play();
  }

  public void pause() {
    dvdPlayer.pause();
  }

  public void off() {
    popcorn.off();
    theaterLight.bright();
    screen.up();
    projector.off();
    stereo.off();
    dvdPlayer.off();
  }

}
