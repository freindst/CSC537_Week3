
public class BinaryTree
{
	private String FName;
	private String LName;
	private int Age;
	private BinaryTree leftTree;
	private BinaryTree rightTree;
	
	public BinaryTree(String FName, String LName, int Age)
	{
		this.FName = FName;
		this.LName = LName;
		this.Age = Age;
		this.leftTree = null;
		this.rightTree = null;
	}
	
	public void addTree(String FName, String LName, int Age)
	{
		if (Age <= this.Age)
		{
			if (this.leftTree == null)
			{
				this.leftTree = new BinaryTree(FName, LName, Age);
			}
			else
			{
				this.leftTree.addTree(FName, LName, Age);
			}
		}
		else
		{
			if (this.rightTree == null)
			{
				this.rightTree = new BinaryTree(FName, LName, Age);
			}
			else
			{
				this.rightTree.addTree(FName, LName, Age);
			}
		}
	}
	
	public void displayInOrder()
	{
		if (this.leftTree != null)
		{
			this.leftTree.displayInOrder();
		}
		System.out.println(this.FName + " " + this.LName + ": " + this.Age);
		if (this.rightTree != null)
		{
			this.rightTree.displayInOrder();
		}
	}
}
