package de.security.demo.dto;

public record SearchResult(String kind, String etag, SearchId id, SearchSnippet snippet) {
}
