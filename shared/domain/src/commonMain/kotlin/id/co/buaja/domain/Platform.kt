package id.co.buaja.domain

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform