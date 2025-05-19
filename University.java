class University {
    private String name;
    private List<Student> students = new ArrayList<>();

    public University(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        students.add(student);
    }
}

//In Assignment 2, Marsha is continuing this from Marsha in Assignment 1
