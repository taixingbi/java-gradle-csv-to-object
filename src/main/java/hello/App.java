package hello;

import com.opencsv.CSVReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws IOException {
        String filename = "src/main/resources/test.csv";
        CSVReader reader = new CSVReader(new FileReader(filename), ',');
        List<Employee> emps = new ArrayList<Employee>();

        String[] record = null;
        while ((record = reader.readNext()) != null) {
            Employee emp = new Employee();
            emp.setId(record[0]);
            emp.setName(record[1]);
            emp.setAge(record[2]);
            emp.setCountry(record[3]);
            emps.add(emp);
        }

        System.out.println(emps);

        reader.close();
        System.out.println("----------app end----------");
    }
}
