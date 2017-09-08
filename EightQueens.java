package com.deitel.exercicios.Capitulo7.Cap7_23;


public class EightQueens
{
	private int[][] board;
	private int currentRow;
	private int currentColumn;
	
	public EightQueens( int[][] board, int currentRow, int currentColumn )
	{
		this.board = board;
		this.currentColumn = currentColumn;
		this.currentRow = currentRow;
	}
	
	public void processElimineSquadBoard()
	{
		int i = 0;
		
		for( int row = currentRow; row < 8; row++ )	
			board[ row ][ currentColumn ] = 1;
		
		for( int column = currentColumn; column < 8; column++ )	
			board[ currentRow ][ column ] = 1;
		
		for( int row = currentRow; row < 8; row++ )
		{
			
			for( int column = currentColumn; column < 8; column++ )
			{
				if( currentColumn + i < 8 && currentRow + i < 8 )
				{
					if( row == currentRow + i && column == currentColumn + i  )
						board[row][column] = 1;
				}

			}
			++i;
		}
	}
	
	public void printArray()
	{
		for( int[] x : board )
		{
			for( int boards : x )
			{
				if( boards == 1 )
					System.out.printf( "%4s", "*" );
				else
					System.out.printf( "%4s", " " );
			}
			System.out.printf( "%n%n" );
		}
	}
	
}
