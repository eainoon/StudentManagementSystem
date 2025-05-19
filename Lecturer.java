class Lecturer {
    private String id, name, subject;

    public Lecturer(String id, String name, String subject) {
        this.id = id;
        this.name = name;
        this.subject = subject;
    }

    @Override
    public String toString() {
        return String.format("ID: %s\nName: %s\nSubject: %s", id, name, subject);
    }
}


//In Assignment 2, Mira is continuing this from Mira in Assignment 1
