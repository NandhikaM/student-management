public class Student {
    static String addStudent() {
        return "Added student successfully!";
    }

    static String viewStudent() {
        return "Student : ABC";
    }

    public static void main(String[] args) {
        System.out.println("Student Management System");
        System.out.println(addStudent());
        System.out.println(viewStudent());
    }
}