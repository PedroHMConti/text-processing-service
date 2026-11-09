package com.conti.TextProcessorService.api.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/text-processing")
@Slf4j
@RequiredArgsConstructor
public class TextProcessorController {

    private final RabbitTemplate rabbitTemplate;

}
