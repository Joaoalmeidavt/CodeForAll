package io.codeforall.fanstatics;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.security.Key;


public class Car implements KeyboardHandler {
    private Keyboard keyboard;
    private Picture picture;

    public Car(){
        picture = new Picture(20, 20, "rsc/home-time-noddy.gif");
        picture.draw();

        initKeyboard();
    }

    private void initKeyboard(){
        this.keyboard = new Keyboard(this);

        KeyboardEvent moveRight = new KeyboardEvent();
        moveRight.setKey(KeyboardEvent.KEY_RIGHT);
        moveRight.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        this.keyboard.addEventListener(moveRight);

        KeyboardEvent moveLeft = new KeyboardEvent();
        moveLeft.setKey(KeyboardEvent.KEY_LEFT);
        moveLeft.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        this.keyboard.addEventListener(moveLeft);

        KeyboardEvent moveUp = new KeyboardEvent();
        moveUp.setKey(KeyboardEvent.KEY_UP);
        moveUp.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        this.keyboard.addEventListener(moveUp);

        KeyboardEvent moveDown = new KeyboardEvent();
        moveDown.setKey(KeyboardEvent.KEY_DOWN);
        moveDown.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        this.keyboard.addEventListener(moveDown);
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent){
        switch (keyboardEvent.getKey()){
            case KeyboardEvent.KEY_RIGHT:
                picture.translate(10, 0);
                break;
            case KeyboardEvent.KEY_LEFT:
                picture.translate(-10, 0);
                break;
            case KeyboardEvent.KEY_UP:
                picture.translate(0, -10);
                break;
            case KeyboardEvent.KEY_DOWN:
                picture.translate(0, 10);
                break;
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent){

    }


}
