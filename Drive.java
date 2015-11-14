
public class Drive {

	public static void main(String[] args)
	{
		namePicker name = new namePicker();
		PatientRecord aRecord = new PatientRecord();
		for (int i = 0; i < 100; i++)
		{
			aRecord.addPRecord(name.getOneFName(), name.getOneLName(), 1 + (int)(Math.random() * 85));
		}
		aRecord.displayInOrder();
	}

}
