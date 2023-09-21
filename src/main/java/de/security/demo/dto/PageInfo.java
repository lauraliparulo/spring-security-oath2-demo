package de.security.demo.dto;

/**
 * @see https://developers.google.com/youtube/v3/docs/videos/list
 */
public record PageInfo(Integer totalResults, Integer resultsPerPage) {
}
