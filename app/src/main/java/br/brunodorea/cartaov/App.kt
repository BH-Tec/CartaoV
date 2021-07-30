package br.brunodorea.cartaov

import android.app.Application
import br.brunodorea.cartaov.data.AppDatabase
import br.brunodorea.cartaov.data.BusinessCardRepository

class App : Application() {
    val database by lazy { AppDatabase.getDatabase(this) }
    val repository by lazy { BusinessCardRepository(database.businessDao()) }
}