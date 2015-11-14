
public class Drive {

	public static void main(String[] args)
	{
		namePicker name = new namePicker();
		PatientRecord aRecord = new PatientRecord();
		for (int i = 0; i < 100; i++)
		{
			aRecord.addPRecord(name.getOneFName(), name.getOneLName(), 1 + (int)(Math.random() * 85));
		}
		System.out.println("The lower left Patient Record:");
		aRecord.getLowerLeftPatient().display();
		System.out.println("The Root Patient Record:");
		aRecord.getRoot().display();
		System.out.println("The lower Right Patient Record:");
		aRecord.getLowerRightPatient().display();
	}

}
