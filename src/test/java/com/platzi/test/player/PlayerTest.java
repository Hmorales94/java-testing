package com.platzi.test.player;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void play_diceValueIsLower_lose (){

        Dice dice =  Mockito.mock(Dice.class);
        //Permite simular un valor específico del dado, menor en este caso.
        Mockito.when(dice.roll()).thenReturn(2);
        Player player = new Player(dice, 3);

        assertFalse(player.play());
    }

    @Test
    public void play_diceValueIsHigher_win (){

        Dice dice =  Mockito.mock(Dice.class);
        //Permite simular un valor específico del dado, ahora mayor.
        Mockito.when(dice.roll()).thenReturn(4);
        Player player = new Player(dice, 3);

        assertTrue(player.play());
    }

}