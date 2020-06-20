public class Main {
    public static void main(String[] args) {
        School John_Oliver = new School("Windermere",1000);

        John_Oliver.addStudent(new Student("Khoa","Nguyen",11));
        John_Oliver.addStudent(new Student("John","Nguyen",10));
        John_Oliver.addStudent(new Student("Tony","Lim",11));
        John_Oliver.addStudent(new Student("Jack","Martin",8));
        John_Oliver.addStudent(new Student("Lillian","Chu",11));
        John_Oliver.addStudent(new Student("Troy","Mah",9));
        John_Oliver.addStudent(new Student("Rachel","Yan",9));
        John_Oliver.addStudent(new Student("Jericho","Layugan",12));
        John_Oliver.addStudent(new Student("Cathy","Lei",10));
        John_Oliver.addStudent(new Student("Bob","Jun",11));

        John_Oliver.addTeacher(new Teacher("White","Tom", "STEM"));
        John_Oliver.addTeacher(new Teacher("Griffin","Gee","English"));
        John_Oliver.addTeacher(new Teacher("Jack","Lau","Foods"));

        John_Oliver.allStudents();
        John_Oliver.allTeachers();

        John_Oliver.delStudent(1);
        John_Oliver.delStudent(2);

        John_Oliver.delTeacher(2);

        John_Oliver.allStudents();
        John_Oliver.allTeachers();
    }
}