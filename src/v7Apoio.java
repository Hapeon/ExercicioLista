class Room {
    
    private String studentName;
    private String studentEmail;

    public Room(String studentName, String studentEmail) {
        this.studentName = studentName;
        this.studentEmail = studentEmail;
    }

    @Override
    public String toString() {
        return studentName + " - " + studentEmail;
    }
}