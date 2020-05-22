package Odwiedzaj¹cy;

import java.util.Vector;

import Odwiedzaj¹cy.Dense.Element;

public class Sparse implements Visitable {
	int side1;
	int side2;
	Vector<Element>[][] sampleMatrix;
	boolean kwadratowa;

	class Element {
		int value;

		public Element(int value) {
			this.value = value;
		}
	}

	public Sparse(int side1, int side2) {
		if(side1 == side2) {
			kwadratowa = true;
		} else {
			kwadratowa = false;
		}
		Vector<Element>[][] sampleMatrix = new Vector[side1][side2];
		for (int i = 0; i < sampleMatrix.length; i++) {
			for (int j = 0; j < sampleMatrix[i].length; j++) {
				sampleMatrix[i][j] = new Vector<Sparse.Element>();
				if (i == j) {
					sampleMatrix[i][j].add(new Element(1));
					sampleMatrix[i][j].add(new Element(1));
					sampleMatrix[i][j].add(new Element(1));
				} else {
					sampleMatrix[i][j].add(new Element(0));
					sampleMatrix[i][j].add(new Element(0));
					sampleMatrix[i][j].add(new Element(0));
				}
			}

		}

	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
