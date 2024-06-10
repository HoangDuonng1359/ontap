package Windows;

public class Main {
    public static void main(String[] args) {
        FS fs = new FS();
        Disk disk = new Disk();
        disk.setCapacity(100);
        disk.setName("Disk1");
        fs.addItem(disk);

        Folder folder = new Folder();
        folder.setName("Folder 1");

        Shortcut shortcut = new Shortcut();
        shortcut.setName("shortcut 1");

        folder.addItem(shortcut);
        disk.addItem(folder);

        System.out.println(fs);

        System.out.println(disk.getFreeSpace());
    }

}
