import exceptions.AlreadyOccupiedException;
import exceptions.InvalidPointException;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class FieldTest {

    @Test
    void testGetFieldSize() {
        final Field field = new Field();
        assertEquals(3, field.getSize());
    }

    @Test
    void testSetFigure() throws InvalidPointException, AlreadyOccupiedException {
        final Field field = new Field();
        final Point inputPoint = new Point(0, 0);
        final Figure inputFigure = Figure.O;

        field.setFigure(inputPoint, inputFigure);
        final Figure actualFigure = field.getFigure(inputPoint);

        assertEquals(inputFigure, actualFigure);
    }
    @Test
    void testGetFigureWhenFigureIsNotSet() throws InvalidPointException, AlreadyOccupiedException {
        final Field field = new Field();
        final Point inputPoint = new Point(0, 0);
        final Figure actualFigure = field.getFigure(inputPoint);

        assertNull(actualFigure);
    }

    @Test
    void testGetFigureWhenXIsLessThenZero() throws InvalidPointException, AlreadyOccupiedException {
        final Field field = new Field();
        final Point inputPoint = new Point(-1, 0);

        try {
            final Figure actualFigure = field.getFigure(inputPoint);
            fail();
        } catch(final InvalidPointException e){

        }
    }
    @Test
    void testGetFigureWhenYIsLessThenZero() throws InvalidPointException, AlreadyOccupiedException {
        final Field field = new Field();
        final Point inputPoint = new Point(0, -1);

        try {
            final Figure actualFigure = field.getFigure(inputPoint);
            fail();
        } catch(final InvalidPointException e){

        }
    }

    @Test
    void testGetFigureWhenXIsMoreThenSize() throws InvalidPointException, AlreadyOccupiedException {
        final Field field = new Field();
        final Point inputPoint = new Point(field.getSize() + 1, 0);

        try {
            final Figure actualFigure = field.getFigure(inputPoint);
            fail();
        } catch(final InvalidPointException e){

        }
    }
    @Test
    void testGetFigureWhenYIsMoreThenSize() throws InvalidPointException, AlreadyOccupiedException {
        final Field field = new Field();
        final Point inputPoint = new Point(0, field.getSize() + 1);

        try {
            final Figure actualFigure = field.getFigure(inputPoint);
            fail();
        } catch(final InvalidPointException e){

        }
    }
}