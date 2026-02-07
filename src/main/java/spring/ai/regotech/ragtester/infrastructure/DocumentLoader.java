package spring.ai.regotech.ragtester.infrastructure;

import org.springframework.ai.vectorstore.VectorStore;
import org.springframework.boot.CommandLineRunner;

public class DocumentLoader implements CommandLineRunner {

    private final VectorStore vectorStore;

    public DocumentLoader(VectorStore vectorStore) {
        this.vectorStore = vectorStore;
    }

    @Override
    public void run(String... args) throws Exception {
        
    }
}
