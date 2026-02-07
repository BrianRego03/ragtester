package spring.ai.regotech.ragtester.controller;

import org.springframework.web.bind.annotation.RestController;
import spring.ai.regotech.ragtester.service.RagService;

@RestController
public class RagController {
    private  final RagService ragService;

    public RagController(RagService ragService) {
        this.ragService = ragService;
    }
}
