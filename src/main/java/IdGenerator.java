import java.util.UUID;

public class IdGenerator {
    // Gerador de IDs únicos
    public static String generateId() {
        return UUID.randomUUID().toString();
    }
}
