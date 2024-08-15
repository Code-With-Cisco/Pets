
package pets;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Driver {
	public static ArrayList<Pets> createPet() throws IOException {
		// Open the file:
		File aFile = new File("pets.txt");
		Scanner inFile = new Scanner(aFile); // Opens the file

		// Create an empty arrayList of pet objects:
		ArrayList<Pets> pet = new ArrayList<Pets>();

		for (int j = 0; j < 10; ++j) {
			pet.add(new Pets(inFile.next(), inFile.next(), inFile.nextInt(), inFile.nextInt(), inFile.nextInt(),
					inFile.nextInt(), inFile.next(), inFile.next(), inFile.next()));
		}
		inFile.close();
		return pet;
	}

	// sortAge method: call the sortAge method
	public static ArrayList<Pets> sortAge(ArrayList<Pets> pet) {
		Collections.sort(pet, new sortAge());

		return pet;
	}

	// printYoungOld method: print the youngest and oldest pet by calling the
	// PrintYoungOld method in pet class
	public static void printYoungOld(ArrayList<Pets> pet) {
		System.out.println("Youngest pet is: " + pet.get(0).PrintYoungOld());
		System.out.println("Oldest pet is: " + pet.get(pet.size() - 1).PrintYoungOld());
		System.out.println();
	}

	// sortVaccine method: call the sortAge sortVaccine
	public static ArrayList<Pets> sortVaccine(ArrayList<Pets> pet) {
		Collections.sort(pet, new sortVaccine());

		return pet;
	}

	// printVaccine method: print the youngest and oldest pet by calling the
	// toString method in pet class
	public static void printVaccine(ArrayList<Pets> pet) {
		for (int i = 0; i < pet.size(); i++) {
			System.out.println(pet.get(i));
		}
	}

	// main method: call every other method on driver class
	public static void main(String[] args) throws IOException {
		ArrayList<Pets> pet = createPet();
		sortAge(pet);
		printYoungOld(pet);
		sortVaccine(pet);
		printVaccine(pet);
	}
}
