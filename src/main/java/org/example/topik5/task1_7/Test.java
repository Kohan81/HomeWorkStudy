package org.example.topik5.task1_7;

public class Test {
    public static void main(String[] args) {

        int numberOfStudents = 0;

        Student student1 = new Student("Billy",
                "Davis", (byte)
                17,
                "Leaving Cert 1",
                70.50f,
                "12 High Street,Dublin");
        numberOfStudents++;

        Student student2 = new Student("Anna",
                "Smith",(byte)
                18,
                "Leaving Cert 1",
                80.00f,
                "19 LowerStreet, Dublin");
        numberOfStudents++;

        Student student3 = new Student("Georgina",
                "Moriarty",(byte)
                17,
                "Leaving Cert 1",
                90.00f,
                "5 Middle Street, Dublin");
        numberOfStudents++;

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        System.out.println("There are " + numberOfStudents + " students");
        System.out.println("The grade average is: " + (student1.gradeAverage +
                student2.gradeAverage + student3.gradeAverage) / numberOfStudents);
    }


}