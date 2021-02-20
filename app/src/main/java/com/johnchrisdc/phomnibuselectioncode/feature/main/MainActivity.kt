package com.johnchrisdc.phomnibuselectioncode.feature.main

import com.johnchrisdc.drawer.features.main.DrawerActivity
import com.johnchrisdc.drawer.features.main.model.Article

class MainActivity : DrawerActivity() {

    private val articles = mutableListOf<Article>().apply {
        add(Article(title = "ARTICLE I", summary = "General Provisions", fileName = "article_i.html", identifier = 1))
        add(Article(title = "ARTICLE II", summary = "Election of President and Vice-President", fileName = "article_ii.html", identifier = 2))
        add(Article(title = "ARTICLE III", summary = "Election of Members of the Batasang Pambansa", fileName = "article_iii.html", identifier = 3))
        add(Article(title = "ARTICLE IV", summary = "Election of Local Officials", fileName = "article_iv.html", identifier = 4))
        add(Article(title = "ARTICLE V", summary = "Election of Members of the Regional Assembly of the Autonomous Regions", fileName = "article_v.html", identifier = 5))
        add(Article(title = "ARTICLE VI", summary = "Election of Barangay Officials", fileName = "article_vi.html", identifier = 6))
        add(Article(title = "ARTICLE VII", summary = "The Commission on Elections", fileName = "article_vii.html", identifier = 7))
        add(Article(title = "ARTICLE VIII", summary = "Political Parties", fileName = "article_viii.html", identifier = 8))
        add(Article(title = "ARTICLE IX", summary = "Eligibility of Candidates and Certificate of Candidacy", fileName = "article_xiv.html", identifier = 9))
        add(Article(title = "ARTICLE X", summary = "Campaign and Election Propaganda", fileName = "article_x.html", identifier = 10))
        add(Article(title = "ARTICLE XI", summary = "Electoral Contributions and Expenditures", fileName = "article_xi.html", identifier = 11))
        add(Article(title = "ARTICLE XII", summary = "Registration of Voters", fileName = "article_xii.html", identifier = 12))
        add(Article(title = "ARTICLE XIII", summary = "Precincts and Polling Places", fileName = "article_xiii.html", identifier = 13))
        add(Article(title = "ARTICLE XIV", summary = "Board of Election Inspectors", fileName = "article_xiv.html", identifier = 14))
        add(Article(title = "ARTICLE XV", summary = "Watchers", fileName = "article_xv.html", identifier = 15))
        add(Article(title = "ARTICLE XVI", summary = "Official Ballots and Election Returns", fileName = "article_xvi.html", identifier = 16))
        add(Article(title = "ARTICLE XVII", summary = "Casting of Votes", fileName = "article_xvii.html", identifier = 17))
        add(Article(title = "ARTICLE XVIII", summary = "Counting of Votes", fileName = "article_xviii.html", identifier = 18))
        add(Article(title = "ARTICLE XIX", summary = "Canvass and Proclamation", fileName = "article_xix.html", identifier = 19))
        add(Article(title = "ARTICLE XX", summary = "Pre-proclamation Controversies", fileName = "article_xx.html", identifier = 20))
        add(Article(title = "ARTICLE XXI", summary = "Election Contests", fileName = "article_xxi.html", identifier = 21))
        add(Article(title = "ARTICLE XXII", summary = "Election Offenses", fileName = "article_xxii.html", identifier = 22))
        add(Article(title = "ARTICLE XXIII", summary = "Legal Fees", fileName = "article_xiii.html", identifier = 23))
        add(Article(title = "ARTICLE XXIV", summary = "Transitory Provisions", fileName = "article_xiv.html", identifier = 24))
        add(Article(title = "ARTICLE XXV", summary = "Final Provisions", fileName = "article_xv.html", identifier = 25))
    }

    override fun onDrawerActivityCreated() {
        super.onDrawerActivityCreated()

        setup(
                title = "BATAS PAMBANSA BLG. 881, s. 1985",
                description = "OMNIBUS ELECTION CODE OF THE PHILIPPINES",
                articles = articles
        )
    }

}