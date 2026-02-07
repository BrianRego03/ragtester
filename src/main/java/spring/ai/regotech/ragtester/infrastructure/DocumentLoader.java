package spring.ai.regotech.ragtester.infrastructure;

import org.springframework.ai.document.Document;
import org.springframework.ai.vectorstore.VectorStore;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DocumentLoader implements CommandLineRunner {

    private final VectorStore vectorStore;

    public DocumentLoader(VectorStore vectorStore) {
        this.vectorStore = vectorStore;
    }

    @Override
    public void run(String... args) throws Exception {
        List<Document> documents = List.of(
                new Document("The Mandalorian follows a lone bounty hunter navigating the dangerous " +
                        "outer rim of the galaxy, where his rigid adherence to Mandalorian tradition is " +
                        "slowly reshaped after he accepts a mission that leads him to protect the " +
                        "Force-sensitive child known as Grogu."),
                new Document("What makes The Mandalorian distinctive within the Star Wars" +
                        " universe is the way the show blends Western and samurai influences with" +
                        " familiar sci-fi elements, allowing The Mandalorian to tell its story" +
                        " through atmosphere, visual storytelling, and quiet character moments" +
                        " rather than constant exposition."),
                new Document("As The Mandalorian unfolds across multiple seasons, the" +
                        " series explores the unstable aftermath of the Empire’s collapse, " +
                        "using The Mandalorian as a lens through which viewers see warlords, " +
                        "bounty hunters, and fractured Mandalorian clans competing for power."),
                new Document("At the emotional center of The Mandalorian is the evolving" +
                        " relationship between Din Djarin and Grogu, which allows The Mandalorian " +
                        "to shift from a simple episodic adventure into a deeper narrative " +
                        "about responsibility, honor, and chosen family."),
                new Document("Through cinematic production values, innovative " +
                "virtual set technology, and a memorable score, The Mandalorian helped " +
                        "redefine televised Star Wars storytelling, establishing The Mandalorian " +
                        "as a flagship series that expanded the franchise beyond " +
                        "traditional film releases.")
        );
        vectorStore.add(documents);
        System.out.println("Loaded " + documents.size() + " documents");
    }
}
