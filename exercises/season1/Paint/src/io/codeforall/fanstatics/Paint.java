package io.codeforall.fanstatics;


import io.codeforall.fanstatics.gfx.simplegfx.SimpleGfxGrid;
import io.codeforall.fanstatics.gfx.simplegfx.SimpleGfxGridPosition;
import io.codeforall.fanstatics.grid.Grid;
import io.codeforall.fanstatics.grid.GridColor;
import io.codeforall.fanstatics.grid.GridDirection;
import io.codeforall.fanstatics.grid.SimpleGfxGridFactory;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Paint implements KeyboardHandler {
    private int cols;
    private int rows;
    private Keyboard keyboard;
    private SimpleGfxGrid grid;
    private SimpleGfxGridPosition[][] positions;
    private boolean[][] blackOn;
    private SimpleGfxGridPosition cursor;

    public Paint(int cols, int rows) {
        this.cols = cols;
        this.rows = rows;
        this.grid = SimpleGfxGridFactory.makeGrid(cols, rows);
        this.grid.init();
        this.positions = new SimpleGfxGridPosition[this.grid.getCols()][this.grid.getRows()];
        this.blackOn = new boolean[this.grid.getCols()][this.grid.getRows()];
        for (int i = 0; i < this.grid.getCols(); i++) {
            for (int j = 0; j < this.grid.getRows(); j++) {
                this.positions[i][j] = new SimpleGfxGridPosition(i, j, this.grid);
                this.blackOn[i][j] = false;
            }
        }
        this.cursor = new SimpleGfxGridPosition(0, 0, this.grid);
        this.cursor.setColor(GridColor.GREEN);

        initKeyboard();
    }

    public void clear() {
        for (int i = 0; i < this.grid.getCols(); i++) {
            for (int j = 0; j < this.grid.getRows(); j++) {
                this.positions[i][j].rectangle.delete();
                this.positions[i][j] = new SimpleGfxGridPosition(i, j, this.grid);
                this.blackOn[i][j] = false;
            }
        }
    }

    public void save() throws IOException {
        FileOutputStream outputStream = new FileOutputStream("rsc/board");
        for (int i = 0; i < this.grid.getCols(); i++) {
            for (int j = 0; j < this.grid.getRows(); j++) {
                if (this.blackOn[i][j]) {
                    outputStream.write(1);
                    continue;
                }
                outputStream.write(0);
            }
        }
        outputStream.close();
    }

    public void load() throws IOException {
        FileInputStream inputStream = new FileInputStream("rsc/board");
        int b;
        for (int i = 0; i < this.grid.getCols(); i++) {
            for (int j = 0; j < this.grid.getRows(); j++) {
                b = inputStream.read();
                if (b == 0) {
                    this.blackOn[i][j] = false;
                    this.positions[i][j].rectangle.draw();
                    continue;
                }
                this.blackOn[i][j] = true;
                this.positions[i][j].rectangle.setColor(Color.BLACK);
                this.positions[i][j].rectangle.fill();
            }
        }
    }

    private void initKeyboard() {
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

        KeyboardEvent space = new KeyboardEvent();
        space.setKey(KeyboardEvent.KEY_SPACE);
        space.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        this.keyboard.addEventListener(space);

        KeyboardEvent c = new KeyboardEvent();
        c.setKey(KeyboardEvent.KEY_C);
        c.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        this.keyboard.addEventListener(c);

        KeyboardEvent s = new KeyboardEvent();
        s.setKey(KeyboardEvent.KEY_S);
        s.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        this.keyboard.addEventListener(s);

        KeyboardEvent l = new KeyboardEvent();
        l.setKey(KeyboardEvent.KEY_L);
        l.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        this.keyboard.addEventListener(l);
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_RIGHT:
                this.cursor.moveInDirection(GridDirection.RIGHT, 1);
                break;
            case KeyboardEvent.KEY_LEFT:
                this.cursor.moveInDirection(GridDirection.LEFT, 1);
                break;
            case KeyboardEvent.KEY_UP:
                this.cursor.moveInDirection(GridDirection.UP, 1);
                break;
            case KeyboardEvent.KEY_DOWN:
                this.cursor.moveInDirection(GridDirection.DOWN, 1);
                break;
            case KeyboardEvent.KEY_SPACE:
                boolean black = this.blackOn[this.cursor.getCol()][this.cursor.getRow()];
                if (black) {
                    this.blackOn[this.cursor.getCol()][this.cursor.getRow()] = false;
                    this.positions[this.cursor.getCol()][this.cursor.getRow()].rectangle.draw();
                    new SimpleGfxGridPosition(this.cursor.getCol(), this.cursor.getRow(), this.grid);
                    break;
                }
                this.blackOn[this.cursor.getCol()][this.cursor.getRow()] = true;
                this.positions[this.cursor.getCol()][this.cursor.getRow()].rectangle.setColor(Color.BLACK);
                this.positions[this.cursor.getCol()][this.cursor.getRow()].rectangle.fill();
                break;
            case KeyboardEvent.KEY_C:
                this.clear();
                break;
            case KeyboardEvent.KEY_S:
                try {
                    this.save();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                break;
            case KeyboardEvent.KEY_L:
                try {
                    this.load();
                } catch (IOException e){
                    throw new RuntimeException(e);
                }
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
