/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pets;

/**
 *
 * @author User
 */
import java.text.DecimalFormat;

// pet class: create pet, get data and return what to print
public class Pets {
	private String PetName;
	private String Species;
	private Integer Age;
	private Integer Year;
	private Integer Month;
	private Integer Day;
	private String OwnerLastName;
	private String OwnerFirstName;
	private String OwnerEmail;

	Pets(String PetName, String Species, Integer Age, Integer Year, Integer Month, Integer Day, String OwnerLastName,
			String OwnerFirstName, String OwnerEmail) {
		this.PetName = PetName;
		this.Species = Species;
		this.Age = Age;
		this.Year = Year;
		this.Month = Month;
		this.Day = Day;
		this.OwnerLastName = OwnerLastName;
		this.OwnerFirstName = OwnerFirstName;
		this.OwnerEmail = OwnerEmail;
	}

	public Integer getAge() {
		return Age;
	}

	public Integer getYear() {
		return Year;
	}

	public Integer getMonth() {
		return Month;
	}

	public Integer getDay() {
		return Day;
	}

	// Return data for youngest and oldest pet
	public String PrintYoungOld() {
		return PetName + ", " + Species + " aged: " + Age + ". Owned by: " + OwnerLastName + " " + OwnerFirstName
				+ " email:" + OwnerEmail;
	}

	// Return data. Format month to 00"
	@Override
	public String toString() {
		DecimalFormat formatter = new DecimalFormat("00");
		return OwnerFirstName + " " + OwnerLastName + ", your pet named " + PetName + " was last vaccinated on " + Year
				+ "/" + formatter.format(Month) + "/" + Day + ".";
	}
}