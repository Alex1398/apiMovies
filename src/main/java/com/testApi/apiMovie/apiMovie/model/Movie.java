package com.testApi.apiMovie.apiMovie.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Document(value = "movies")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Movie {
    @Id
    private String id;
    private String title;
    private String description;
    private String genre;
    private String tag;
    private int length;
    private LocalDateTime dateReleased;
    private LocalDateTime dateAvailableUntil;
    private MetadataInfo metadataInfo;
}
