/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pets;

import java.util.Comparator;

//Sort depending of Age from yongest to older.
//Compare Age.
//Return 1, -1 or 0
public class sortAge implements Comparator<Pets> {
	@Override
	public int compare(Pets n1, Pets n2) {
		if (n1.getAge().compareTo(n2.getAge()) > 0)
			return 1;
		else if (n1.getAge().compareTo(n2.getAge()) < 0)
			return -1;
		else
			return 0;
	}
}