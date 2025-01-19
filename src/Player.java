public class Player {
    private int highscore;
    private int pY;
    private int pX;

    public Player(){
        this(500);
    }

    public Player(int x_){
        highscore = 0;
        pX = x_;
        pY = 500;
    }

    public int getHighscore(){
        return highscore;
    }

    public void setHighscore(int hs){
        highscore = hs;
    }

    public void incHighscore(){
        highscore+=10;
    }

    public void incHighscoreDouble(){
        highscore+=20;
    }

    public int getpX(){
        return pX;
    }

    public int getpY(){
        return pY;
    }

    public void moveL(){
        if (pX>=100){
            pX-=10;
        }
    }

    public void moveR(){
        if(pX<=700){
            pX+=10;
        }
    }


}
