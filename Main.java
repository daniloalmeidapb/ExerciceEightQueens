package com.deitel.exercicios.Capitulo7.Cap7_23;

public class Main
{

	private static final int SIZE = 8;
	
	public static void main( String[] args )
	{
		int[][] board = new int[ SIZE ][ SIZE ];
		
		EightQueens myQueens = new EightQueens( board, 0, 0 );
		
		
		for( int i = 0; i < 1; i++ )
		{
			myQueens.processElimineSquadBoard();
		}
		
		System.out.println( "============== Array ==============" );
		myQueens.printArray();
	}

}
