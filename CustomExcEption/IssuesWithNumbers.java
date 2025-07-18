package ExcEption.CustomExcEption;

class IssuesWithNumbers extends Exception {
    private String message;

    public IssuesWithNumbers(String message) {
        super(message);
        this.message = message;
    }

    public String getInfo() {
        return message;
    }
}
