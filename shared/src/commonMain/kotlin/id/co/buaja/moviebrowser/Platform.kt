package id.co.buaja.moviebrowser

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform