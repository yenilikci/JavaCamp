package inheritance2;

public class FileLogger extends Logger {
    @Override
    public void log() {
        super.log();
        System.out.println("Dosya loglandı");
    }
}
