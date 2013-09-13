package org.ldv.melun.sio.swingpac.etudiants;

import java.awt.Color;

import org.ldv.melun.sio.swingpac.Bidule;

public class MonBidule extends Bidule {

  private int nbDeplacements;

  public MonBidule() {
    super("Batman");
    setBackground(Color.BLACK);
    nbDeplacements = 0;
  }

  @Override
  public void doMove() {
    nbDeplacements++;
    super.doMove();
    // tous les 200 deplacements et si descente
    if (isGoDown() && nbDeplacements % 200 == 0) 
      if (isGoLeft())
        goOnRight();
      else
        goOnLeft();
  }

}
