package com.testApi.apiMovie.apiMovie.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class MetadataInfo {
    private List<String> images;
    private String metaTitle;
    private String metaDescription;
}
