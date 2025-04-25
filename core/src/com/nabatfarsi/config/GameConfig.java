package com.nabatfarsi.config;

/**
 * Created by goran on 22/08/2016.
 */
public class GameConfig {

    public static final float WIDTH = 1200f; // pixels
    public static final float HEIGHT = 640f; // pixels


    public static final float WORLD_WIDTH = 10f; // world units
    public static final float WORLD_HEIGHT = 6.0f; // world units

    public static final float WORLD_CENTER_X = WORLD_WIDTH / 2f; // world units
    public static final float WORLD_CENTER_Y = WORLD_HEIGHT / 2f; // world units

    public static final float OBSTACLE_BOUNDS_RADIUS = .05f; // world units
    public static final float OBSTACLE_SIZE =60f * OBSTACLE_BOUNDS_RADIUS; // world units


    public static final float PLAYER_BOUNDS_RADIUS = .6f; // world units
    public static final float PLAYER_SIZE = 5f * PLAYER_BOUNDS_RADIUS; // world units

    public static final float PLAYER_DEMO_BOUNDS_RADIUS = 1f; // world units
    public static final float PLAYER__DEMO_SIZE = 1.25f * PLAYER_DEMO_BOUNDS_RADIUS; // world units
    public static final float BALLOON__DEMO_SIZE = 2f * PLAYER_DEMO_BOUNDS_RADIUS; // world units

    public static final float PLAYER_SIZE_SCALER_WHEN_DRAGED = 1.6f ; // world units

    public static final float BIRD_START_X = WORLD_WIDTH-1;
    public static final float BIRD_START_y = WORLD_HEIGHT-1;
    public static final float BIRD_BOUNDS_RADIUS = .3f; // world units
    public static final float BIRD_SIZE = 1* BIRD_BOUNDS_RADIUS; // world units

    public static final float PEN_HEIGHT =1f ; //WorldUnit
    public static final float PEN_PAD =.2f ; //WorldUnit
    public static final float PEN_SCALE_DOWN =.8f ; //WorldUnit
    public static final float PEN_SCALE_UP =1f ; //WorldUnit
    public static final float PEN_SCALE_DURATION =.5f ; //WorldUnit
    public static final float PEN_FADOUT_DURATION =.0000001f ; //WorldUnit
    public static final float PEN_FADIN_DURATION =5f ; //WorldUnit


    public static final float MIN_CONFETTY_HEIGHT =.1f ; //WorldUnit
    public static final float MAX_CONFETTY_HEIGHT =.8f ; //WorldUnit

    public static final float MIN_X_CONFETTIPOSITION =0f ; //WorldUnit
    public static final float MAX_X_CONFETTIPOSITION =10f ; //WorldUnit
    public static final float CONFETTI_DURATION =7f ; //WorldUnit
    public static final int CONFETTY_NUMBER = 200;
    public static final float CONFETTI_SCALE =1.5f ; //WorldUnit
    public static final float CONFETTY_STARTING_Y = WORLD_HEIGHT - .5f;
    public static final float CONFETTY_ROTATION = 360;


    public static final float REPLAY_HEIGHT =2f ; //WorldUnit
    public static final float TOUCH_BOUNDS_RADIUS = .1f; // world units
    public static final int LEVEL = 0;

    public static final int NUMBER_OF_LEVEL = 63;
    public static final float REJECTIONSIZE = 1f;
    public static final float BACKGROUND_MUSIC_VOLUME =0.2f ;
    public static final int LEVELSTEP = 1;
    public static final float TRANSITIONFROMPLAY2DEMOINODDLEVELS = 2f;// sec;

    //loading page
    public static final float CHICK_SPEED = 0.2f;
    public static final int CHICK_FRAME_NUM = 6;
    public static final float CHICK_Y = 2f;
    public static final float CHICK_HEIGHT = 0.5f;
    public static final float CIRCLE_HEIGHT = 0.5f;
    public static final float CIRCLE_X = 9.4f;
    public static final float CIRCLE_Y = .1f;

    public static final int MENU_NUM = 6;//including 0; if 7 menue, should put 6


    //public static final boolean ISPURCHASED = com.nabatfarsi.common.GameManager.INSTANCE.get_IspurchasedKey();
    public static final String GAME_NAME ="nabatfarsi" ;
    public static final String PLAY_ENCODED_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAy81PMzcIV+iTh9KMhBEymE1oLTKUyLADEfxwr8UDdXNW0hdwihd3lR+b8zWxvwkmHpbFBOwm8FbYF3at1EFvJ/kaU1PemOfW7A4Sd0wv+JFIKlho7H+MZ8Mcwc/CfQWY8Wb1Bpz06etboSgv+KtOu67JeensTDRmzxUczje39xUmg+62fwGWS1S9XlWqyoW1kFXrjC9G0Xa864ltED7GfVBlfdUykGYqTTgqjPOC2jtGe1HjP9z5uQjTHqAesxRsDijOvJRjdZl8Rkk+aEKWnHfsFf9G/qEjUmV3hUGLAwGSA7sXZUoOOh0zIxOQlS2s135c2DcJHqb4lmnmCyMQ2wIDAQAB";
    public static final String BAZZAR_ENCODED_PUBLIC_KEY = "MIHNMA0GCSqGSIb3DQEBAQUAA4G7ADCBtwKBrwDMQGA5l6e8IBvrnk73FiwUduB6adN4pUfUzB6R1uGdlwhNTFKKGhjPHIyzTb3BQdvtGou4GpjAf23uHozNa+tWqIvlBTX+yyZemdKO4Lqle2lkhgR8IpHdBfauAHkdNWC8ruDWRyY2KIh5PmvzRvQPfTQHkivzVaI2priH1Va1F74hpUo2XTQkBhIP3lN6CAKAg5NHcuEXaEpjJeUaTs3x3R1LpaxLvamrVrx6Dk8CAwEAAQ==";
    public static final String MYKET_ENCODED_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCa0wzhj1mqmhfA5DIR4zlAEofRIzk35JiM67pVE8Cj/myjHSyjaXsr/rptYbHI20B+UXSvg4ruBOuAbWeQEu5B8jr/AivlKO7w6eLDcAGhp1H4Nk4+uLn3sSgdyRhcWKwX4Cv9rfR1gTr1y7cfzazOtZOKHzgaXzKFENBrZk2jWwIDAQAB";

    private GameConfig() {
    }
}
