import java.io.File;

public class PushyInit {
    public static void main(String[] args) {
        initializePushyRepository();
    }

    public static void initializePushyRepository() {
        File pushyDir = new File(".pushy");

        if (pushyDir.exists()) {
            System.err.println("cannot access '.pushy': No such file or directory");
            return;
        }

        if (!pushyDir.mkdirs()) {
            System.err.println("cannot access '.pushy': No such file or directory");
            return;
        }

    }
}
