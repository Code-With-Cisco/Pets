/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pets;

import java.util.Comparator;

// Sort depending of year month day from most recent to oldest.
// Compare year, then if needed month and if needed day.
// Return 1, -1 or 0
public class sortVaccine implements Comparator<Pets> {
	@Override
	public int compare(Pets n1, Pets n2) {
		if (n1.getYear().compareTo(n2.getYear()) < 0)
			return 1;
		else if (n1.getYear().compareTo(n2.getYear()) > 0)
			return -1;
		else if (n1.getMonth().compareTo(n2.getMonth()) < 0)
			return 1;
		else if (n1.getMonth().compareTo(n2.getMonth()) > 0)
			return -1;
		else if (n1.getDay().compareTo(n2.getDay()) < 0)
			return 1;
		else if (n1.getDay().compareTo(n2.getDay()) > 0)
			return -1;
		else
			return 0;
	}
}