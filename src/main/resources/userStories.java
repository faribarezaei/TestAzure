
public class UserStories {
    private String op;
    private String path;
    private Object from;  // Use Object type since it can be null or a string
    private String value;

    // Getters and setters...

    public UserStories(String op, String path, Object from, String value) {
        this.op = op;
        this.path = path;
        this.from = from;
        this.value = value;
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Object getFrom() {
        return from;
    }

    public void setFrom(Object from) {
        this.from = from;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

