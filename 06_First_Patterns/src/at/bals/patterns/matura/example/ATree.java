package at.bals.patterns.matura.example;

public abstract class ATree implements ITree {
	protected int maxHeight;
	protected int maxDiameter;
	protected IFertStrategy iFertStrategy;

	public ATree(int maxHeight, int maxDiameter, IFertStrategy iFertStrategy) {
		this.maxHeight = maxHeight;
		this.maxDiameter = maxDiameter;
		this.iFertStrategy = iFertStrategy;
	}

	@Override
	public int getMaxHeight() {
		// TODO Auto-generated method stub
		return this.maxHeight;
	}

	@Override
	public int getMaxDiameter() {
		// TODO Auto-generated method stub
		return this.maxDiameter;
	}

	@Override
	public int getAmount() {
		return this.iFertStrategy.getAmount();
	}

	public IFertStrategy getiFertStrategy() {
		return iFertStrategy;
	}
}
