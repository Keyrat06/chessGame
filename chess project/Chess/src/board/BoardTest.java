package board;

import static org.junit.Assert.*;

import org.junit.Test;

public class BoardTest {

	@Test
	public void test() {
		Board newBoard = new Board();
		
		
		
		
		Integer[] start = new Integer[2];
		start[0] = 4;
		start[1] = 1;
		Integer[] end = new Integer[2];
		end[0] = 4;
		end[1] = 3;
		System.out.println(newBoard.viewBoard());
		newBoard.move(start,end);
		System.out.println(newBoard.viewBoard());
		
		
		
		
		
		
		
		/*
		
		Integer[] start1 = new Integer[2];
		start1[0] = 4;
		start1[1] = 6;
		Integer[] end1 = new Integer[2];
		end1[0] = 4;
		end1[1] = 4;
		System.out.println(newBoard.viewBoard());
		newBoard.move(start1,end1);
		System.out.println(newBoard.viewBoard());
		
		
		Integer[] start2 = new Integer[2];
		start2[0] = 4;
		start2[1] = 0;
		Integer[] end2 = new Integer[2];
		end2[0] = 4;
		end2[1] = 1;
		System.out.println(newBoard.viewBoard());
		newBoard.move(start2,end2);
		System.out.println(newBoard.viewBoard());
		
		assertTrue(true);
		
		*/
	}

}
