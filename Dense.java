package Odwiedzaj¹cy;

import java.awt.image.SampleModel;
import java.util.Vector;

import Odwiedzaj¹cy.Sparse.Element;

public class Dense implements Visitable {
	int side1;
	int side2;
	Vector<Element>[][] sampleMatrix;
	boolean kwadratowa;

	class Element {
		int value;

		public Element(int value) {
			super();
			this.value = value;
		}
	}

	public Dense(int side1, int side2) {
		generateMatrix(side1, side2);

	}

	public Vector<Element>[][] generateMatrix(int side1, int side2) {
		if (side1 == side2) {
			kwadratowa = true;
		} else {
			kwadratowa = false;
		}
		Vector<Element>[][] sampleMatrix = new Vector[side1][side2];
		for (int i = 0; i < sampleMatrix.length; i++) {
			for (int j = 0; j < sampleMatrix[i].length; j++) {
				sampleMatrix[i][j] = new Vector<Dense.Element>();
				if (i == j) {
					sampleMatrix[i][j].add(new Element(0));
					sampleMatrix[i][j].add(new Element(0));
					sampleMatrix[i][j].add(new Element(0));
				} else {
					sampleMatrix[i][j].add(new Element(1));
					sampleMatrix[i][j].add(new Element(1));
					sampleMatrix[i][j].add(new Element(1));
				}
			}
		}
		return sampleMatrix;
	}
	public void print() {

		for (Vector<Element>[] v : sampleMatrix) {
			System.out.print("|");
			for (Vector<Element> v2 : v) {
				System.out.print(" " + v2.get(0).value + " " + v2.get(1).value);
			}
			System.out.println(" |");
		}
	}
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
