package Odwiedzaj¹cy;

public class MainClass {

	public static void main(String[] args) {
		Matrix matrix = new Matrix();
		Dense denseMatrix = new Dense(4, 4);
	
		Sparse sparseMatrix = new Sparse(3, 8);
		
		denseMatrix.accept(matrix);
		sparseMatrix.accept(matrix);
	}

}
