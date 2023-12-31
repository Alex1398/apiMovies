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
public class Preferences {
    private String favoriteCategories;
    private String websiteTheme;
}
