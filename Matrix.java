package Odwiedzaj¹cy;

import java.util.Vector;

import Dekorator.Element;

public class Matrix implements Visitor {

	public Matrix() {
		super();

	}

	@Override
	public void visit(Dense dense) {
		System.out.println(dense.sampleMatrix);
		System.out.println(dense.kwadratowa);
	}

	@Override
	public void visit(Sparse sparse) {
		System.out.println(sparse.sampleMatrix);
		System.out.println(sparse.kwadratowa);
	}

}
