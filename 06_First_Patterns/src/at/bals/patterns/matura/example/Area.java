package at.bals.patterns.matura.example;

import java.util.ArrayList;
import java.util.List;

public class Area {
	private List<ITree> trees;

	public Area() {
		this.trees = new ArrayList<ITree>();
	}

	public void addTree(ITree tree) {
		this.trees.add(tree);
	}

	public int getSum() {
		int sum = 0;
		for (ITree tree : trees) {
			sum = sum + tree.getAmount();
		}
		return sum;
	}
}
