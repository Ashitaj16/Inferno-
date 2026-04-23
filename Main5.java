

import java.util.*;

// Student Class
class Student {
    String rollNumber;
    String name;
    double cgpa;
    int age;
    String gender;

    public Student(String rollNumber, String name, double cgpa, int age, String gender) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return rollNumber + " |-| " + name + " |-| " + cgpa + " |-| " + age + " |-| " + gender;
    }
}

// Generic Sorting Class
class GenericSorter {
    public static <T> void sort(ArrayList<T> list, Comparator<T> comp) {
        Collections.sort(list, comp);
    }
}

// Main Class
class Main5 {
    public static void main(String[] args) {

        // ------------------ Student Data ------------------
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("101", "Ishan", 8.5, 20, "M"));
        students.add(new Student("102", "Surya", 9.1, 19, "F"));
        students.add(new Student("103", "Jasprit", 7.8, 21, "M"));

        // Sort by CGPA (Ascending)
        GenericSorter.sort(students, (s1, s2) -> Double.compare(s1.cgpa, s2.cgpa));
        System.out.println("Students sorted by CGPA (Ascending):");
        students.forEach(System.out::println);

        // Sort by CGPA (Descending)
        GenericSorter.sort(students, (s1, s2) -> Double.compare(s2.cgpa, s1.cgpa));
        System.out.println("\nStudents sorted by CGPA (Descending):");
        students.forEach(System.out::println);

        // Sort by Age (Ascending)
        GenericSorter.sort(students, (s1, s2) -> s1.age - s2.age);
        System.out.println("\nStudents sorted by Age:");
        students.forEach(System.out::println);

        // Sort by Name (Alphabetical)
        GenericSorter.sort(students, (s1, s2) -> s1.name.compareTo(s2.name));
        System.out.println("\nStudents sorted by Name:");
        students.forEach(System.out::println);

        // ------------------ Integer Data (Ages) ------------------
        ArrayList<Integer> ages = new ArrayList<>();
        for (Student s : students) {
            ages.add(s.age);
        }

        // Ascending
        GenericSorter.sort(ages, (a, b) -> a - b);
        System.out.println("\nAges Ascending: " + ages);

        // Descending
        GenericSorter.sort(ages, (a, b) -> b - a);
        System.out.println("Ages Descending: " + ages);

        // Absolute Value Sorting
        GenericSorter.sort(ages, (a, b) -> Integer.compare(Math.abs(a), Math.abs(b)));
        System.out.println("Ages by Absolute Value: " + ages);

        // Even-Odd Priority
        GenericSorter.sort(ages, (a, b) -> {
            if (a % 2 == 0 && b % 2 != 0) return -1;
            if (a % 2 != 0 && b % 2 == 0) return 1;
            return a - b;
        });
        System.out.println("Ages Even-Odd Priority: " + ages);

        // ------------------ String Data (Names) ------------------
        ArrayList<String> names = new ArrayList<>();
        for (Student s : students) {
            names.add(s.name);
        }

        // Alphabetical Ascending
        GenericSorter.sort(names, (a, b) -> a.compareTo(b));
        System.out.println("\nNames Ascending: " + names);

        // Alphabetical Descending
        GenericSorter.sort(names, (a, b) -> b.compareTo(a));
        System.out.println("Names Descending: " + names);

        // Length-based sorting
        GenericSorter.sort(names, (a, b) -> a.length() - b.length());
        System.out.println("Names by Length: " + names);
    }
}
 






