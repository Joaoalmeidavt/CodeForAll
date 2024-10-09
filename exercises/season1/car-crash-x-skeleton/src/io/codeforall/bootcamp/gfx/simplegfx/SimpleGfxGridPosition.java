package io.codeforall.bootcamp.gfx.simplegfx;

import io.codeforall.bootcamp.grid.GridDirection;
import io.codeforall.bootcamp.grid.position.AbstractGridPosition;
import io.codeforall.bootcamp.grid.position.GridPosition;
import io.codeforall.bootcamp.grid.GridColor;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import java.awt.*;

/**
 * Simple graphics position
 */
public class SimpleGfxGridPosition extends AbstractGridPosition {

    private Rectangle rectangle;
    private SimpleGfxGrid simpleGfxGrid;
    private SimpleGfxGrid grid;

    /**
     * Simple graphics position constructor
     *
     * @param grid Simple graphics grid
     */
    public SimpleGfxGridPosition(SimpleGfxGrid grid) {
        super((int) (Math.random() * grid.getCols()), (int) (Math.random() * grid.getRows()), grid);
        this.grid = grid;
        this.rectangle = new Rectangle(grid.PADDING + super.getCol() * grid.getCellSize(),
                grid.PADDING + super.getRow() * grid.getCellSize(),
                grid.getCellSize(),
                grid.getCellSize());
        //throw new UnsupportedOperationException();
    }

    /**
     * Simple graphics position constructor
     *
     * @param col  position column
     * @param row  position row
     * @param grid Simple graphics grid
     */
    public SimpleGfxGridPosition(int col, int row, SimpleGfxGrid grid) {
        super(col, row, grid);
        this.grid = grid;
        this.rectangle = new Rectangle(grid.PADDING + col * grid.getCellSize(),
                grid.PADDING + row * grid.getCellSize(),
                grid.getCellSize(),
                grid.getCellSize());

        this.rectangle.setColor(Color.GREEN);
        this.rectangle.draw();
        this.rectangle.fill();
        //throw new UnsupportedOperationException();
    }

    /**
     * @see GridPosition#show()
     */
    @Override
    public void show() {
        //throw new UnsupportedOperationException();
        //this.simpleGfxGrid.init();
        this.rectangle.setColor(Color.GREEN);
        this.rectangle.draw();
        this.rectangle.fill();
    }

    /**
     * @see GridPosition#hide()
     */
    @Override
    public void hide() {
        //throw new UnsupportedOperationException();
        this.rectangle.delete();
    }

    /**
     * @see GridPosition#moveInDirection(GridDirection, int)
     */
    @Override
    public void moveInDirection(GridDirection direction, int distance) {
        int oldX = this.getCol();
        int oldY = this.getRow();
        super.moveInDirection(direction, distance);
        int newX = this.getCol();
        int newY = this.getRow();
        this.rectangle.translate((newX - oldX)*this.grid.getCellSize(), (newY - oldY)*this.grid.getCellSize());
    }

    /**
     * @see AbstractGridPosition#setColor(GridColor)
     */
    @Override
    public void setColor(GridColor color) {
        super.setColor(color);
        this.rectangle.setColor(SimpleGfxColorMapper.getColor(color));
    }


}
