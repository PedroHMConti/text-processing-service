package com.conti.TextProcessorService.api.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PostSummaryOutput {
    private String id;
    private String title;
    private String body;
    private String author;
}
