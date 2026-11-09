package com.conti.TextProcessorService.domain.service;

import com.conti.TextProcessorService.api.model.PostSummaryOutput;
import com.conti.TextProcessorService.api.model.TextProcessingOutput;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class TextProcessingService {

    public TextProcessingOutput handleText(PostSummaryOutput postSummaryOutput){
        log.info("mensagem recebida");
        Integer words = postSummaryOutput.getBody().trim().split("\\s").length;
        Double price = words*0.10;
        return TextProcessingOutput.builder()
                .price(price)
                .words(words)
                .build();
    }
}
