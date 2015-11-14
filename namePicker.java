
public class namePicker
{
	private String[] firstNames;
	private String[] lastNames;	
	
	public namePicker()
	{
		this.firstNames = new String[] {"Jackson","Aiden","Liam","Lucas","Noah","Mason","Ethan","Caden","Jacob","Logan",
				"Jayden","Elijah","Jack","Luke","Michael","Benjamin","Alexander","James","Jayce","Caleb","Connor","William",
				"Carter","Ryan","Oliver","Matthew","Daniel","Gabriel","Henry","Owen","Grayson","Dylan","Landon","Isaac","Nicholas",
				"Wyatt","Nathan","Andrew","Cameron","Dominic","Joshua","Eli","Sebastian","Hunter","Brayden","David","Samuel","Evan",
				"Gavin","Christian","Sophia","Emma","Olivia","Ava","Isabella","Mia","Zoe","Lily","Emily","Madelyn","Madison","Chloe",
				"Charlotte","Aubrey","Avery","Abigail","Kaylee","Layla","Harper","Ella","Amelia","Arianna","Riley","Aria","Hailey",
				"Hannah","Aaliyah","Evelyn","Addison","Mackenzie","Adalyn","Ellie","Brooklyn","Nora","Scarlett","Grace","Anna","Isabelle",
				"Natalie","Kaitlyn","Lillian","Sarah","Audrey","Elizabeth","Leah","Annabelle","Kylie","Mila","Claire","Victoria"};
		this.lastNames = new String[] {"SMITH","JOHNSON","WILLIAMS","JONES","BROWN","DAVIS","MILLER","WILSON","MOORE",
				"TAYLOR","ANDERSON","THOMAS","JACKSON","WHITE","HARRIS","MARTIN","THOMPSON","GARCIA","MARTINEZ","ROBINSON",
				"CLARK","RODRIGUEZ","LEWIS","LEE","WALKER","HALL","ALLEN","YOUNG","HERNANDEZ","KING","WRIGHT","LOPEZ",
				"HILL","SCOTT","GREEN","ADAMS","BAKER","GONZALEZ","NELSON","CARTER","MITCHELL","PEREZ","ROBERTS","TURNER",
				"PHILLIPS","CAMPBELL","PARKER","EVANS","EDWARDS","COLLINS","STEWART","SANCHEZ","MORRIS","ROGERS","REED",
				"COOK","MORGAN","BELL","MURPHY","BAILEY","RIVERA","COOPER","RICHARDSON","COX","HOWARD","WARD","TORRES",
				"PETERSON","GRAY","RAMIREZ","JAMES","WATSON","BROOKS","KELLY","SANDERS","PRICE","BENNETT","WOOD","BARNES",
				"ROSS","HENDERSON","COLEMAN","JENKINS","PERRY","POWELL","LONG","PATTERSON","HUGHES","FLORES","WASHINGTON",
				"BUTLER","SIMMONS","FOSTER","GONZALES","BRYANT","ALEXANDER","RUSSELL","GRIFFIN","DIAZ","HAYES"};
	}
	
	public String getOneFName() 
	{
		return this.firstNames[(int)(Math.random() * 100)];
	}
	
	public String getOneLName()
	{
		return this.lastNames[(int)(Math.random() * 100)];
	}
}
