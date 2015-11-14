
public class PatientRecord
{
	BinaryTree rootPR;
	
	public PatientRecord()
	{
		this.rootPR = null;
	}
	
	public void addPRecord(String FName, String LName, int Age)
	{
		if (this.rootPR == null)
		{
			this.rootPR = new BinaryTree(FName, LName, Age);
		}
		else
		{
			this.rootPR.addTree(FName, LName, Age);
		}
	}
	
	public void displayInOrder()
	{
		this.rootPR.displayInOrder();
	}
	
	public BinaryTree getLowerLeftPatient()
	{
		BinaryTree currTree = this.rootPR;
		while (currTree.visitLeft() != null)
		{
			currTree = currTree.visitLeft();
		}
		return currTree;
	}
	
	public BinaryTree getLowerRightPatient()
	{
		BinaryTree currTree = this.rootPR;
		while (currTree.visitRight() != null)
		{
			currTree = currTree.visitRight();
		}
		return currTree;
	}
	
	public BinaryTree getRoot()
	{
		return this.rootPR;
	}
}
