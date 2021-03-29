package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void whenReturnPositionIsTrue() {
        BishopBlack bishopBlack1 = new BishopBlack(Cell.A8);
        assertEquals(bishopBlack1.position(), Cell.A8);
    }

    @Test
    public void way() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] expected = new Cell[]{Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        Cell[] result = bishopBlack.way(Cell.G5);
        assertArrayEquals(expected, result);
    }

    @Test
    public void whenFromA1ToH8ThenIsDiagonal() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        assertTrue(bishopBlack.isDiagonal(bishopBlack.position(), Cell.H8));
    }

    @Test
    public void whenFromA1ToH7ThenIsNotDiagonal() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        assertFalse(bishopBlack.isDiagonal(bishopBlack.position(), Cell.H7));
    }

    @Test
    public void copy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        Figure figure = bishopBlack.copy(Cell.B2);
        assertEquals(figure.getClass().getSimpleName(), bishopBlack.getClass().getSimpleName());
    }
}