package com.takusemba.jethub.repository

import com.takusemba.jethub.api.SearchApi
import com.takusemba.jethub.model.Language
import com.takusemba.jethub.model.Repository
import org.threeten.bp.LocalDateTime
import javax.inject.Inject

/**
 * Repository for `FeedViewModel`
 */
class FeedRepository @Inject constructor(
  private val searchApi: SearchApi
) {

  suspend fun getHotRepos(language: Language): List<Repository> {
    return searchApi.getHotRepos(language, LocalDateTime.now().minusMonths(1))
  }
}