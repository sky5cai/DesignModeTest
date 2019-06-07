package appearanceMode;

import appearanceMode.model.*;

/**
 * @Author:zhanCai
 * @Description:
 * @Date:Created in  23:13 2019/6/5
 * @Modified by
 */
public class HomeTheaterFacade {
    Amplifier amp;
    Tuner tuner;
    DvdPlayer dvdPlayer;
    Projector projector;
    TheaterLights theaterLights;
    Screen screen;
    PopcornPopper popcornPopper;

    public HomeTheaterFacade(Amplifier amp, Tuner tuner, DvdPlayer dvdPlayer, Projector projector, TheaterLights theaterLights, Screen screen, PopcornPopper popcornPopper) {
        this.amp = amp;
        this.tuner = tuner;
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.theaterLights = theaterLights;
        this.screen = screen;
        this.popcornPopper = popcornPopper;
    }

    public void watchMovie(String movie){
        System.out.println("Get ready to watch a movie...");
        popcornPopper.on();
        popcornPopper.pop();
        theaterLights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setDvd(dvdPlayer);
        amp.setSurroundSoud();
        amp.setVolume(5);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie(){
        System.out.println("Shutting movie theater down...");
        popcornPopper.off();
        theaterLights.on();
        screen.up();
        projector.off();
        amp.off();
        dvdPlayer.stop();
        dvdPlayer.eject();
        dvdPlayer.off();
    }
}
