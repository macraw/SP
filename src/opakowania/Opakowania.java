package opakowania;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Opakowania {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String filePath = "C:\\Maciej\\Moje\\Programowanie\\test_input.txt";
        FileReader fileReader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        int suma = 0, ilePaczek = 0, powierzchnia = 0;
        int[] wymPaczInt = {0, 0, 0};
        String paczka = bufferedReader.readLine();
        do {
            String[] wymiaryPaczki = paczka.split("x");
            for (int i = 0; i < 3; i++) {
                wymPaczInt[i] = Integer.parseInt(wymiaryPaczki[i]);
            }
            Opakowanie opakowanie = new Opakowanie(wymPaczInt[0], wymPaczInt[1], wymPaczInt[2]);
            powierzchnia += opakowanie.powOpak();
            paczka = bufferedReader.readLine();
            ilePaczek += 1;
            System.out.println("Na paczkę " + ilePaczek + " potrzeba: " + opakowanie.powOpak() + " dm2");

        } while (paczka != null);

        bufferedReader.close();
        System.out.println("Ilość paczek: " + ilePaczek);
        System.out.println("Potrzebna powierzchnia papieru: " + powierzchnia + " dm2");

    }

}
