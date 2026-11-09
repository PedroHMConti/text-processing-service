package com.conti.TextProcessorService.infrastructure.rabbitmq;

import com.conti.TextProcessorService.api.model.PostSummaryOutput;
import com.conti.TextProcessorService.api.model.TextProcessingOutput;
import com.conti.TextProcessorService.domain.service.TextProcessingService;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;


@Slf4j
@Component
@RequiredArgsConstructor
public class RabbitMQListener {
    public static final String QUEUE = "text-processor-service.post-processing.v1.q";


    private final TextProcessingService textProcessingService;

    @RabbitListener(queues = QUEUE,concurrency = "2-3")
    @SneakyThrows
    public TextProcessingOutput handle(@Payload PostSummaryOutput postSummaryOutput){
        log.info("mensagem enviada");
        return textProcessingService.handleText(postSummaryOutput);
    }
}
