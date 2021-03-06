// $Id$

package me.kukkii.janken.bot;

import me.kukkii.janken.Hand;
import me.kukkii.janken.R;
import android.graphics.drawable.Drawable;

public class Rock100Bot extends AbstractBot {

  public Rock100Bot(){
    super();
    hp = 3;
  }

  public Rock100Bot(long id, String name){
    super(id, name);
  }

  public int hand(){
    return Hand.ROCK.value();
  }

  public int getImage(){
    return R.drawable.girl_blue;
  }

  public int getSong(){
    return R.raw.bgm1;
  }
  
  public int getJan(){
    return R.raw.janken;
  }

  public int getKen(){
    return R.raw.janken;

  }

  public int getPon(){
    return R.raw.janken;
  }
  
}
