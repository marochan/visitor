package Odwiedzający;

public interface Visitor {
	public void visit(Dense dense);
	public void visit (Sparse sparse);
}
