
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
}
