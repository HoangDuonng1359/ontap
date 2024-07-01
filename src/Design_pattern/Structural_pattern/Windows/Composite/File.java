package Design_pattern.Structural_pattern.Windows.Composite;

public class File extends Item {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "File{" +
                "size=" + getSize() +
                ", type='" + type + '\'' +
                ", name='" + getName() + '\'' +
                '}';
    }
}
