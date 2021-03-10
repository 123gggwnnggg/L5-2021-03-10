import java.util.ArrayList;

public class T2 {
    static class Student{
        String lastName;
        String firstName;
        double[] grades;

        double GPA;

        Student(String lastName, String firstName, double[] grades){
            this.lastName = lastName;
            this.firstName = firstName;
            this.grades = grades;

            this.GPA = this.getAverage();
        }

        private double getAverage(){
            double sum = 0;
            for (double value : this.grades) {
                sum += value;
            }
            return sum / (double)this.grades.length;
        }

        public String toString(){
            return this.firstName + " " + this.lastName + ": " + this.GPA;
        }
    }

    static class ClassRoom{
        ArrayList<Student> students = new ArrayList<>();

        ClassRoom(){

        }

        public void addStudent(Student s){
            this.students.add(s);
        }

        public double getClassAverage(){
            double sum = 0;
            for (Student value : this.students) {
                sum += value.GPA;
            }
            return sum / (double)this.students.size();
        }

        public String toString(){
            StringBuilder sb = new StringBuilder();
            for (Student s : this.students)
            {
                sb.append(s);
                sb.append("\n");
            }

            return "Student GPA: \n" + sb + "\n\n" + "Class avg: " + this.getClassAverage();
        }

    }

    ClassRoom classRoom;

    public static void run(){
        T2 main = new T2();
        main.getData();

        System.out.println(main.classRoom);
    }



    void getData(){
        String[][] names = {
                {"L1", "F1"},
                {"L2", "F2"}
        };

        double[][] grades = {
                {1.0, 2.0},
                {2, 3}
        };


        this.classRoom = new ClassRoom();

        for (int i = 0; i < names.length; i++){
            this.classRoom.addStudent(new Student(names[i][1], names[i][0], grades[i]));
        }


    }
}
