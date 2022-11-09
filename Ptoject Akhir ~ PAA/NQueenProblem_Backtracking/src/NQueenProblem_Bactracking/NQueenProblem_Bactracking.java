package NQueenProblem_Bactracking;
/**
 *
 * @author ALAN
 */
/* Program Java untuk memecahkan 4 Queen Problem menggunakan
backtracking */
public class NQueenProblem_Bactracking { 
	final int N = 4; 

	/* Fungsi utilitas untuk mencetak solusi */
	void printSolution(int board[][]) 
	{ 
		for (int i = 0; i < N; i++) { 
			for (int j = 0; j < N; j++) 
				System.out.print(" " + board[i][j]+ " "); 
			System.out.println(); 
		} 
	} 

	/* Fungsi utilitas untuk memeriksa apakah seorang ratu bisa
ditempatkan di papan [baris] [col]. Perhatikan bahwa ini
fungsi dipanggil ketika "col" queens sudah
ditempatkan di kolom dari 0 hingga kolom -1. Jadi kita butuh
untuk memeriksa hanya sisi kiri untuk menyerang ratu */
	boolean isSafe(int board[][], int row, int col) 
	{ 
		int i, j; 

		/* Periksa baris ini di sisi kiri */
		for (i = 0; i < col; i++) 
			if (board[row][i] == 1) 
				return false; 

		/* Periksa diagonal atas di sisi kiri */
		for (i = row, j = col; i >= 0 && j >= 0; i--, j--) 
			if (board[i][j] == 1) 
				return false; 

		/* Periksa diagonal bawah di sisi kiri */
		for (i = row, j = col; j >= 0 && i < N; i++, j--) 
			if (board[i][j] == 1) 
				return false; 

		return true; 
	} 

	/* Fungsi utilitas rekursif untuk menyelesaikan  N 
	Queen problem */
	boolean solveNQUtil(int board[][], int col) 
	{ 
		/* kasus dasar: Jika semua ratu ditempatkan
lalu kembalikan benar */
		if (col >= N) 
			return true; 

		/* Pertimbangkan kolom ini dan cobalah menempatkan
ratu ini di semua baris satu per satu */
		for (int i = 0; i < N; i++) { 
			/* Periksa apakah ratu dapat ditempatkan
papan [i] [col] */
			if (isSafe(board, i, col)) { 
				/* Tempatkan ratu ini di papan [i] [col] */
				board[i][col] = 1; 

				/* berulang untuk menempatkan sisa ratu */
				if (solveNQUtil(board, col + 1) == true) 
					return true; 

				/* Jika menempatkan ratu di papan [i] [col]
tidak mengarah ke solusi saat itu
hapus ratu dari papan [i] [col] */
				board[i][col] = 0; // BACKTRACK 
			} 
		} 

		/* Jika ratu tidak dapat ditempatkan di baris mana pun di
colum col ini, lalu kembalikan false */
		return false; 
	} 

	/* Fungsi ini memecahkan masalah N Queen menggunakan
Mundur. Ini terutama menggunakan resolNQUtil () untuk
menyelesaikan masalah. Ini mengembalikan false jika ratu
tidak dapat ditempatkan, jika tidak, kembalikan benar dan
mencetak penempatan ratu dalam bentuk 1s.
Harap dicatat bahwa mungkin ada lebih dari satu
solusi, fungsi ini mencetak salah satu
solusi yang layak.*/
	boolean solveNQ() 
	{ 
		int board[][] = { { 0, 0, 0, 0 }, 
						{ 0, 0, 0, 0 }, 
						{ 0, 0, 0, 0 }, 
						{ 0, 0, 0, 0 } }; 

		if (solveNQUtil(board, 0) == false) { 
			System.out.print("Solusi tidak ada"); 
			return false; 
		} 

		printSolution(board); 
		return true; 
	} 

	// program driver untuk menguji fungsi di atas 
	public static void main(String args[]) 
	{ 
		NQueenProblem_Bactracking Queen = new NQueenProblem_Bactracking(); 
		Queen.solveNQ(); 
	} 
} 


