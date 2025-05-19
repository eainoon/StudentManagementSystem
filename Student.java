class Student {
    private String id, name, course, club;
    private int age;
    private boolean newsletter;

    public Student(String id, String name, int age, String course, String club, boolean newsletter) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
        this.club = club;
        this.newsletter = newsletter;
    }

    @Override
    public String toString() {
        return String.format("ID: %s\nName: %s\nAge: %d\nCourse: %s\nClub: %s\nNewsletter: %s",
                id, name, age, course, club, newsletter ? "Yes" : "No");
    }
}
//In Assignment 2, Ui is continuing this from Ui in Assignment 1
