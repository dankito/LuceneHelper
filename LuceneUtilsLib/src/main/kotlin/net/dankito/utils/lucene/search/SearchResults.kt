package net.dankito.utils.lucene.search


open class SearchResults(val totalHits: Long, val hits: List<SearchResult>) {

	open val countRetrievedHits: Int = hits.size


	override fun toString(): String {
		return "$countRetrievedHits (of total $totalHits) hits"
	}

}